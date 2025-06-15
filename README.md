# ElectricFieldSimulation

Simulates electrical fields visually using JavaFX.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Screenshots](#screenshots)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Running the Application](#running-the-application)
- [Usage](#usage)
- [Customization](#customization)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

**ElectricFieldSimulation** is a Java application that visualizes electric fields using JavaFX. It allows users to interact with point charges and observe resulting fields in real time. This project is intended for educational purposes, making it easier to understand fundamental physics concepts.

## Features

- Interactive JavaFX-based GUI
- Real-time electric field visualization
- Add, move, or remove point charges
- Customizable charge values
- CSS-based UI customization

## Screenshots

*Include screenshots here if available.*

## Project Structure

```
ElectricFieldSimulation/
├── .classpath
├── .project
├── .settings/
├── bin/
├── build.fxbuild
├── README.md
├── src/
│   ├── application/
│   │   ├── ElectricFieldSimulation.java
│   │   └── application.css
│   └── module-info.java
```

**Key Files:**
- `src/application/ElectricFieldSimulation.java`: Main JavaFX application code.
- `src/application/application.css`: Custom styles for the JavaFX UI.
- `src/module-info.java`: Java module definition.

## Getting Started

### Prerequisites

- Java 11 or higher
- JavaFX SDK compatible with your JDK
- IDE (e.g., Eclipse, IntelliJ IDEA, or VS Code)

### Running the Application

1. **Clone the repository:**
   ```sh
   git clone https://github.com/victorhkr/ElectricFieldSimulation.git
   cd ElectricFieldSimulation
   ```

2. **Set up JavaFX:**
   - Download the JavaFX SDK from [https://openjfx.io/](https://openjfx.io/).
   - Configure your IDE to include the JavaFX libraries.

3. **Run the Project:**
   - Open the project in your IDE.
   - Set `ElectricFieldSimulation.java` as the main class.
   - Run the application.

   Or, from the command line:
   ```sh
   javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml src/application/ElectricFieldSimulation.java src/module-info.java
   java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -cp src application.ElectricFieldSimulation
   ```

## Usage

- Launch the application.
- Use the GUI to add and manipulate point charges.
- Observe the real-time updating electric field representation.

## Customization

- **UI Styles:** Edit `src/application/application.css` to change the look and feel.
- **Simulation Logic:** Modify `ElectricFieldSimulation.java` to change field calculations or interactions.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request. For major changes, open an issue first to discuss your proposed changes.

## License

*Specify your license here, e.g., MIT, GPL, etc.*

---
