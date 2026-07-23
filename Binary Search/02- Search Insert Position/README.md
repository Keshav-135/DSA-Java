# Search Insert Position (LeetCode 35)

## Difficulty
**Easy**

## Pattern
**Binary Search**

---

## Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found.

If the target is not found, return the index where it would be inserted while maintaining the sorted order.

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = nums.length - 1`

2. Perform Binary Search:
   - If `nums[mid] == target`, return `mid`.
   - If `nums[mid] < target`, search in the right half.
   - Otherwise, search in the left half.

3. If the target is not found, the `left` pointer will indicate the correct insertion position.

4. Return `left`.

---

## Algorithm

- Start with the complete array.
- Repeatedly divide the search space into two halves.
- Compare the middle element with the target.
- Narrow down the search range.
- If the target is absent, return the insertion index stored in `left`.

---

## Time Complexity

**O(log n)**

Binary Search eliminates half of the search space in every iteration.

---

## Space Complexity

**O(1)**

No extra space is used.

---

## Key Concepts

- Binary Search
- Sorted Array
- Divide and Conquer
- Overflow-safe Mid Calculation
- Lower Bound Concept

---

## What I Learned

- Binary Search can also determine the correct insertion position when the target is not present.
- The `left` pointer naturally points to the insertion index after the search completes.
- Returning `left` removes the need for additional traversal.
- This problem introduces the concept of **Lower Bound**, which is frequently used in advanced Binary Search problems.

---


## Java Solution

See `Solution.java`.
