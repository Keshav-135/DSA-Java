# Maximum Average Subarray I (LeetCode 643)

## Difficulty
Easy

## Pattern
Sliding Window

---

## Problem Statement

Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` that has the maximum average value.

Return the maximum average.

---

## Approach

1. Calculate the sum of the first `k` elements.
2. Store it as the current maximum sum.
3. Slide the window by:
   - Removing the leftmost element.
   - Adding the next element.
4. Update the maximum sum whenever a larger sum is found.
5. Return `maxSum / k`.

---

## Time Complexity

**O(n)**

---

## Space Complexity

**O(1)**

---

## Concepts Learned

- Sliding Window
- Fixed Size Window
- Window Sum Optimization

---

## Java Solution

See `Solution.java`.
