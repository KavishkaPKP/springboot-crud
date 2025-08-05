# Student CRUD REST API - Spring Boot Application

This is a simple Spring Boot CRUD (Create, Read, Update, Delete) REST API for managing student data using MySQL.

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 📁 Project Structure

com.q4.crudapp
├── Controller ── StudentController.java
├── Model ── Student.java
├── Repository ── StudentRepository.java
── CrudappApplication.java

---

## 🧪 API Endpoints

| Method | Endpoint        | Description          |
|--------|------------------|----------------------|
| POST   | `/students`      | Create new student   |
| GET    | `/students`      | Get all students     |
| GET    | `/students/{id}` | Get a student by ID  |
| PUT    | `/students/{id}` | Update student       |
| DELETE | `/students/{id}` | Delete student       |

---

## 🔐 Validation Rules

- All fields are required:
  - `firstName`, `lastName`, `address`, `department`, `email`, `mobileNumber`, `studyField`
- `email` must be a valid email format

---

## 🧪 Sample POST Body (JSON)

{
  "firstName": "Pasindu",
  "lastName": "Kavishka",
  "address": "292/7, Galwalagoda, Dekatana",
  "department": "IT",
  "email": "pasindu@example.com",
  "mobileNumber": "0712345678",
  "studyField": "Software Engineering"
}
