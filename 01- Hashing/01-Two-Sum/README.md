# Two Sum

## Problem
Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

## Approach
- Store visited numbers and their indices in a HashMap.
- For each number, calculate `target - currentNumber`.
- If the complement exists in the map, return both indices.
- Otherwise, store the current element in the map.

## Algorithm
1. Create a HashMap.
2. Traverse the array.
3. Check if the complement exists.
4. If yes, return the answer.
5. Otherwise, store the current element.

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
