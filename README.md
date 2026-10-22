[README(1).md](https://github.com/user-attachments/files/33842739/README.1.md)
# PROG209 – Event Driven Programming Assignment

## Basic Interactive GUI Using Java Swing

**Student:** Emmanuel Kai Foyoh  
**Institution:** Limkokwing University of Creative Technology, Sierra Leone  
**Department:** Information & Communications Technology  
**Module:** PROG209 – Event Driven Programming  
**Assignment:** Individual Assignment 1 – Basic Interactive GUI

## Project Overview

This project is a basic interactive desktop application developed with **Java Swing**. It demonstrates fundamental event-driven programming and object-oriented programming concepts, including GUI components, inheritance, constructors, and event listeners.

The application opens a window titled **Java Swing Assignment** and displays the welcome message:

> Welcome to Java Swing First Individual Assignment by Emmanuel Kai Foyoh

Users can interact with two buttons to change the welcome text or the panel's background colour.

## Features

- **JFrame:** Creates the main application window, sized **800 × 800 pixels**.
- **JPanel:** Holds the GUI components and provides a changeable background.
- **JLabel:** Displays the welcome message and updated text.
- **JButton:** Provides **Change Text** and **Change Background** controls.
- **ActionListener:** Handles button-click events.
- **ImageIcon:** Loads a custom application icon (`app_icon.png`).
- **Inheritance:** The `SwingAssignment` class extends `JFrame`.
- **Constructor:** Initializes the interface and its components.
- **Window closing:** Exits the application when the close button is clicked.

## Technologies Used

- Java (JDK)
- Java Swing and AWT
- Visual Studio Code or IntelliJ IDEA
- Figma (GUI wireframe)
- Git and GitHub

## Suggested Project Structure

```text
PROG209-Swing-Assignment/
├── src/
│   └── SwingAssignment.java
├── resources/
│   └── app_icon.png
├── README.md
└── screenshots/                 # Optional: add your real screenshots here
```

## How to Run

1. Install a Java Development Kit (JDK), preferably version 17 or later.
2. Clone or download this repository.
3. Open the project folder in VS Code or IntelliJ IDEA.
4. Open a terminal **in the project root**.
5. Compile the Java source file:

   ```bash
   javac -d . src/SwingAssignment.java
   ```

6. Run the application with the `resources` folder on the classpath:

   **Windows PowerShell / Command Prompt:**
   ```powershell
   java -cp ".;resources" SwingAssignment
   ```

   **macOS / Linux:**
   ```bash
   java -cp ".:resources" SwingAssignment
   ```

> **Note:** The `resources` folder must contain `app_icon.png` for the window icon to appear. If your project uses a different folder structure, adjust the paths accordingly.

## How to Use the Application

1. Launch the program to view the initial welcome message.
2. Click **Change Text** to update the `JLabel` message.
3. Click **Change Background** to apply a randomly generated colour to the `JPanel`.
4. Click the window's **X** button to close the application.

## Screenshots

Add actual screenshots after running and testing the program:

1. Figma GUI wireframe
2. Java source code in VS Code or IntelliJ IDEA
3. Initial application window
4. Application after clicking **Change Text**
5. Application after clicking **Change Background**
6. Project folder structure
7. GitHub repository showing uploaded files

*Screenshots are not included in this README until they have been captured and added to the repository.*

## Assignment Requirements Covered

| Requirement | Implementation |
|---|---|
| JFrame | Main window titled `Java Swing Assignment` (800 × 800) |
| JPanel | Container with changeable background |
| JLabel | Welcome message with student's name |
| ImageIcon | Custom window icon |
| Inheritance | `SwingAssignment extends JFrame` |
| Constructor | `SwingAssignment()` initializes the GUI |
| Event-driven interaction | Button click listeners change text and background |
| Wireframe | Designed separately using Figma |
| Documentation and GitHub | README and repository files |

## Author

**Emmanuel Kai Foyoh**  
PROG209 – Event Driven Programming  
Limkokwing University of Creative Technology, Sierra Leone

## Academic Note

This project was prepared for educational purposes as part of the PROG209 individual assignment. The repository should contain the student's actual source code, original icon, wireframe, and genuine testing screenshots before final submission.
