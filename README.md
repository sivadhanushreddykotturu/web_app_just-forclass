# 🚨 Emergency Incident Response - Java Web App (CI/CD)

> **CI/CD Pipeline Demo Repository**  
> **Target Server**: Apache Tomcat 10.1 (WAR Deployment)  
> **Automation Engine**: Jenkins LTS CI/CD Pipeline

---

## 📌 Project Overview
A Java Jakarta Web Application designed for rapid emergency incident reporting, casualty triage assessment, and automated CI/CD integration.

- **Artifact**: `emergency-web-app.war`
- **Servlet API**: Jakarta Servlet 6.0
- **Testing Engine**: JUnit 5 Jupiter
- **Build Engine**: Apache Maven 3.9.9

---

## 🚀 Jenkins CI/CD Pipeline Commands

```bash
# Build & Test
mvn clean test

# Package WAR
mvn clean package
```

---

## 🧪 Endpoints & Views
- `http://localhost:9090/emergency-web-app/` : Tactical Emergency Operations Dashboard
- `http://localhost:9090/emergency-web-app/api/incidents` : Real-Time REST JSON Incident Feed
