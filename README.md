# BillEase - Billing Management System

## 📋 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [System Architecture](#system-architecture)
- [Database Configuration](#database-configuration)
- [Installation & Setup](#installation--setup)
- [Usage Guide](#usage-guide)
- [Project Structure](#project-structure)
- [Screenshots](#screenshots)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

**BillEase** is a comprehensive Java Swing-based billing management system designed for medical stores and pharmacies. The application provides a complete solution for managing buyers, products, and generating professional bills with PDF export functionality.

### Key Highlights
- **Desktop Application**: Built with Java Swing for cross-platform compatibility
- **Database Integration**: MySQL database with AWS RDS cloud hosting
- **PDF Generation**: Automated bill generation with professional formatting
- **User-Friendly Interface**: Intuitive GUI with animated elements
- **Complete CRUD Operations**: Full Create, Read, Update, Delete functionality

## ✨ Features

### 🏠 Dashboard & Navigation
- **Home Screen**: Central navigation hub with animated buttons
- **Menu System**: Easy access to all modules
- **User Authentication**: Secure login system
- **Session Management**: Proper logout functionality

### 👥 Buyer Management
- **Add New Buyers**: Register new customers with complete details
- **Update Buyer Information**: Modify existing customer data
- **View Buyer Details**: Display comprehensive customer information
- **Delete Buyers**: Remove customer records
- **Search Functionality**: Find buyers by name or contact number

### 📦 Product Management
- **Add New Products**: Register medicines/products with details
- **Update Product Information**: Modify product data including pricing
- **View Product Details**: Display complete product information
- **Delete Products**: Remove product records
- **Inventory Tracking**: Monitor product availability
- **Expiry Date Management**: Track manufacturing and expiry dates

### 🧾 Billing System
- **Interactive Billing Interface**: User-friendly bill creation
- **Real-time Calculations**: Automatic total calculation
- **Product Search**: Quick product lookup by ID or name
- **Buyer Integration**: Auto-populate buyer details
- **Multiple Items**: Add multiple products to single bill
- **PDF Export**: Generate professional PDF bills
- **Print Functionality**: Direct printing support

### 📊 Additional Features
- **Date & Time Stamps**: Automatic timestamp on bills
- **Professional PDF Layout**: Well-formatted bill generation
- **Data Validation**: Input validation and error handling
- **Responsive Design**: Optimized for different screen sizes

## 🛠 Technology Stack

### Frontend
- **Java Swing**: GUI framework for desktop application
- **AWT**: Abstract Window Toolkit for UI components
- **NetBeans Form Designer**: Visual form builder

### Backend
- **Java SE**: Core Java programming
- **JDBC**: Database connectivity
- **MySQL Connector/J**: MySQL database driver

### Database
- **MySQL**: Relational database management system
- **AWS RDS**: Cloud-hosted MySQL instance

### Libraries & Dependencies
- **iText PDF**: PDF generation library
- **JCalendar**: Date picker component
- **Swing Components**: Enhanced UI elements

### Build Tools
- **Apache Ant**: Build automation tool
- **NetBeans IDE**: Integrated development environment

## 🏗 System Architecture

```
┌─────────────────────────────────────────────────────────────┐
│                    Presentation Layer                       │
│  ┌─────────────┐ ┌─────────────┐ ┌─────────────────────────┐│
│  │   Login     │ │    Home     │ │    Billing Interface    ││
│  │   Screen    │ │  Dashboard  │ │                         ││
│  └─────────────┘ └─────────────┘ └─────────────────────────┘│
└─────────────────────────────────────────────────────────────┘
                              │
┌─────────────────────────────────────────────────────────────┐
│                   Business Logic Layer                      │
│  ┌─────────────┐ ┌─────────────┐ ┌─────────────────────────┐│
│  │   Buyer     │ │   Product   │ │    Billing Logic       ││
│  │ Management  │ │ Management  │ │                         ││
│  └─────────────┘ └─────────────┘ └─────────────────────────┘│
└─────────────────────────────────────────────────────────────┘
                              │
┌─────────────────────────────────────────────────────────────┐
│                    Data Access Layer                        │
│  ┌─────────────┐ ┌─────────────┐ ┌─────────────────────────┐│
│  │    JDBC     │ │ Connection  │ │    SQL Queries          ││
│  │ Operations  │ │   Provider  │ │                         ││
│  └─────────────┘ └─────────────┘ └─────────────────────────┘│
└─────────────────────────────────────────────────────────────┘
                              │
┌─────────────────────────────────────────────────────────────┐
│                     Database Layer                          │
│  ┌─────────────┐ ┌─────────────┐ ┌─────────────────────────┐│
│  │   Buyer     │ │   Product   │ │    AWS RDS MySQL        ││
│  │   Table     │ │   Table     │ │                         ││
│  └─────────────┘ └─────────────┘ └─────────────────────────┘│
└─────────────────────────────────────────────────────────────┘
```

## 🗄 Database Configuration

### Database Schema

#### Buyer Table
```sql
CREATE TABLE buyer (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    contactNo VARCHAR(15) UNIQUE NOT NULL,
    email VARCHAR(100),
    address TEXT
);
```

#### Product Table
```sql
CREATE TABLE product (
    pId VARCHAR(20) PRIMARY KEY,
    pName VARCHAR(100) NOT NULL,
    rate DECIMAL(10,2) NOT NULL,
    description TEXT,
    quantity INT DEFAULT 0,
    company VARCHAR(100),
    mfgDate DATE,
    expDate DATE
);
```

### AWS RDS Configuration
- **Endpoint**: `mydb2.cgr8akhgkolj.us-east-1.rds.amazonaws.com`
- **Port**: `3306`
- **Database**: `user`
- **Region**: `us-east-1`

## 🚀 Installation & Setup

### Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher
- **NetBeans IDE**: Version 12 or higher (recommended)
- **MySQL Connector/J**: JDBC driver
- **Internet Connection**: For AWS RDS database access

### Step-by-Step Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/BillEase.git
   cd BillEase
   ```

2. **Open in NetBeans**
   - Launch NetBeans IDE
   - File → Open Project
   - Navigate to the BillEase directory
   - Select the project

3. **Configure Dependencies**
   - Add MySQL Connector/J to classpath
   - Add iText PDF library
   - Add JCalendar library

4. **Database Setup**
   - Ensure AWS RDS connection is active
   - Update connection credentials in `connectionprovider.java` if needed
   - Test database connectivity

5. **Build the Project**
   ```bash
   ant clean
   ant build
   ```

6. **Run the Application**
   ```bash
   ant run
   ```

### Alternative Setup (Local MySQL)
If you prefer local MySQL setup:

1. **Install MySQL Server**
2. **Create Database**
   ```sql
   CREATE DATABASE user;
   USE user;
   ```
3. **Update Connection String**
   ```java
   String url = "jdbc:mysql://localhost:3306/user";
   String user = "root";
   String password = "your_password";
   ```

## 📖 Usage Guide

### 1. Application Startup
- Launch the application
- Login screen appears (if authentication is implemented)
- Navigate to the main dashboard

### 2. Managing Buyers
#### Adding New Buyer
1. Click "New Buyers" button
2. Fill in buyer details:
   - Name
   - Contact Number
   - Email Address
   - Address
3. Click "Save" to add buyer

#### Updating Buyer Information
1. Click "Update Buyers" button
2. Search for existing buyer
3. Modify required fields
4. Save changes

#### Viewing Buyer Details
1. Click "Buyers Details" button
2. Search or browse buyer list
3. View complete information

### 3. Managing Products
#### Adding New Product
1. Click "New Product" button
2. Enter product details:
   - Product ID
   - Product Name
   - Rate/Price
   - Description
   - Manufacturing Date
   - Expiry Date
3. Save product information

#### Product Operations
- **Update**: Modify existing product details
- **View**: Display product information
- **Delete**: Remove products from inventory

### 4. Creating Bills
#### Step-by-Step Billing Process
1. **Open Billing Module**
   - Click "Billing" button from dashboard

2. **Enter Buyer Information**
   - Type buyer name or contact number
   - System auto-populates buyer details

3. **Add Products**
   - Enter Product ID or Product Name
   - System fetches product details
   - Specify quantity
   - Click "ADD" to add to bill

4. **Review Bill**
   - Check added items in the table
   - Verify total amount
   - Remove items if necessary

5. **Complete Transaction**
   - Enter paid amount
   - Add prescribing doctor name (optional)
   - Click "Save" to generate PDF bill

6. **PDF Generation**
   - Professional PDF bill is created
   - Automatically opens for viewing
   - Saved to documents folder

### 5. Navigation Tips
- Use the control button to show/hide menu options
- Each module has dedicated buttons for different operations
- Close individual windows or logout from main menu

## 📁 Project Structure

```
BillEase-master/
├── nbproject/                          # NetBeans project configuration
│   ├── private/                        # Private project settings
│   ├── build-impl.xml                  # Build implementation
│   ├── genfiles.properties             # Generated files properties
│   ├── project.properties              # Project properties
│   └── project.xml                     # Project XML configuration
├── src/                                # Source code directory
│   ├── billing_managment_2/pkg0/       # Main package
│   │   ├── billing.java                # Billing module
│   │   ├── billing.form                # Billing form design
│   │   ├── buyer_detail.java           # Buyer details module
│   │   ├── buyer_detail.form           # Buyer details form
│   │   ├── delete_buyer.java           # Delete buyer module
│   │   ├── delete_buyer.form           # Delete buyer form
│   │   ├── delete_product.java         # Delete product module
│   │   ├── delete_product.form         # Delete product form
│   │   ├── home.java                   # Main dashboard
│   │   ├── home.form                   # Dashboard form design
│   │   ├── log.java                    # Login module
│   │   ├── log.form                    # Login form design
│   │   ├── login.java                  # Login handler
│   │   ├── new_buyer.java              # Add buyer module
│   │   ├── new_buyer.form              # Add buyer form
│   │   ├── new_product.java            # Add product module
│   │   ├── new_product.form            # Add product form
│   │   ├── number_verification.java    # Phone verification
│   │   ├── number_verification.form    # Verification form
│   │   ├── product_details.java        # Product details module
│   │   ├── product_details.form        # Product details form
│   │   ├── registration.java           # User registration
│   │   ├── registration.form           # Registration form
│   │   ├── update_buyer.java           # Update buyer module
│   │   ├── update_buyer.form           # Update buyer form
│   │   ├── update_product.java         # Update product module
│   │   └── update_product.form         # Update product form
│   ├── bms/                            # Resources directory
│   │   ├── *.png                       # UI icons and images
│   │   └── *.gif                       # Animated graphics
│   └── project/                        # Utility classes
│       └── connectionprovider.java     # Database connection
├── applet.policy                       # Applet security policy
├── build.xml                           # Ant build script
└── README.md                           # Project documentation
```

## 🖼 Screenshots

### Main Dashboard
The central hub providing access to all modules with animated buttons and intuitive navigation.

### Billing Interface
Comprehensive billing screen with buyer details, product selection, and real-time calculations.

### PDF Bill Sample
Professional PDF bills with company branding, itemized products, and calculation details.

### Product Management
Easy-to-use forms for adding, updating, and managing product inventory.

## 📚 API Documentation

### Database Connection Methods

#### ConnectionProvider Class
```java
public class connectionprovider {
    public static Connection getCon()
    // Returns MySQL database connection
    // Handles AWS RDS connectivity
    // Includes error handling and logging
}
```

### Core Modules

#### Billing Module
- **Purpose**: Handle complete billing operations
- **Key Methods**:
  - `jTextField2ActionPerformed()`: Buyer search by contact
  - `jTextField5ActionPerformed()`: Product search by ID
  - `jButton1ActionPerformed()`: Add product to bill
  - `jButton2ActionPerformed()`: Generate PDF bill

#### Buyer Management
- **CRUD Operations**: Create, Read, Update, Delete buyers
- **Search Functionality**: Find buyers by name/contact
- **Data Validation**: Input validation and error handling

#### Product Management
- **Inventory Control**: Manage product stock and details
- **Expiry Tracking**: Monitor product expiry dates
- **Price Management**: Handle product pricing

## 🤝 Contributing

We welcome contributions to improve BillEase! Here's how you can contribute:

### Getting Started
1. **Fork the Repository**
2. **Create Feature Branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Make Changes**
4. **Commit Changes**
   ```bash
   git commit -m "Add your feature description"
   ```
5. **Push to Branch**
   ```bash
   git push origin feature/your-feature-name
   ```
6. **Create Pull Request**

### Contribution Guidelines
- Follow Java coding standards
- Add comments for complex logic
- Test thoroughly before submitting
- Update documentation if needed
- Ensure backward compatibility

### Areas for Contribution
- **UI/UX Improvements**: Enhance user interface design
- **Performance Optimization**: Improve application speed
- **Additional Features**: Add new functionality
- **Bug Fixes**: Resolve existing issues
- **Documentation**: Improve project documentation
- **Testing**: Add unit and integration tests

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### MIT License Summary
- ✅ Commercial use
- ✅ Modification
- ✅ Distribution
- ✅ Private use
- ❌ Liability
- ❌ Warranty

## 📞 Support & Contact

### Getting Help
- **Issues**: Report bugs via GitHub Issues
- **Discussions**: Join project discussions
- **Documentation**: Refer to this README and code comments

### Project Maintainers
- **KIIT Team**: Original developers
- **Contributors**: Community contributors

### Acknowledgments
- **NetBeans IDE**: Development environment
- **MySQL**: Database management system
- **AWS RDS**: Cloud database hosting
- **iText**: PDF generation library
- **Java Community**: Ongoing support and resources

---

## 🔄 Version History

### v2.0 (Current)
- AWS RDS integration
- Enhanced PDF generation
- Improved UI/UX
- Better error handling

### v1.0 (Initial)
- Basic billing functionality
- Local database support
- Core CRUD operations

---

**Made with ❤️ by KIIT Team**

*For more information, please visit our [GitHub repository](https://github.com/your-username/BillEase) or contact the development team.*