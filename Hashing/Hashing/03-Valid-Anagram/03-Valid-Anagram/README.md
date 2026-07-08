# Valid Anagram

## Problem
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, otherwise return `false`.

## Approach
- First, check if both strings have the same length.
- Use a HashMap to count the frequency of each character in the first string.
- Traverse the second string and decrease the frequency of each character.
- If any character is missing or its frequency becomes invalid, return `false`.
- If all frequencies are matched, return `true`.

## Algorithm
1. Check if both strings have the same length.
2. Create a HashMap to store character frequencies.
3. Count the frequency of each character in the first string.
4. Traverse the second string and decrease the frequency.
5. Return `true` if all frequencies match; otherwise return `false`.

## Time Complexity
**O(n)**

## Space Complexity
**O(n)**

## Language
**Java**

## Pattern
**Hashing**

## Status
✅ Solved
