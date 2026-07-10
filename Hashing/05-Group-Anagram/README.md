# Group Anagrams
---
## Problem

Given an array of strings `strs`, group the anagrams together.

Anagrams are words or strings that contain the same characters with the same frequencies but in a different order.
---
## Approach

- Create a HashMap where:
  - Key = Sorted version of the string.
  - Value = List of strings having the same sorted form.
- Traverse each string in the array.
- Convert the string into a character array.
- Sort the character array.
- Create a new string from the sorted characters to use as the key.
- If the key does not exist, create a new list.
- Add the original string to the corresponding list.
- Return all grouped anagrams.
---
## Algorithm

1. Create a HashMap.
2. Traverse each string in the input array.
3. Convert the string to a character array.
4. Sort the character array.
5. Convert the sorted array back into a string.
6. Use the sorted string as the key in the HashMap.
7. Add the original string to the corresponding list.
8. Return all values of the HashMap.
---
## Time Complexity

**O(n × k log k)**

- **n** = Number of strings
- **k** = Average length of each string

Sorting each string takes **O(k log k)**.
---
## Space Complexity

**O(n × k)**

The HashMap stores all strings grouped by their sorted representation.
---
## Language

Java
---
## Pattern

Hashing
---
## Status

✅ Solved
