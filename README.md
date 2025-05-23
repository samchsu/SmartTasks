# 🧠 SmartTask

SmartTask is a lightweight, full-stack task manager built with **Spring Boot**, **MySQL**, and **JS/HTML/CSS**. It helps you quickly manage tasks and tackle indecisiveness via OpenAI API integration and a simple and intuitive web interface — click to mark as done, click again to delete.

---

## 🚀 Features

- ✅ Add, view, and delete tasks
- ✅ Uses OpenAI API to generate tasks to help you accomplish your goals
- 🔁 Automatically updates without refreshing
- 🌱 Built with modern Spring Boot (v3.x) and Hibernate
- 🔐 Secure configuration with `.env` for DB credentials

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot, JPA, Hibernate
- **Frontend:** HTML, CSS, JavaScript
- **Database:** MySQL
- **Build Tool:** Gradle

---

## 🧑‍💻 Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/YOUR_USERNAME/smarttask.git
cd smarttask/java/demo
```

### 2. Configure MySQL
Make sure you have a database named smarttasks.

Update src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/smarttasks
spring.datasource.username=root
spring.datasource.password=yourpassword

### 3. Run the app
./gradlew bootRun
Visit: http://localhost:8080

📦 API Endpoints
Method:	Endpoint | Description

GET: /tasks	| Get all tasks

POST:	/tasks | Add a task

DELETE:	/tasks/{id} | Delete a task

PUT:	/tasks/{id} | Mark as completed

📸 UI Preview

![Screenshot 2025-05-23 at 12 19 46 AM](https://github.com/user-attachments/assets/c53903bd-3270-4cf0-b66e-7905a166e27a)

<img width="1697" alt="Screenshot 2025-05-23 at 12 29 31 AM" src="https://github.com/user-attachments/assets/226e6bf4-c364-44c0-8f69-7047eb03f54e" />

<img width="1687" alt="Screenshot 2025-05-23 at 12 30 17 AM" src="https://github.com/user-attachments/assets/2913a9fb-de19-4539-8470-fb3d4844ee4a" />


🧠 Future Plans
User login

Due date sorting

Notification reminders

### ✅ 4. **Add `.gitignore`**
Create a `.gitignore` file to avoid pushing secrets and build files:

```gitignore
HELP.md
.env
*.env
.gradle
build/
!gradle/wrapper/gradle-wrapper.jar
!**/src/main/**/build/
!**/src/test/**/build/

# Spring Boot Secrets
src/main/resources/application-secret.properties

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache
bin/
!**/src/main/**/bin/
!**/src/test/**/bin/

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr
out/
!**/src/main/**/out/
!**/src/test/**/out/

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/

### VS Code ###
.vscode/
```
