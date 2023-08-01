# Project Overview

This full-stack project is an imitation of an online pizza shop, providing various filtering options and order placement functionality. The backend is developed using Spring Boot, while the frontend is built with React. The project aims to simulate a seamless pizza ordering experience with extensive filtering capabilities.


# Features

- Pizza Selection
- Filtering Options
- Order Placement
- Query-DSL Integration
- Redux-Toolkit State Management


# Technologies Used

- **Backend**: Spring Boot, Query-DSL, PostgreSql, Liquabase, H2 (for *Integration tests*)
- **Frontend**: TypeScript, React, Redux-Toolkit, Debounce

# Project Roadmap and Issues

Currently, the project covers the basic features of an online pizza shop. However, there are several potential areas of improvement and expansion, such as:

1. **User Authentication**: Implementing user authentication and accounts to handle personalized order history and preferences.
2. **Cart Page**: Improvement *`OrderPopUp`* element after payment processing

Please check the "Issues" section on GitHub to find a detailed list of known issues and planned enhancements.

# Getting Started

Follow these steps to get the project up and running on your local machine.

## Installation

1. Clone the repository: `https://github.com/borumv/pizza-project.git`

## Configuration

1. Backend Configuration:
    
    - Navigate to the backend directory: `cd backend`
    - Configure the database connection in `application.properties`.
    - Customize any other required configurations.
2. Frontend Configuration:
    
    - Navigate to the frontend directory: `cd frontend`
    - Update the API endpoint in the configuration file if needed.

## Running the Application

1. Backend:
    - Build and run the Spring Boot application.
2. Frontend:
    
    - Install dependencies: `npm install`
    - Start the development server: `npm start`

Access the application by visiting `http://localhost:3000` in your web browser.

# API Documentation

