# Student-Record-Manager
Overview
-----------------------------------------
The Student Record Manager is a simple Java console application designed to manage and update student records. This project demonstrates fundamental object-oriented programming concepts in Java, including class creation, object manipulation, and user input handling. It was developed as part of a COMP SCI 221 course to reinforce these core principles.
 
The application allows users to create student objects, update their information, and print their details, including the GPA, based on the student’s credits and grades. The program follows a structured menu-based approach to let users easily interact with the system.

Features
-----------------------------------------
  - Create Student: Users can create a new student by providing basic details such as ID, first name, last name, total grade points, and total credits.
  - Update Student: Users can update the student's record by adding new courses, including the number of credits and the letter grade earned.
  - Print Student: Displays the student’s details, including ID, full name, total credits, and current GPA.
  - Menu-Based Navigation: Users can interact with the program through a simple menu, allowing them to choose between updating, printing, or exiting the application.

How It Works?
-----------------------------------------
  - Prog5: The driver class that handles the main application logic, including menu navigation, input handling, and calling the appropriate methods.
  - MyStudent: A class that represents a student, holding properties like ID, name, grade points, and credits. It also includes methods to calculate GPA and update the student’s records when new grades are added.

GPA Calculation
-----------------------------------------
The GPA is calculated based on the total grade points and credits. The program supports standard letter grades with associated grade points (e.g., A = 4.0, B = 3.0, etc.), including “+” and “-” grades (e.g., B+ = 3.33).
