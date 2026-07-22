# 🔍 Binary Search
---
This folder contains LeetCode problems based on the Binary Search pattern.
---
## 📖 Overview

Binary Search is an efficient searching algorithm used to find the position of a target element in a **sorted array**. Instead of checking every element one by one, it repeatedly divides the search space into two halves, making it much faster than Linear Search.

---

## 🚀 Why Use Binary Search?

* Faster searching in sorted data.
* Reduces the search space by half in every iteration.
* Commonly asked in coding interviews.
* Forms the foundation for many advanced DSA problems.

---

## ⚙️ Prerequisites

Before applying Binary Search, make sure:

* The array is **sorted** (ascending or descending).
* Random access to elements is available (arrays work best).

---

## 🧠 Algorithm

1. Initialize two pointers:

   * `left = 0`
   * `right = n - 1`
2. Find the middle index:

   ```java
   mid = left + (right - left) / 2;
   ```
3. Compare the middle element with the target:

   * If equal → Return the index.
   * If target is greater → Search the right half.
   * If target is smaller → Search the left half.
4. Repeat until the target is found or the search space becomes empty.

---

## 📊 Time & Space Complexity

| Operation                    | Complexity |
| ---------------------------- | ---------- |
| Best Case                    | O(1)       |
| Average Case                 | O(log n)   |
| Worst Case                   | O(log n)   |
| Space Complexity (Iterative) | O(1)       |
| Space Complexity (Recursive) | O(log n)   |

---

