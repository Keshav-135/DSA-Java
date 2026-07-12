# Remove Duplicates from Sorted Array

## 📌 Problem

Given a sorted integer array `nums`, remove the duplicates in-place such that each unique element appears only once.

Return the number of unique elements (`k`). The first `k` elements of the array should contain the unique values in their original order.

---

## 🔍 Pattern

Two Pointers (Fast & Slow)

---

## 💡 Approach

Since the array is already sorted, duplicate elements appear next to each other.

- Use two pointers:
  - `i` (Slow Pointer): Tracks the position of the last unique element.
  - `j` (Fast Pointer): Traverses the array to find the next unique element.
- Whenever `nums[i] != nums[j]`, move the slow pointer one step ahead and copy the current unique element.
- Continue until the end of the array.
- Return `i + 1`, which represents the number of unique elements.

---

## 📝 Algorithm

1. Initialize `i = 0`.
2. Traverse the array using `j` from index `1`.
3. Compare `nums[i]` and `nums[j]`.
4. If they are different:
   - Increment `i`.
   - Copy `nums[j]` to `nums[i]`.
5. Continue until the end of the array.
6. Return `i + 1`.

---

## ⏱️ Time Complexity

**O(n)**

Each element is visited exactly once.

---

## 💾 Space Complexity

**O(1)**

The array is modified in-place without using any extra space.

---

## 💻 Language

Java

---

## 🎯 Key Learning

- Fast Pointer scans the array.
- Slow Pointer stores only unique elements.
- Since the array is sorted, duplicates can be removed in a single traversal.
- In-place modification reduces memory usage.

---

## 🧩 Pattern Category

Two Pointers

---

## 🏷️ LeetCode

26. Remove Duplicates from Sorted Array

---

## 📊 Difficulty

🟢 Easy

---

## ✅ Status

✔️ Solved
