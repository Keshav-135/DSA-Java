# Boats to Save People

## 📌 Problem

You are given an integer array `people` where `people[i]` represents the weight of the i-th person, and an integer `limit` representing the maximum weight a boat can carry.

Each boat can carry at most **two people**, provided their combined weight does not exceed the limit.

Return the **minimum number of boats** required to rescue everyone.

---

## 🔍 Pattern

Two Pointers + Greedy

---

## 💡 Approach

- Sort the `people` array in ascending order.
- Use two pointers:
  - `left` → Lightest person.
  - `right` → Heaviest person.
- If the lightest and heaviest person can share a boat, move both pointers.
- Otherwise, send the heaviest person alone.
- Count one boat for every iteration until everyone is assigned.

---

## 📝 Algorithm

1. Sort the array.
2. Initialize:
   - `left = 0`
   - `right = people.length - 1`
   - `boats = 0`
3. While `left <= right`:
   - If `people[left] + people[right] <= limit`, increment `left`.
   - Decrement `right`.
   - Increment `boats`.
4. Return `boats`.

---

## ⏱️ Time Complexity

**O(n log n)**

- Sorting takes **O(n log n)**.
- Two Pointer traversal takes **O(n)**.

Overall Time Complexity: **O(n log n)**

---

## 💾 Space Complexity

**O(1)**

Only constant extra space is used (excluding the sorting algorithm's internal space).

---

## 💻 Language

Java

---

## 🎯 Key Learning

- Sorting helps pair the lightest and heaviest people efficiently.
- Two Pointers reduce unnecessary comparisons.
- Greedy ensures the heaviest person is always assigned optimally.
- Combining Greedy with Two Pointers is a common interview technique.

---

## 🧩 Pattern Category

Two Pointers

---

## 🏷️ LeetCode

881. Boats to Save People

---

## 📊 Difficulty

🟡 Medium

---

## ✅ Status

✔️ Solved
