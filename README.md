# Design Patterns and Astronaut Schedule Project

## Overall Structure
- 7 tasks organized into packages:
  - Creation Design Patterns
  - Behavioral Design Patterns
  - Structural Design Patterns
  - Astronaut Schedule mini-project

---

## Package 1: Creation Design Patterns
- **Singleton Pattern:**
  - Ensures a class has only one instance.
  - Provides a global point of access.
  - **Example:** 
    - `PostManager` class that retrieves and updates posts for users in an Instagram database or cloud.
  
- **Prototype Pattern:**
  - Creates objects by copying an existing object (prototype).
  - **Example:** 
    - Cloning existing Microsoft Teams to create new teams, saving computation.

---

## Package 2: Behavioral Design Patterns
- **Observer Pattern:**
  - Defines a one-to-many dependency between objects.
  - Changes in one object automatically notify all dependents.
  - **Example:** 
    - Subscribers in the YouTube app receive notifications about new videos from subscribed channels.

- **Memento Pattern:**
  - Captures and restores the internal state of an object.
  - Maintains encapsulation.
  - **Example:** 
    - Student online practice platform saves snapshots of daily work.

---

## Package 3: Structural Design Patterns
- **Decorator Pattern:**
  - Allows adding behavior to individual objects dynamically.
  - Does not affect other objects of the same class.
  - **Example:** 
    - Adding new styles and extensions to the Chrome web browser.

- **Composite Pattern:**
  - Lets clients treat individual objects and compositions uniformly.
  - **Example:** 
    - Creating a hierarchy of objects for implementation in a game like Cricket07, where there are many leaf and composite objects.

---

## Package 4: Astronaut Daily Schedule Organizer
### Project Overview
- Console-based application for astronauts to organize daily schedules.
  
### Functional Requirements
- **Mandatory Features:**
  - **Add Task:** Create tasks with a description, start time, end time, and priority level.
  - **Remove Task:** Delete tasks from the schedule.
  - **View Tasks:** Display all tasks sorted by start time.
  - **Task Overlap Validation:** Ensure tasks do not overlap.
  - **Error Handling:** Provide meaningful error messages for invalid operations.
    
- **Optional Features:**
  - **Edit Task:** Modify details of an existing task.
  - **Filter by Priority:** View tasks filtered by priority level.

### Non-Functional Requirements
- **Exception Handling:** Handle errors gracefully.
- **Performance:** Ensure efficient task management and validation.
- **Logging:** Implement logging to track user actions and errors.

### Design Patterns Used
- **Singleton Pattern:** Ensures only one instance of `ScheduleManager` exists.
- **Factory Pattern:** Efficient and flexible task object creation.
- **Observer Pattern:** Notifies users of task conflicts or updates.

### Design Principles
- **Single Responsibility Principle:** Each class has a single responsibility.
- **Dependency Inversion Principle:** High-level modules do not depend on low-level modules but on abstractions.
