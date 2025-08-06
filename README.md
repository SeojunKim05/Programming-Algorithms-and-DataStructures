# 🧠 Java Algorithms & Data Structures Repository

This repository contains a collection of Java programs developed to explore and implement core concepts in **data structures**, **algorithms**, and **performance analysis** using object-oriented design and recursion.

---

## 📁 Project Structure

├── ArrayList/ # Custom array list and file reverse tool

├── Searcher/ # Generic binary search with comparators

├── algorithms/

│ ├── searching/ # Recursive search & selection sort

│ └── sorting/ # Sorting algorithms (iterative & recursive)

├── csc143/

│ ├── PerformanceTest.java # Range-finding algorithms and benchmarking

│ ├── RecursionTest.java # Factorial, sum, power, palindrome (recursion)

│ └── TravelDirectionTest.java # Recursive path-finding directions

---

## ✨ Highlights

### 🔢 ArrayList Implementation (`ArrayList/`)
- Custom-built dynamic array class `ArrayList<E>` mimicking Java’s `ArrayList`.
- Includes basic list operations: `add`, `remove`, `get`, `set`, `contains`, `clear`, and `resize`.
- Additional programs:
  - `ArrayListTest.java`: Demonstrates usage vs Java’s built-in list.
  - `ReverseWordsTest.java`: Reads a file, reverses words and lines, and writes to a new file.

### 🔍 Generic Search Utilities (`Searcher/`)
- Implements binary search using Java’s `Comparator<T>`.
- Includes:
  - `Searcher.java`: Static binary search method using generics.
  - `PrintSearches.java`: Automates testing of multiple search cases.
  - `IntComparer.java` & `StringComparer.java`: Custom comparators for generic types.

### ⚙️ Recursive Algorithms (`algorithms.searching`)
- `binarySearch()`: Recursive implementation.
- `selectionSort()`: Recursive version.
- Emphasis on breaking problems down into base/recursive cases.

### 🔁 Sorting Algorithms (`algorithms.sorting`)
- Iterative and recursive implementations:
  - 🫧 `bubbleSort`
  - 🪛 `insertionSort`
  - 🔍 `selectionSort`
  - 🧬 `mergeSort`
  - ⚡ `quickSort`
- Uses helper methods: `swap`, `merge`, `partition`, etc.

### ⏱️ Performance Benchmarking (`PerformanceTest.java`)
- Compares three different algorithms for calculating the **range** (max - min):
  - `O(n²)` brute-force
  - `O(n²/2)` optimized brute-force
  - `O(n)` single-pass
- Outputs runtime for increasingly large datasets (up to 250 million entries).

### 🔁 Recursion Practice (`RecursionTest.java`)
- Classic recursive problems:
  - `fac(n)` – Factorial
  - `sum(n)` – Recursive summation
  - `pow(x, n)` – Power function
  - `isPalindrome(s)` – Checks for palindromes (with spaces)
- Includes formatted output for demonstration.

### 🧭 Recursive Direction Generator (`TravelDirectionTest.java`)
- Simulates pathfinding in a 2D grid using recursion:
  - `goNorthEast`: From (x, y) to (endX, endY) using "N", "E", and "NE" steps.
  - `goNorthWest`: Uses "N", "W", and "NW" directions.
- Demonstrates how recursion can enumerate all valid paths.

---

## ✅ Skills Practiced

- Object-Oriented Programming (OOP)
- Recursion and Recursive Thinking
- Iterative vs Recursive Algorithm Design
- Sorting and Searching Algorithms
- Time Complexity and Performance Benchmarking
- Generic Programming with Java
- File I/O and String Manipulation
- Comparator Interface and Functional Abstraction

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
Compile all Java files:

javac **/*.java
Run a class:

java csc143.RecursionTest

🔁 Some programs may require setting up input/output files (data/, results/) — make sure those directories exist.

---

## 🤝 Contact

Got feedback or want to collaborate?

📬 [Open an issue](https://github.com/SeojunKim05/Programming-algorithms-and-datastructures/issues)  
💼 [LinkedIn](https://www.linkedin.com/in/seojun-kim-089b7b339)  
📫 Email: kseojun05@gmail.com

---
