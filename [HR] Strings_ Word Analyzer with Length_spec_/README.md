# Strings: Word Analyzer with Length(spec)

### Difficulty: Medium

## Description

You are given a sentence as input. Your task is to split the sentence into individual words and display each word along with its index and length.

The words are separated by a single space.

For every word in the sentence, print the output in the following format:

w[index]: word : length

Where:

index → position of the word (starting from 0)
word → actual word from the sentence
length → number of characters in the word


Input Format

A single line containing a string S

Constraints

1 ≤ length of string ≤ 10⁵ String contains only alphabets and spaces Words are separated by exactly one space

Output Format

Print each word in a new line following the required format

Sample Input 0

Hello World


Sample Output 0

w[0]: Hello : 5
w[1]: World : 5


Sample Input 1

Java is powerful


Sample Output 1

w[0]: Java : 4
w[1]: is : 2
w[2]: powerful : 8

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
index → position of the word (starting from 0)
word → actual word from the sentence
length → number of characters in the word

Hello World

w[0]: Hello : 5
w[1]: World : 5

Java is powerful

w[0]: Java : 4
w[1]: is : 2
w[2]: powerful : 8

Hello World{-truncated-}

w[0]: Hello : 5

w[1]: World : 5

w[0]: Hello : 5

w[1]: World : 5
```