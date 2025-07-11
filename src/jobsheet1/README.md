|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020097 |
| Nama | Tiara Febrianie |
| Kelas | TI - 1I |
| Repository | [link](https://github.com/tiara082/PraktikumALSD.git) |

# Java Project for Algorithm and Data Structure

This repository contains Java solutions for various algorithm and data structure problems. Below is an overview of the included files and their functionalities.

## Files Overview

### 2.1.1 **calculateGrade.java**
Implements a program to calculate a student's final numeric and letter grade based on assignment, quiz, mid-test, and final test scores.

- **Concepts:** Input validation, weighted average calculation, numeric-to-letter grade conversion.
- **Steps:**
   1. Input grades for assignment, quiz, mid-test, and final test.
   2. Validate grades (0-100).
   3. Calculate weighted average: 20% assignment, 20% quiz, 30% mid-test, 30% final test.
   4. Convert numeric grade to letter grade.
- **Example Output:**  
   ![Screenshot](./lib/img/jobsheet1/1.png)

---

### 2.2.1 **evenNumber.java**
Generates a sequence of numbers based on the last two digits of a student's NIM, skipping certain values and replacing odd numbers with stars.

- **Concepts:** String manipulation, loops, conditional logic, user input.
- **Steps:**
   1. Input NIM and extract last two digits.
   2. If <10, add 10.
   3. Print sequence up to this number:
       - Skip 6 and 10.
       - Print `*` for odd numbers, number for even.
- **Example Output:**  
   ![Screenshot](./lib/img/jobsheet1/2.png)

---

### 2.3.1 **CalculateIPSemester.java**
Calculates semester GPA (IP Semester) by converting course grades to letter grades and computing the weighted average based on credit hours.

- **Concepts:** Grade conversion, GPA calculation, input validation.
- **Steps:**
   1. Input grades for courses.
   2. Validate grades.
   3. Convert to letter grades and GPA points.
   4. Calculate GPA using SKS weights.
- **Example Output:**  
   ![Screenshot](./lib/img/jobsheet1/3.png)

---

### 2.4.1 **RoyalGardenManagement.java**
Manages flower stocks and calculates revenue for Royal Garden branches.

- **Concepts:** 2D arrays, user input, revenue calculation, array manipulation.
- **Steps:**
   1. Input flower prices and stock for four branches.
   2. Calculate total revenue per branch.
   3. Adjust stock for the fourth branch after flower loss.
- **Example Output:**  
   ![Screenshot](./lib/img/jobsheet1/4.1.png)  
   ![Screenshot](./lib/img/jobsheet1/4.2.png)

---

### 3.1 **PlateRecognition.java**
Recognizes city names based on the first character of a vehicle's license plate.

- **Concepts:** String handling, array search, user input.
- **Steps:**
   1. Input first letter of license plate.
   2. Match with predefined city codes.
   3. Print city name or error if not found.
- **Example Output:**  
   ![Screenshot](./lib/img/jobsheet1/5.png)

---

### 3.2 **CubeCalculator.java**
Calculates the volume, surface area, or perimeter of a cube based on user selection.

- **Concepts:** Mathematical calculations, user input, menu-driven logic.
- **Steps:**
   1. Display menu for calculation type.
   2. Input cube side length.
   3. Perform calculation and display result.
- **Example Output:**  
   ![Screenshot](./lib/img/jobsheet1/6.1.png)  
   ![Screenshot](./lib/img/jobsheet1/6.2.png)

---

### 3.3 **CourseScheduler.java**
Helps manage a course schedule, allowing input, display, and search of courses.

- **Concepts:** Data input, menu-driven interaction, search/filtering.
- **Steps:**
   1. Input number and details of courses.
   2. Menu options: view all, by day, by semester, search by name, exit.
   3. Display information based on user selection.
- **Example Output:**  
   ![Screenshot](./lib/img/jobsheet1/7.1.png)  
   ![Screenshot](./lib/img/jobsheet1/7.2.png)  
   ![Screenshot](./lib/img/jobsheet1/7.3.png)  
   ![Screenshot](./lib/img/jobsheet1/7.4.png)
