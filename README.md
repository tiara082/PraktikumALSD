|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020097 |
| Nama | Tiara Febrianie |
| Kelas | TI - 1I |
| Repository | [link](https://github.com/tiara082/PraktikumALSD.git) |

# Java Project for Algorithm and Data Structure

This repository contains solutions for various algorithms and data structure problems in Java. Below is an explanation of the Java files included in the project.

## Files Overview

### 1. **calculateGrade.java**
   **Description**: This file implements a program to calculate the final grade and letter grade of a student based on scores for assignments, quizzes, mid-tests, and final tests.

   **Key Concepts**:
   - User input validation
   - Grade calculation based on weighted averages
   - Conversion from numeric grades to letter grades

   **Explanation**:  
   The program follows these steps:
   1. Input grades for assignment, quiz, mid-test, and final test.
   2. Validate if the grades are within the valid range (0-100).
   3. Calculate the average grade using a weighted formula:
      - 20% for assignment
      - 20% for quiz
      - 30% for mid-test
      - 30% for final test
   4. Convert the final numeric grade to a letter grade using predefined thresholds.
   
   **Output Example**:
     ![Screenshot](img/img1.png)


   
---

### 2. **CalculateIPSemester.java**
**Description**: This file calculates the semester GPA (IP Semester) by converting individual course grades into letter grades, calculating their weight, and computing the weighted average.

**Key Concepts**:
- Grade-to-letter conversion
- GPA calculation based on credit hours (SKS)
- Input validation and error handling

**Explanation**:  
The program executes the following steps:
1. Input grades for various courses.
2. Validate each grade input to ensure it’s within the valid range (0-100).
3. Convert numeric grades into letter grades and corresponding GPA points.
4. Calculate the semester GPA by multiplying the GPA points by the course credit hours (SKS), summing them, and dividing by the total credit hours.

**Output Example**:
     ![Screenshot](img/img1.png)


