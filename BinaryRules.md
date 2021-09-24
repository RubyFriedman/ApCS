TNPG: JAR (Ruby Friedman, Ariel Fuchs, Joshua Gao)

APCS

HW 03 -- Codify the Revisions

2021-09-24

0. "Base" in "Base X number system" signifies the number of unique possible values in a specific counting system. For example, in Base 6 the numbers 0-5 inclusive represent all possible number cominbations. Thusly, 10524 would be a valid number in base6, however 56123 would NOT be a valid number in base6.
1. Binary is a base2 number system that is universally used to represent a value ( examples: 1, true, on) and its negation or the oppisite value (examples: 0, false, off). Binary is usually expressed in 1s and 0s and we in computing care because binary is the simpliest base to compute and preform opperations in. 

2. Each digit in binary represents a corresponding power of 2. Starting from the rightmost side of the given binary number assign the first digit to the right the power 2^0, the one directly to the right 2^1, after that 2^2, and so on so that each digit from the right most side has a power of 2 assigned to it until there are no digits remaining that must be assigned. Now that each digit is assigned to a power of 2, multiply each 1 or 0 starting from the right side by their correspoding power of 2. After each 1 and 0 has been multiplied by its corresponding power of 2, add all the resulting products. An example of this process is shown below:
1101 ->  1    1    0    1  -> (1 * 2^3), (1*2^2), (0*2^1), (1 *2^0) -> 8 + 4 + 0 + 1 -> 13
        2^3  2^2  2^1  2^0

3. Find the greatest exponent of 2 that is less than or equal to than the given base 10 number. After finding the highest possible power of 2 that is less than or equal to the base 10 number, put a 1 to the left, and follow it by a certain number of zeros. To determine how many zeros to add to the end of the one, simply take that highest power of 2 from before, take its exponent and subract 1, thats the number of zeros you should put on the end. Afterwards, subtract the power of 2 from the base10 number. Now find the next highest power of 2 and replace the 0 corresponding to its power of 2 to a 1 (see the assignments for powers of 2 to know which 0 to replace). Repeat this until there is no remainer left.
