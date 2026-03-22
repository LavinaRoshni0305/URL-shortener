# 🔗 URL Shortener (Full Stack Project)

A full-stack web application that converts long URLs into short, shareable links.

---

## 🚀 Features

* Shorten long URLs
* Redirect short URLs to original links
* Unique short code generation
* MySQL database integration
* REST API backend
* Clean React frontend UI

---

## 🧱 Tech Stack

### 🔹 Frontend

* React.js
* Axios
* CSS

### 🔹 Backend

* Spring Boot
* Spring Data JPA
* REST APIs

### 🔹 Database

* MySQL

---

## 📂 Project Structure

```bash
url-shortener/
│
├── src/                     # Spring Boot backend (Java code)
│   ├── main/
│   │   ├── java/com/example/urlshortener/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   └── UrlShortenerApplication.java
│   │   └── resources/
│   │       └── application.properties
│
├── url-shortener-ui/        # React frontend
│   ├── src/
│   │   ├── components/
│   │   ├── App.js
│   │   └── App.css
│
├── pom.xml                  # Maven configuration
├── mvnw / mvnw.cmd
```

---

## ⚙️ Setup Instructions

### 🔹 1. Clone Repository

```bash
git clone https://github.com/your-username/url-shortener-fullstack.git
cd url-shortener-fullstack
```

---

### 🔹 2. Database Setup

```sql
CREATE DATABASE url_shortener;
```

---

### 🔹 3. Backend Setup (Spring Boot)

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/url_shortener
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
```

Run backend:

```bash
mvn spring-boot:run
```

---

### 🔹 4. Frontend Setup (React)

```bash
cd url-shortener-ui
npm install
npm start
```

---

## 🔗 API Endpoints

### ✅ Shorten URL

```http
POST /shorten
```

**Request Body:**

```json
{
  "originalUrl": "https://example.com"
}
```

---

### ✅ Redirect URL

```http
GET /{shortCode}
```

---

## 🧪 Testing (Postman)

1. POST `/shorten`
2. Copy `shortCode`
3. Open `http://localhost:8080/{shortCode}`

---

## 🗄️ Database

Table: `url`

Columns:

* id
* original_url
* short_code

---

## 🚀 Future Enhancements

* QR Code generation
* Click analytics
* Custom short URLs
* URL expiration

---

## 👩‍💻 Author

* Lavin

---

## ⭐ Notes

* Backend is located directly inside `src/`
* React frontend is inside `url-shortener-ui/`
* Hibernate auto-creates database tables
