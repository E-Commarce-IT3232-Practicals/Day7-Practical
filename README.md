# 🎓 University Workshop Management System (WMS) - Day07 (2025-04-25)

A **Spring Boot** application to manage university workshops, sessions, presenters, and participants.

---

## 📝 Overview

The **University Workshop Management System (WMS)** is designed to help academic institutions organize and track workshops effectively. It allows administrators to manage:

- 🏫 **Workshops** and their details
- 🧾 **Workshop Sessions**
- 🧑‍🏫 **Presenters**
- 🎓 **Undergraduate Participants**
- 🎓 **Postgraduate Participants**

---

## 🛠️ Technical Stack

- 💻 **Framework:** Spring Boot
- 🗄️ **Database:** MySQL
- 🧬 **ORM:** Hibernate / JPA
- ☕ **Language:** Java

---

## ⚙️ Database Configuration

Make sure to configure your database connection in `application.properties`:

```properties
spring.application.name=University
spring.datasource.url=jdbc:mysql://localhost:3306/uni
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
````

---

## 🧩 Data Model

### 👤 Person *(MappedSuperclass)*

Base class for all person entities:

* `email`
* `gender`
* `name`
* `phone`

### 🏫 Workshop

Represents a workshop event:

* `id`
* `name`
* `description`
* `start_date`
* `end_date`

### 🧾 Session

Represents individual sessions within workshops:

* `id`
* `name`
* `description`
* `date`
* `time`
* `workshop_id` *(as a relationship)*

**Relationships:**

* 📚 Many-to-Many with:

  * `Presenter`
  * `Undergraduate`
  * `Postgraduate`

### 🧑‍🏫 Presenter *(extends Person)*

* `id`
* `affiliation`
* `country`
* `job_title`

**Relationships:**

* 📚 Many-to-Many with `Session`

### 🎓 Undergraduate *(extends Person)*

* `id`
* `degree`
* `university`

**Relationships:**

* 📚 Many-to-Many with `Session`

### 🎓 Postgraduate *(extends Person)*

* `id`
* `institute`
* `research_interest`
* `second_degree`

**Relationships:**

* 📚 Many-to-Many with `Session`

---

## 🚀 Setup Instructions

### ✅ Prerequisites

* Java 17+
* MySQL Server
* Maven

### 🏁 Outputs

![Screenshot 1](https://github.com/user-attachments/assets/60320296-27d8-4d63-a0ec-b55103ed6e54)

![Screenshot 2](https://github.com/user-attachments/assets/b4ac9743-6d7f-4b52-9e4c-cd2195095892)

![Screenshot 3](https://github.com/user-attachments/assets/5471192a-25da-4ee1-b431-7e37db441e0c)

![Screenshot 4](https://github.com/user-attachments/assets/0ff02a56-f596-4df5-9997-9b2e7e4ae5c9)

---

## 📃 License

This project is licensed for educational purposes. 📚
