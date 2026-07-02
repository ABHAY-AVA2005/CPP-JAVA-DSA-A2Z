# Validate and Transform Email-Crtprep

### Difficulty: Medium

## Description

You are given a string S representing an email address.

Your task is to perform multiple operations:

Validate the email based on rules:
Must contain exactly one @
Must contain at least one . after @
Username (before @) must be at least 3 characters long
Domain name (between @ and .) must contain only lowercase letters

If the email is invalid, print:
Invalid Email

If the email is valid, perform the following:
Extract username
Count digits in username
Convert domain name to uppercase
Print output in format:
<username> <digit_count> <DOMAIN_IN_UPPERCASE>


Input Format

A single string S representing an email

Constraints

Email Id

Output Format

If invalid → print "Invalid Email" If valid → print: username digitCount DOMAIN

Sample Input 0

chary123@gmail.com


Sample Output 0

chary123 3 GMAIL


Sample Input 1

ab@yahoo.com


Sample Output 1

Invalid Email

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
Validate the email based on rules::
Must contain exactly one @
Must contain at least one . after @
Username (before @) must be at least 3 characters long
Domain name (between @ and .) must contain only lowercase letters

If the email is invalid, print::
Invalid Email

If the email is valid, perform the following::
Extract username
Count digits in username
Convert domain name to uppercase
Print output in format:
<username> <digit_count> <DOMAIN_IN_UPPERCASE>

chary123@gmail.com

chary123 3 GMAIL

ab@yahoo.com

Invalid Email

Success
```