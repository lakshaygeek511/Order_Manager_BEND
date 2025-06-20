# Order Manager 📦

A **iOS-based Order Delivery Management System** designed to streamline order creation, management, tracking, and status updates for both customers and delivery agents. Built with Swift, Objective-C, and backed by a secure backend infrastructure in **Java & Spring Framework**.

## 🎨 UI/UX Design Highlights
- **Clean Interface**: Designed with UIKit and Interface Builder.
- **Smooth Navigation**: Intuitive transitions between screens.
- **Responsive Layout**: Optimized for all iOS devices.

![image](https://github.com/user-attachments/assets/10622fb5-1397-4c7c-be2f-6ada0351889b)

## 🚀 Features

### **1. User Registration & Authentication**
   - **Sign-Up**: Register as a **Customer** or **Delivery Agent** with secure authentication.
   - **Sign-In**: Log in seamlessly to access role-specific features.

### **2. Role-Based Dashboard**
   - **Customers**: Manage your orders, track statuses, and view order details.
   - **Delivery Agents**: View key metrics like **Total Orders**, **Delivered**, and **Returned Orders**.

### **3. Order Management**
   - **Create Orders**: Customers can create new orders with:
     - Customer Information
     - Location (via Google Maps API)
     - Product List and Quantity
   - **Update Orders**: Modify order details, including status updates like:
     - "In Transit," "Delivered," or "Returned" (for agents).
     - "Cancelled" (for customers).

### **4. Order History**
   - View and manage all past orders with comprehensive details:
     - **Order Number**
     - Product List, Quantity, Status, and Date.
   - Delivery agents can **view delivery locations** directly on a map.

---

## 🛠️ Tech Stack

### **Languages & Tools**
- **Swift**, **Objective-C**: iOS app development.
- **UIKit**: User Interface components.
- **Xcode**: IDE for development.
- **Core Location**: Fetching user location.
- **Google Maps API**: For mapping delivery locations.

### **Backend**
- **Java**: Spring Framework, Hibernate.
- **PostgreSQL**: Live database for production.
- **SQLite**: Local device database for offline capabilities.

### **CI/CD & Monitoring**
- **GitLab**: CI/CD pipelines for automated workflows.
- **Firebase**: Analytics and performance monitoring.
- **Postman**: API testing and validation.

![image](https://github.com/user-attachments/assets/afa2a9f8-4d5d-4b91-a03e-d844a2c05d42)


## 🎯 Use Cases

1. **User Authentication**
   - UC-001: Sign-Up.
   - UC-002: Sign-In.

2. **Order Features**
   - UC-003: View Order History.
   - UC-004: View Order Location on Map.
   - UC-005: Update Order Status.
   - UC-006: Create New Orders.
   - UC-007: Fetch User Location for Orders.
   - UC-008: View Delivery Dashboard.

3. **Order Updates**
   - UC-009: Modify order details.

## 💾 Installation

### Clone the Repository
```bash
git clone https://github.com/lakshaygeek511/Order_Manager.git
cd Order_Manager
Run via Simulator or on iPhone 

## 📂 Folder Structure

```plaintext
Order_Manager/
│-- README.md
│-- OrderManager/
    │-- App/
        │-- Models/          # Data Models
        │-- Views/           # UI Components
        │-- Controllers/     # View Controllers
        │-- Utils/           # Utility Functions
        │-- Services/        # API Integrations
        │-- Database/        # SQLite Setup
    │-- Tests/               # XCTest Cases
