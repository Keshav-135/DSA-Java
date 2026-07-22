# Binary Search (LeetCode 704)

## Difficulty
**Easy**

## Pattern
**Binary Search**

---

## Problem Statement

Given a sorted integer array `nums` and an integer `target`, return the index of `target` if it exists in the array. Otherwise, return `-1`.

The array is sorted in ascending order, allowing Binary Search to efficiently locate the target.

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = nums.length - 1`

2. Calculate the middle index using the overflow-safe formula:

   ```
   mid = left + (right - left) / 2
   ```

3. Compare `nums[mid]` with the target:
   - If equal, return the index.
   - If the target is greater, search the right half.
   - Otherwise, search the left half.

4. Continue until `left > right`.

5. If the target is not found, return `-1`.

---

## Algorithm

- Initialize `left` and `right`.
- Repeat while `left <= right`:
  - Find the middle element.
  - Compare it with the target.
  - Discard half of the search space.
- Return `-1` if the target does not exist.

---

## Time Complexity

**O(log n)**

The search space is reduced by half during every iteration.

---

## Space Complexity

**O(1)**

No extra space is used.

---

## Key Concepts

- Binary Search
- Divide and Conquer
- Sorted Array
- Overflow-safe Mid Calculation
- Searching Algorithms

---

## What I Learned

- Binary Search is much more efficient than Linear Search for sorted arrays.
- Every comparison eliminates half of the remaining search space.
- Using the overflow-safe formula:

  ```
  mid = left + (right - left) / 2
  ```

  is considered a best practice in interviews.
- Binary Search is one of the most important algorithms for technical interviews.

---


## Java Solution

See `Solution.java`.
