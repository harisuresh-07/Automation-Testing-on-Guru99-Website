# Automation Testing on Guru99 Website using Selenium (Java)

## 📌 Overview

This project automates functional testing for the [Guru99 demo website](https://demo.guru99.com/) using **Selenium WebDriver** with **Java**. It validates key workflows such as login, customer creation, account management, and fund transfers to ensure the stability and reliability of the application.

---

## 🎯 Objectives

* Automate critical workflows on the Guru99 application.
* Perform regression and functional testing efficiently.
* Reuse modular test scripts for maintainability.
* Generate detailed reports for test execution results.

---

## 🛠️ Tools & Technologies

* **Selenium WebDriver** – Browser automation
* **Java** – Programming language for test scripts
* **TestNG** – Test framework for organizing and executing tests
* **Maven** – Build and dependency management
* **Extent Reports / Allure** – Test reporting
* **Apache POI** – For reading/writing Excel data (if applicable)

---

## 🧪 Test Scenarios

* ✅ Login with valid and invalid credentials
* 👤 Create new customers and validate details
* 🏦 Open new accounts and verify summaries
* 💸 Perform fund transfers and validate balances
* ❌ Negative testing: invalid transactions, missing fields
* 🌐 Cross-browser testing (Chrome, Firefox, Edge)

---

## 🚀 Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/guru99-selenium-java-testing.git
   ```
2. Install **Java (JDK 8+)** and **Maven**.
3. Download and configure browser drivers (e.g., ChromeDriver, GeckoDriver).
4. Open the project in your IDE (e.g., IntelliJ IDEA or Eclipse).
5. Update the test configuration (application URL, credentials) in the config file.
6. Execute the test suite:

   ```bash
   mvn clean test
   ```

---

## 📊 Reporting

* Test execution reports are generated using **Extent Reports** or **Allure Reports**.
* Reports are stored in the `/reports` folder after execution.

---

## 🤝 Contribution

Contributions are welcome! Fork the repository, create a feature branch, and submit a pull request for improvements or new test cases.

---

## 📄 License

This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.
