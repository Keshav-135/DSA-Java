# Roman to Integer

## Problem

Given a Roman numeral, convert it to an integer.

Roman numerals are represented by seven different symbols:

- I = 1
- V = 5
- X = 10
- L = 50
- C = 100
- D = 500
- M = 1000

Some Roman numerals use subtraction, such as:
- IV = 4
- IX = 9
- XL = 40
- XC = 90
- CD = 400
- CM = 900

## Approach

- Store the value of each Roman numeral in a HashMap.
- Traverse the string from left to right.
- For each character, compare its value with the next character.
- If the current value is smaller than the next value, subtract it from the result.
- Otherwise, add it to the result.
- Return the final integer value.

## Algorithm

1. Create a HashMap to store Roman numeral values.
2. Initialize the result as 0.
3. Traverse the string character by character.
4. Compare the current numeral with the next numeral.
5. If the current value is smaller, subtract it.
6. Otherwise, add it to the result.
7. Return the final result.

## Time Complexity

**O(n)**

where **n** is the length of the Roman numeral string.

## Space Complexity

**O(1)**

The HashMap stores only seven fixed Roman numeral symbols, so the extra space remains constant.

## Language

Java

## Pattern

Hashing

## Status

✅ Solved
