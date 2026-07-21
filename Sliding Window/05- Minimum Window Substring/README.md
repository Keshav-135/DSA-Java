# Minimum Window Substring (LeetCode 76)

## Difficulty
**Hard**

## Pattern
**Sliding Window (Variable Size)**

---

## Problem Statement

Given two strings `s` and `t`, return the **minimum window substring** of `s` such that every character in `t` (including duplicates) is present in the window.

If no such substring exists, return an empty string.

---

## Approach

1. Create a frequency array to store the required frequency of each character in `t`.
2. Use two pointers (`left` and `right`) to represent the current sliding window.
3. Expand the window by moving the `right` pointer and decrease the frequency of the current character.
4. Whenever a required character is matched, increase the matched count.
5. Once all characters from `t` are included, the current window becomes valid.
6. Shrink the window from the left while it remains valid to find the smallest possible window.
7. Update the minimum window whenever a smaller valid window is found.
8. Return the smallest valid substring. If no valid window exists, return an empty string.

---

## Algorithm

- Initialize the frequency array using the target string.
- Expand the window one character at a time.
- Track the number of matched characters.
- When all required characters are matched:
  - Update the minimum window if needed.
  - Move the left pointer to minimize the window.
- Continue until the entire string has been processed.

---

## Time Complexity

**O(n)**

Each character is processed at most twice:
- Once while expanding the window.
- Once while shrinking the window.

---

## Space Complexity

**O(1)**

A fixed-size frequency array (ASCII) is used for character counting.

---

## Key Concepts

- Variable Size Sliding Window
- Two Pointers
- Frequency Array
- Character Matching
- Window Expansion & Contraction
- Minimum Valid Window
- Greedy Optimization

---

## What I Learned

- How to solve minimum window problems using the Variable Size Sliding Window pattern.
- How frequency counting helps efficiently track required characters.
- How expanding and shrinking the window at the right time leads to an optimal solution.
- Why maintaining a valid window while minimizing its size is an important interview technique.
- How this problem combines multiple concepts such as Two Pointers, Sliding Window, and Hashing into one optimized solution.

---

## Interview Takeaways

This is one of the most frequently asked **Hard Sliding Window** problems in coding interviews.

It helps build a strong understanding of:

- Sliding Window
- Frequency Counting
- Hashing Concepts
- Window Validation
- String Manipulation
- Optimization Techniques

Mastering this problem makes many other Sliding Window interview questions much easier.

---

## Java Solution

See `Solution.java`.
