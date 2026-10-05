# 🧮 Simple Calculator - Java Web Application (CI/CD)

> **CI/CD Pipeline Demo Repository for Class Review**  
> **Target Server**: Apache Tomcat 10.1 (`calculator-web-app.war`)  
> **Automation Engine**: Jenkins LTS CI/CD Pipeline

---

## 📌 Project Overview
A Java Jakarta Web Application featuring basic arithmetic operations (Addition, Subtraction, Multiplication, Division) with automated JUnit 5 tests, Maven build lifecycle, and Tomcat auto-deployment.

- **Artifact**: `calculator-web-app.war`
- **Supported Operations**: `+`, `-`, `*`, `/`
- **Unit Testing**: JUnit 5 Jupiter (4 Automated Unit Tests)
- **Deployment URL**: `http://localhost:9090/calculator-web-app/`

---

## 🛠️ Jenkins CI/CD Build Progression (4 Commits)

```
┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐
│     Build #1    │ ──> │     Build #2    │ ──> │     Build #3    │ ──> │     Build #4    │
│  Initial Commit │     │   Subtraction   │     │ Multiply/Divide │     │ Release v1.0.0  │
│  Addition (1 T) │     │    (2 Tests)    │     │    (4 Tests)    │     │ Tomcat Deployed │
└─────────────────┘     └─────────────────┘     └─────────────────┘     └─────────────────┘
```

---

## 🚀 Maven Commands

```bash
# Run unit tests
mvn clean test

# Build WAR package
mvn clean package
```
