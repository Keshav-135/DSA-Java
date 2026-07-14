# Merge Sorted Array

## 📌 Problem

You are given two sorted integer arrays `nums1` and `nums2`, along with two integers `m` and `n` representing the number of valid elements in each array.

Merge `nums2` into `nums1` as one sorted array.

The final sorted array should be stored inside `nums1`, which has enough extra space to hold all elements from both arrays.

---

## 🔍 Pattern

Two Pointers

---

## 💡 Approach

Instead of merging from the beginning, start from the **last valid element** of both arrays.

- `i` points to the last valid element in `nums1`.
- `j` points to the last element in `nums2`.
- `k` points to the last position of `nums1`.

Compare `nums1[i]` and `nums2[j]`.

- If `nums1[i]` is larger, place it at `nums1[k]`.
- Otherwise, place `nums2[j]` at `nums1[k]`.

Move the corresponding pointers backward after every placement.

After one array is exhausted, copy the remaining elements of `nums2` into `nums1`.

---

## 📝 Algorithm

1. Initialize:
   - `i = m - 1`
   - `j = n - 1`
   - `k = m + n - 1`
2. Compare `nums1[i]` and `nums2[j]`.
3. Place the larger element at `nums1[k]`.
4. Decrease the corresponding pointer and `k`.
5. Repeat until either array is exhausted.
6. Copy the remaining elements of `nums2` (if any).
7. The merged sorted array is stored in `nums1`.

---

## ⏱️ Time Complexity

**O(m + n)**

Each element from both arrays is processed exactly once.

---

## 💾 Space Complexity

**O(1)**

The merge is performed in-place without using any extra array.

---

## 💻 Language

**Java**

---

## 🎯 Key Learning

- Two Pointers efficiently merge two sorted arrays.
- Merging from the end prevents overwriting the valid elements of `nums1`.
- In-place merging achieves constant extra space.
- This technique is commonly used in merge-based interview problems.

---

## 🧩 Pattern Category

Two Pointers

---

## 🏷️ LeetCode

88. Merge Sorted Array

---

## 📊 Difficulty

🟢 Easy

---

## ✅ Status

✔️ Solved
