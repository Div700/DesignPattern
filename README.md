Design Patterns and Astronaut Schedule Project

The 7 tasks assigned to us is structured in the following ways:

Creation Design Pattern - Contains two implementations of creation patterns. 
Behavioral Design Pattern - Contains two implementations of behavioral patterns.
Structural Design Pattern - Contains two implementations of structural patterns.
Astronaut Schedule - A mini-project that manages the scheduling of astronauts for missions.

Package 1: Creation Design Patterns
This package implements two common creation design patterns:

Singleton Pattern:
The singleton pattern ensures that a class has only one instance and provides a global point of access to it.
Example: Implementing a PostManager class that is instantiated only once to retireive all the possts and update the posts for each user in the instagram database or cloud.

Prototype Pattern:
The prototype pattern creates objects by copying an existing object (a prototype) instead of creating new instances from scratch.
Example: Creating clones of a existing microsoft teams for creating new teams, saving computation.

Package 2: Behavioral Design Patterns
This package includes implementations of two behavioral design patterns:

Observer Pattern:
The observer pattern defines a one-to-many dependency between objects, where one object changes state and all dependents are notified automatically.
Example: Subsribers in the youtube app get notifications regarding new videos on their subsribed channel.

Memento Pattern:
The memento pattern is used to capture and restore the internal state of an object without violating encapsulation.
Example: Student online practice platform where snapshots of everyday work of the student is saved

Package 3: Structural Design Patterns
This package contains two implementations of structural design patterns:

Decorator Pattern:
The decorator pattern allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.
Example: Adding new styles and extensions to the chrome web browser.

Composite Pattern:
The composite pattern lets clients treat individual objects and compositions of objects uniformly.
Example: Making hierarchy of objects for implementation in a game like cricket07, where there are many leaf and composite objects

Package 4 : 
This is the mini project on the topic : Astronaut Daily Schedule Organizer Programming Exercise

Project Overview
This console-based application helps astronauts organize their daily schedules. It allows users to manage tasks by adding, removing, viewing, and editing them. The system ensures that tasks do not overlap and provides error messages for invalid operations. It also supports prioritizing tasks and marking them as completed.

Functional Requirements: 

Mandatory Features
Add Task: Create tasks with a description, start time, end time, and priority level.
Remove Task: Delete tasks from the schedule.
View Tasks: Display all tasks sorted by start time.
Task Overlap Validation: Ensure tasks do not overlap.
Error Handling: Provide meaningful error messages for invalid operations.

Optional Features
Edit Task: Modify an existing task's details.
Filter by Priority: View tasks filtered by priority level.

Non-Functional Requirements
Exception Handling: Handle errors gracefully.
Performance: Ensure efficient task management and validation.
Logging: Implement logging to track user actions and errors.

Design Patterns Used
Singleton Pattern: Ensures that only one instance of the ScheduleManager exists throughout the application.
Factory Pattern: Used to create task objects efficiently and flexibly.
Observer Pattern: Notifies users of task conflicts or updates to the schedule.

Also the concept of single resposibility and dependency inversion has been maintained
