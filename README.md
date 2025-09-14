# 🛒 Flipkart Automation with Selenium (Java)

## 📌 Project Overview

This project demonstrates **automation skills and test case creation** using **Selenium WebDriver with Java**.
It automates a **complete user journey on Flipkart** – from login to navigating through product selection, adding items to the cart, and proceeding till the **payment confirmation page** (without real OTP entry).

The goal is to showcase **end-to-end UI automation** for an e-commerce platform.

## The Video End-to-End process of the code is https://youtu.be/EF6fqnnl3Uk?si=QtG3LM1sFmP0dERG

---

## ⚙️ Tech Stack

* **Programming Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Browser:** Google Chrome (via ChromeDriver)
* **Build Tool:** Maven / Manual Execution
* **IDE:** Eclipse / IntelliJ IDEA
* **Utilities:** Actions class, JavaScriptExecutor, Screenshots API

---

## 🔄 Automated Flow

The script covers the following steps:

1. **Open the Flipkart website**
2. **Log in** with valid credentials (mobile number + OTP wait)
3. **Search** for a product (e.g., mobile, perfume, grocery)
4. **Select** a product from the search results
5. **Add to Cart**
6. **Proceed to Payment Page**
7. **Choose a Payment Method** (Debit/Credit Card, Wallet, UPI, etc.)
8. **Enter Dummy Payment Details**
9. **Validate navigation** till the OTP/Confirmation page (OTP entry not automated)

---

## 📂 Project Structure

```
Jungleworks/
│
├── src/test/java/
│   └── Assignment1/
│       └── Task1.java        # Main automation script
│
├── pom.xml                   # Maven dependencies (if used)
├── README.md                 # Project documentation
└── Screenshots/              # Captured screenshots (optional)
```

---

## ▶️ How to Run

### Prerequisites

* Install **Java JDK 8+**
* Install **Eclipse/IntelliJ IDEA**
* Install **Chrome Browser**
* Download matching **ChromeDriver** and set system path

### Execution

1. Clone this repo:

   ```bash
   git clone https://github.com/your-username/flipkart-automation.git
   cd flipkart-automation
   ```
2. Open project in Eclipse/IntelliJ
3. Add Selenium JARs or configure `pom.xml` for Maven dependencies:

   ```xml
   <dependency>
       <groupId>org.seleniumhq.selenium</groupId>
       <artifactId>selenium-java</artifactId>
       <version>4.20.0</version>
   </dependency>
   ```
4. Update **login credentials** (mobile/email) in `Task1.java`.
5. Run `Task1.java` as **Java Application**.

---

