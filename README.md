Java Shopping Cart Simulator

A command-line shopping cart and inventory management simulator built with Java. The project demonstrates Object-Oriented Programming (OOP) by modeling products and customers as separate classes and managing them through Java ArrayLists.

Tech Stack

* Java – Core programming language.
* OOP – Classes, objects, constructors, and methods.
* ArrayList – Dynamic storage and management of products and customers.
* Scanner – Handling user input through the command line.

Features

* Product Creation: Add products with unique IDs, names, prices, categories, and stock quantities.
* Inventory Management: Search for products using their IDs.
* Stock Reduction: Reduce the available stock of an existing product.
* Customer Creation: Create customer objects with personal information and account balances.
* Dynamic Data Storage: Store products and customers using ArrayLists.
* Interactive Menu: Navigate application functionality through a command-line interface.

Project Structure

shopping-cart-simulator/
│
├── Main.java
├── Product.java
└── Customer.java

Getting Started

1. Clone the repository

git clone <repository-url>
cd shopping-cart-simulator

2. Compile the Java files

javac Main.java Product.java Customer.java

3. Run the application

java Main

How It Works

The application uses two main ArrayLists:

* products – Stores Product objects.
* customers – Stores Customer objects.

The application runs through an interactive menu that allows users to perform different operations.

Available Operations

Option	Functionality
1	Add a new product
2	Reduce existing product stock
3	Create a new customer
4	Exit the application

Products and customers are represented through separate classes, keeping their attributes and functionality organized.

Current Development Status

This project is currently in development and focuses on practicing Java fundamentals and Object-Oriented Programming.

Potential future improvements:

* Add products to individual shopping carts.
* Implement product purchasing functionality.
* Calculate total shopping cart value.
* Add stock validation and prevent negative inventory.
* Implement customer authentication.
* Add product search and filtering.
* Introduce database integration for persistent storage.
* Improve input validation and exception handling.
