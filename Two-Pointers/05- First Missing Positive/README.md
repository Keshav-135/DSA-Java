# First Missing Positive
---

## 📌 Problem

Given an unsorted integer array `nums`, return the smallest missing positive integer.

Your solution must run in **O(n)** time and use **O(1)** extra space.

---

## 🔍 Pattern

Index Placement (Cyclic Sort)

---

## 💡 Approach

- Traverse the array and place every positive integer `x` (where `1 ≤ x ≤ n`) at its correct index `x - 1`.
- Continue swapping until every valid number is either in its correct position or cannot be placed.
- After rearranging the array, traverse it again.
- The first index where `nums[i] != i + 1` represents the smallest missing positive number.
- If every element is correctly placed, return `n + 1`.

---

## 📝 Algorithm

1. Traverse the array.
2. While the current number is within the valid range and is not in its correct position:
   - Swap it with the element at its correct index.
3. Traverse the array again.
4. If `nums[i] != i + 1`, return `i + 1`.
5. If all positions are correct, return `n + 1`.

---

## ⏱️ Time Complexity

**O(n)**

Each element is placed at its correct position at most once.

---

## 💾 Space Complexity

**O(1)**

The array is rearranged in-place without using any extra data structure.

---

## 💻 Language

Java

---

## 🎯 Key Learning

- Rearranging elements in-place can eliminate the need for extra memory.
- Index Placement is useful when numbers fall within a fixed range.
- Swapping elements to their correct positions helps achieve both linear time and constant space.
- This is a classic interview problem for testing optimization skills.

---

## 🧩 Pattern Category

Array / Index Placement (Cyclic Sort)

---

## 🏷️ LeetCode

41. First Missing Positive

---

## 📊 Difficulty

🔴 Hard

---

## ✅ Status

✔️ Solved
