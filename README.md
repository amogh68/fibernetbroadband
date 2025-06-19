# Nvidia Fibernet Broadband Billing Management System

A Java-based broadband service simulation project that replicates real-world internet service provider (ISP) operations. Built using Java Swing for GUI and MySQL for backend storage, this system includes both admin and user modules with robust billing, connection management, and payment tracking features.

---

## 📌 Project Overview

The application allows broadband customers to buy plans, track usage, make payments, and submit service requests. Admins can manage users, generate monthly bills, and handle customer service issues. This modular project demonstrates a real-world telecom management system, complete with database integration via JDBC.

---

## 💻 Technologies Used

- **Java** (AWT & Swing)
- **MySQL**
- **JDBC** (Java Database Connectivity)
- **NetBeans / Eclipse IDE**
- **OOP Principles**

---

## ✨ Key Features

> The system is divided into admin and user modules, each with clearly defined functionalities:

---

### 👤 Admin Features

- 🔐 **Admin Sign-Up & Sign-In**: Secure login system for administrators  
- 📊 **Admin Dashboard**: Access to billing, user records, and service activity  
- 🧾 **Bill Generation Logic**: Monthly billing based on plan and data usage  
- 👥 **User Management**: View, edit, or remove customer profiles  
- 🛠 **Service Monitoring**: Handle and resolve user service requests  

---

### 👥 User Features

- 📝 **User Registration & Sign-In**: Register and log in securely  
- 🧑‍💻 **User Dashboard**: View usage, plan, billing history, and submit requests  
- 🌐 **Buy Connection**: Apply for a new broadband connection  
- 💼 **Buy/Upgrade Plan**: Select and manage internet packages  
- 🧍 **Profile Management**: Update account and contact information  
- 🧾 **Service Request**: Submit complaints or service issues  

---

### 💳 Payment Module

- 🖥 **Payment GUI**: Simple interface for making broadband payments  
- ✅ **Payment Confirmation**: Updates billing records in the database  

---

### 🌐 Additional Features

- ❓ **FAQ Section**: Common questions and support guidance  
- 🏠 **Homepage GUI**: Welcome interface with navigation and branding  
- 🛢 **JDBC Integration**: Smooth database communication via JDBC  
- ⚙️ **Error Handling**: Input validations and basic exception handling  
- 📦 **Modular Codebase**: Clean separation of logic across Java classes (`ConnectionJDBC`, `NvidiaConnection`, `PaymentGUI`, etc.)

---

## 🧠 Concepts Practiced

- Object-Oriented Programming (OOP)
- GUI Design with Swing & AWT
- Database CRUD Operations
- Exception Handling
- Java-MySQL Integration
- Modular Java Application Structure

---

## 🚀 How to Run the Project

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/nvidia-billing-system.git
