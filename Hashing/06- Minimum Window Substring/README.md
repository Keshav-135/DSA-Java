# Minimum Window Substring

---

## Problem

Given two strings `s` and `t`, return the **minimum window substring** of `s` such that every character in `t` (including duplicates) is included in the window.

If no such substring exists, return an empty string `""`.

---

## Approach

- Create a frequency array to store the count of every character in `t`.
- Expand the sliding window using the `right` pointer.
- Decrease the frequency of each visited character.
- Count how many required characters have been matched.
- Once all characters are matched, shrink the window from the left to find the smallest valid window.
- Keep updating the minimum window whenever a smaller valid substring is found.
- Return the smallest valid substring at the end.

---

## Algorithm

1. Store the frequency of every character in `t`.
2. Initialize two pointers (`left` and `right`) for the sliding window.
3. Expand the window by moving the `right` pointer.
4. Decrease the frequency of the current character.
5. Increase the matched count whenever a required character is found.
6. When all characters are matched:
   - Update the minimum window if the current window is smaller.
   - Move the `left` pointer to shrink the window.
   - Restore the frequency of the removed character.
   - Decrease the matched count if a required character is removed.
7. Continue until the entire string is processed.
8. Return the minimum window substring if found; otherwise return an empty string.

---

## Time Complexity

**O(n)**

- Each character is visited at most twice (once by the `right` pointer and once by the `left` pointer).

---

## Space Complexity

**O(1)**

- Uses a fixed-size frequency array of length 128 (constant space).

---

## Pattern Used

- Sliding Window
- Two Pointers
- Frequency Array
