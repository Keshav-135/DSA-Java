# Longest Substring Without Repeating Characters

## 📌 Problem

Given a string `s`, find the length of the longest substring without repeating characters.

A substring is a contiguous sequence of characters, and no character should appear more than once in the substring.

---

## 🔍 Pattern

Sliding Window + HashSet

---

## 💡 Approach

- Use a HashSet to store the unique characters present in the current window.
- Maintain two pointers:
  - `left` → Start of the sliding window.
  - `right` → End of the sliding window.
- Expand the window by moving the `right` pointer.
- If a duplicate character is found, shrink the window by removing characters from the left until the duplicate is removed.
- Update the maximum window size during each iteration.

---

## 📝 Algorithm

1. Initialize an empty `HashSet`.
2. Set `left = 0` and `maxLength = 0`.
3. Traverse the string using the `right` pointer.
4. While the current character already exists in the HashSet:
   - Remove the leftmost character from the HashSet.
   - Increment `left`.
5. Add the current character to the HashSet.
6. Update `maxLength`.
7. Return `maxLength`.

---

## ⏱️ Time Complexity

**O(n)**

Each character is added to and removed from the HashSet at most once.

---

## 💾 Space Complexity

**O(min(n, m))**

Where:
- `n` = length of the string
- `m` = size of the character set

In the worst case, the HashSet stores all unique characters in the current window.

---

## 💻 Language

Java

---

## 🎯 Key Learning

- Sliding Window efficiently maintains a valid substring.
- HashSet provides constant-time lookup for duplicate detection.
- Shrinking the window only when necessary leads to an optimal solution.
- This is one of the most important Sliding Window interview problems.

---

## 🧩 Pattern Category

Sliding Window

---

## 🏷️ LeetCode

3. Longest Substring Without Repeating Characters

---

## 📊 Difficulty

🟡 Medium

---

## ✅ Status

✔️ Solved
