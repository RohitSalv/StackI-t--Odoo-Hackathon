# 📚 StackIt – A Minimal Q&A Forum Platform (Odoo Hackathon 2025)

## 📖 Problem Statement

StackIt is a collaborative, community-driven Q&A platform designed for clean knowledge sharing. Users can post questions, answer others, upvote/downvote, mark accepted answers, and receive notifications.

Built as part of **Odoo Hackathon 2025**.

---

## 📦 Repo Structure

```
StackI-t--Odoo-Hackathon/
├── backend/        → Spring Boot backend code (Java + MySQL)
├── frontend/       → Angular frontend app (Angular 16 + Material + ngx-editor)
├── README.md
└── .gitignore
```

---

## 📌 Tech Stack

- **Backend:** Java Spring Boot, MySQL
- **Frontend:** Angular 16, Angular Material, ngx-editor
- **Version Control:** Git, GitHub

---

## 📦 Backend Setup (in `/backend` folder)

**Run Instructions:**
1. Open `/backend` in IntelliJ/VS Code  
2. Configure `application.properties` for MySQL:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/stackit_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Run `StackitApplication.java`
4. Test APIs via Postman or Angular frontend.

**CORS Configured** to allow `http://localhost:4200`

---

## 📦 Frontend Setup (in `/frontend` folder)

**Run Instructions:**
1. Open terminal:
   ```
   cd frontend
   npm install
   ng serve
   ```
2. Open browser at [http://localhost:4200](http://localhost:4200)

---

## 📡 API Endpoints Summary

| Method | Endpoint                               | Description                      |
|:--------|:----------------------------------------|:----------------------------------|
| GET    | `/api/questions`                        | Fetch all questions              |
| POST   | `/api/questions`                        | Add a new question               |
| GET    | `/api/questions/{id}`                   | Fetch question by ID             |
| POST   | `/api/answers`                          | Post an answer                   |
| GET    | `/api/answers/question/{id}`            | Get answers for a question       |
| POST   | `/api/votes`                            | Upvote/downvote an answer        |
| PUT    | `/api/answers/{id}/accept`              | Accept an answer                 |
| GET    | `/api/notifications/user/{id}`          | Fetch notifications for a user   |

---

## 👥 Team Members

| Role             | Name               | Email                        |
|:----------------|:------------------|:-----------------------------|
| **Team Leader**  | Rohit Salve        | —                             |
| Member 1         | Saurav Wagdarkar   | sauravwagdarkar71@gmail.com   |
| Member 2         | Parshvi Akkewar    | parshvia2567@gmail.com        |

---

## 📌 Notes

- Rich text editor via `ngx-editor` for question & answer content
- Notifications auto-poll from backend
- Fully mobile responsive Angular Material design
- Code cleanly separated in `frontend/` and `backend/`

---

## 🎉 All the best to Team StackIt 🚀🔥
