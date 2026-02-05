# StaySplit

StaySplit is a full-stack web application that fairly splits shared utility bills among roommates based on the number of days each person stayed. The system ensures transparent and accurate cost distribution using a Spring Boot REST API backend and a clean, responsive frontend.

---

## Live Demo

https://sujalpatil21.github.io/StaySplit/

---

## Problem Statement

In shared living environments, roommates often stay for different durations, making equal bill splitting unfair. StaySplit solves this by calculating each person's share proportional to their stay duration.

---

## Features

- Add and remove roommates dynamically  
- Input number of days stayed per person  
- Automatic fair bill calculation  
- REST-based backend  
- Deployed full-stack system  
- Cross-origin enabled communication  
- Clean and responsive UI  

---

## Tech Stack

### Frontend
- HTML5  
- CSS3  
- JavaScript  

### Backend
- Java 21  
- Spring Boot  
- Maven  

### Deployment
- Render (Backend)  
- GitHub Pages (Frontend)  

---

## Data Flow

1. User enters bill amount and roommate details  
2. Frontend sends POST request to backend  
3. Backend processes data and calculates shares  
4. Backend returns computed results  
5. Frontend displays result table  

---

## Deployment Strategy

- Backend containerized using Docker  
- Backend deployed on Render  
- Frontend hosted using GitHub Pages  

---

## Error Handling

- Input validation  
- Invalid number checks  
- Graceful JSON parsing  
- User-friendly error display  

---

## Future Enhancements

- User authentication  
- Persistent database storage  
- Bill history tracking  
- Export reports (PDF / CSV)  
- Mobile application  

---

## License

MIT License

---

## Author

**Sujal Patil**

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/SujalPatil21)  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sujalbpatil21)  
[![Email](https://img.shields.io/badge/Email-D14836?style=flat&logo=gmail&logoColor=white)](mailto:sujalpatil21@gmail.com)
