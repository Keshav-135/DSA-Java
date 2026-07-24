# Find First and Last Position of Element in Sorted Array (LeetCode 34)

## Difficulty
**Medium**

## Pattern
**Binary Search**

---

## Problem Statement

Given a sorted array of integers `nums` and a target value `target`, return the starting and ending positions of the target element.

If the target is not present in the array, return `[-1, -1]`.

Your solution must run in **O(log n)** time.

---

## Approach

Instead of performing a linear search, use **Binary Search** twice:

1. Perform the first Binary Search to find the **first occurrence** of the target.
2. Whenever the target is found, store its index and continue searching on the **left half**.
3. Perform the second Binary Search to find the **last occurrence** of the target.
4. Whenever the target is found, store its index and continue searching on the **right half**.
5. Return both indices as the final answer.

This approach satisfies the required **O(log n)** time complexity.

---

## Algorithm

### Find First Occurrence

- Initialize `left`, `right`, and `answer = -1`.
- Perform Binary Search.
- If the target is found:
  - Store the current index.
  - Continue searching towards the left.
- Otherwise, move according to Binary Search rules.

### Find Last Occurrence

- Initialize `left`, `right`, and `answer = -1`.
- Perform Binary Search.
- If the target is found:
  - Store the current index.
  - Continue searching towards the right.
- Otherwise, move according to Binary Search rules.

Finally, return both indices.

---

## Time Complexity

**O(log n)**

- First Binary Search → **O(log n)**
- Second Binary Search → **O(log n)**

Overall complexity remains **O(log n)**.

---

## Space Complexity

**O(1)**

Only a few extra variables are used.

---

## Key Concepts

- Binary Search
- First Occurrence
- Last Occurrence
- Lower Bound
- Upper Bound
- Divide and Conquer
- Sorted Array

---

## What I Learned

- Binary Search can be modified to solve more than just searching problems.
- By slightly changing the search direction after finding the target, we can efficiently find the first and last occurrence.
- This problem strengthened my understanding of Lower Bound and Upper Bound concepts.
- Performing two Binary Searches is still much more efficient than a linear scan.

---

## Interview Takeaways

This is one of the most frequently asked **Binary Search** interview problems.

It helps build a strong understanding of:

- Modified Binary Search
- Searching in Sorted Arrays
- Boundary Searching
- Lower Bound & Upper Bound
- Efficient Search Optimization

Mastering this problem makes advanced Binary Search questions much easier to understand.

---

## Java Solution

See `Solution.java`.
