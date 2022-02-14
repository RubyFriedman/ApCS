import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();

  private static final String SPACE = " ";

  static {
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while (input.hasNextLine()) {
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0], Double.parseDouble(temp[1]));
        // System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    } catch (Exception e) {
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }

    // read in the positive adjectives in postiveAdjectives.txt
    try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while (input.hasNextLine()) {
        String temp = input.nextLine().trim();
        // System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    } catch (Exception e) {
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }

    // read in the negative adjectives in negativeAdjectives.txt
    try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while (input.hasNextLine()) {
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    } catch (Exception e) {
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }
  }

  /**
   * @returns a string containing all of the text in fileName (including
   *          punctuation),
   *          with words separated by a single space
   */
  public static String textToString(String fileName) {
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));

      // add 'words' in the file to the string, separated by a single space
      while (input.hasNext()) {
        temp = temp + input.next() + " ";
      }
      input.close();

    } catch (Exception e) {
      System.out.println("Unable to locate " + fileName);
    }
    // make sure to remove any additional space that may have been added at the end
    // of the string.
    return temp.trim();
  }

  /**
   * @returns the sentiment value of word as a number between -1 (very negative)
   *          to 1 (very positive sentiment)
   */
  public static double sentimentVal(String word) {
    try {
      return sentiment.get(word.toLowerCase());
    } catch (Exception e) {
      return 0;
    }
  }

  /**
   * Returns the ending punctuation of a string, or the empty string if there is
   * none
   */
  public static String getPunctuation(String word) {
    String punc = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      if (!Character.isLetterOrDigit(word.charAt(i))) {
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

  /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation(String word) {
    while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
      word = word.substring(1);
    }
    while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
      word = word.substring(0, word.length() - 1);
    }

    return word;
  }

  /**
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and
   * returns it.
   */
  public static String randomPositiveAdj() {
    int index = (int) (Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }

  /**
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and
   * returns it.
   */
  public static String randomNegativeAdj() {
    int index = (int) (Math.random() * negAdjectives.size());
    return negAdjectives.get(index);

  }

  /**
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective() {
    boolean positive = Math.random() < .5;
    if (positive) {
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  /*
   * @returns sentiment value of a review
   */
  public static double totalSentiment(String fileName) {
    double val = 0;
    String fileStr = textToString(fileName);
    int lastSpace = 0;
    String currWord = "";
    for (int i = 0; i < fileStr.length(); i++) {
      if (fileStr.substring(i, i + 1).equals(SPACE)) {
        currWord = fileStr.substring(lastSpace, i);
        lastSpace = i;
        currWord = removePunctuation(currWord);
        val += sentimentVal(currWord);
        currWord = "";
      }
      if (i == fileStr.length() - 1) {
        currWord = fileStr.substring(lastSpace, i);
        currWord = removePunctuation(currWord);
        val += sentimentVal(currWord);
      }
    }
    return val;
  }

  public static int starRating(String fileName) {
    double val = totalSentiment(fileName);
    if (val < 0) {
      return 1;
    } else if (val < 7) {
      return 2;
    } else if (val < 15) {
      return 3;
    } else if (val < 30) {
      return 4;
    } else {
      return 5;
    }
  }

  public static void adjExtractor(String readName) {
    String input = textToString(readName);
    input += " ";
    int i = 0;
    int nextSpace;
    String pos = "";
    String neg = "";

    while (input.indexOf("*") >= 0) {
      i = input.indexOf("*");
      input = input.substring(i);
      nextSpace = input.indexOf(" ");
      String word = input.substring(1, nextSpace);
      input = input.substring(nextSpace);
      word = removePunctuation(word);
      if (sentimentVal(word) > 0) {
        pos += word;
        pos += "\n";
      } else {
        neg += word;
        neg += "\n";
      }

    }
    try {
      FileWriter filePos = new FileWriter("positiveAdjectives.txt");
      String currPos = textToString("positiveAdjectives.txt");
      filePos.write(currPos + pos);
      filePos.close();
      FileWriter fileNeg = new FileWriter("negativeAdjectives.txt");
      String currNeg = textToString("negativeAdjectives.txt");
      fileNeg.write(currNeg + neg);
      fileNeg.close();
    } catch (IOException e) {
      System.out.println("error");
      e.printStackTrace();
    }
  }

  public static String fakeReview(String fileName) {
    String input = "";
    input += textToString(fileName);
    input += " ";
    String result = "";
    int lastSpace = 0;
    ArrayList<String> words = new ArrayList<String>();
    for (int i = 0; i < input.length(); ++i) {
      if (input.substring(i, i + 1).equals(" ")) {
        words.add(input.substring(lastSpace, i));
        lastSpace = i;
      }
    }
    words.set(0, " " + words.get(0));
    for (int i = 0; i < words.size(); i++) {
      String word = words.get(i);
      if (word.substring(1, 2).equals("*")) {
        if(sentimentVal(removePunctuation(word)) > 0) {
          words.set(i, " " + randomPositiveAdj());
        } else {
          words.set(i, " " + randomNegativeAdj());
        }
      }
    }
    for (String wor : words) {
      result += wor;
    }
    return result;
  }

  public static void main(String[] args) {
    // sentimentVal(5);
    /*
     * System.out.println(sentimentVal("happily"));
     * System.out.println(sentimentVal("terrible"));
     * System.out.println(sentimentVal("cold"));
     * System.out.println(sentimentVal("summer"));
     * System.out.println(sentimentVal("winter"));
     * System.out.println(totalSentiment("tester.txt"));
     * System.out.println(starRating("tester.txt"));
     * System.out.println(sentimentVal("definitely"));
     * adjExtractor("tester.txt");
     */
    System.out.println(fakeReview("tester.txt"));
  }
}
