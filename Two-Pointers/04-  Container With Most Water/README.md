# Container With Most Water (LeetCode 11)

## Difficulty
Medium

## Pattern
Two Pointers

---

## Problem Statement

You are given an integer array `height` where each element represents the height of a vertical line.

Find two lines that together with the x-axis form a container capable of holding the maximum amount of water.

Return the maximum amount of water that can be stored.

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = height.length - 1`

2. Calculate:
   - Width = right - left
   - Height = minimum of both heights
   - Area = width × height

3. Update the maximum area.

4. Move the pointer pointing to the shorter line because moving the taller line cannot increase the area.

5. Repeat until both pointers meet.

---

## Time Complexity

**O(n)**

Only one traversal of the array is required.

---

## Space Complexity

**O(1)**

No extra space is used.

---

## Concepts Learned

- Two Pointers
- Greedy Observation
- Array Traversal
- Optimization Technique

---

## Java Solution

See `Solution.java`.
