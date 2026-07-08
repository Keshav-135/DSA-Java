# Contains Duplicate

## Problem
Given an integer array `nums`, return `true` if any value appears at least twice in the array; otherwise, return `false`.

## Approach
- Use a HashSet to store the numbers.
- Traverse the array.
- If the current number already exists in the HashSet, return `true`.
- Otherwise, add the current number to the HashSet.
- If the loop finishes without finding duplicates, return `false`.

## Algorithm
1. Create a HashSet.
2. Traverse the array.
3. Check whether the current number already exists.
4. If it exists, return `true`.
5. Otherwise, add the current number to the HashSet.
6. Return `false` if no duplicates are found.

## Time Complexity
**O(n)**

## Space Complexity
**O(n)**

## Language
Java

## Pattern
Hashing

## Status
✅ Solved
