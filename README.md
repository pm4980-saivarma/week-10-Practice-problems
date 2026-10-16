# Week 10 Practice Problems

Ten standalone Java command-line solutions for the Category C coding problems.
Each problem has its own folder containing the `.java` source and compiled
`.class` file.

## Solutions

| Folder | Program | Description |
| --- | --- | --- |
| `Problem1` | `VowelConsonantCounter` | Counts vowels and consonants in a word. |
| `Problem2` | `WordReverserPalindromeChecker` | Reverses words and checks whether they are palindromes. |
| `Problem3` | `EvenOddCounter` | Counts even and odd integers. |
| `Problem4` | `InPlaceArrayReversal` | Reverses a list of integers in place. |
| `Problem5` | `DigitSumAndNumberReversal` | Calculates an integer's digit sum and reversed value. |
| `Problem6` | `PrimeNumberChecker` | Checks whether each input integer is prime. |
| `Problem7` | `FactorialCalculation` | Calculates factorials, including `0!`. |
| `Problem8` | `StudentGradeAssignment` | Assigns grades based on marks. |
| `Problem9` | `LeapYearDetector` | Determines whether each input year is a leap year. |
| `Problem10` | `StudentResultCardGenerator` | Prints a student's average and grade from three marks. |

## Compile and run

From the repository root, compile and run a program using its folder and class
name. For example:

```text
javac Problem1/VowelConsonantCounter.java
java -cp Problem1 VowelConsonantCounter
```

Each program reads input from standard input. Programs that show multiple
examples accept one input per line; Problem 3 and Problem 4 accept a list of
integers, and Problem 10 accepts one student per line in the format
`Name mark1 mark2 mark3`.
