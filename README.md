# 3snetCO_QA_Automation_Framework

A Java-based UI test automation framework built from scratch. Developed as part of practical QA engineering work and team collaboration.

## 🧩 Project Overview

This project is a practical automation framework built from scratch in Java. It serves as a solid foundation for UI test automation, designed and developed as part of our freelance testing practice.

The framework’s core structure and base functionality were created by me, while other team members — also practicing automation — collaborate with me on their own branches and pages, implementing tests based on regression checklists.

This is a real, evolving project reflecting both our skills and collaborative work in an experimental professional environment.

---

## 🛠️ Technologies & Tools

- **Language:** Java  
- **Build Tool:** Maven  
- **Test Framework:** TestNG 
- **UI Automation:** Selenium WebDriver  
- **API Testing:** Postman (planned addition of RestAssured)  
- **Logging:** SLF4J + Logback
- **Reporting:** Allure Reports

---

## 🔍 Key Features

- Modular, scalable test framework structure  
- Page Object Model for maintainability and clarity  
- UI test examples based on real project pages
- Rich test reporting via Allure Reports (steps, descriptions, screenshots)
- Clear separation of test data, logic, and assertions  
- Multi-branch collaboration setup  
- Regression test scenarios based on predefined checklists
  
---

## 📦 How to Run

1. Clone the repository:

```bash
git clone https://github.com/EvaTurtschin/3snetCO_QA_Automation_Framework.git
```

2. Open the project in IntelliJ IDEA (or any compatible Java IDE).

3. Ensure JDK (17+) and Maven are installed.

4. Run tests separately from the `src/test/java` directory or suites from Terminal with `mvn clean test`.

5. To generate and view the Allure Report: `allure serve target/allure-results`.
 or `allure generate target/allure-results --clean -o target/allure-report` 
    `allure open target/allure-report`
6. 


---

## 👥 Collaboration Workflow
Each contributor works in a dedicated branch and covers specific parts of the system under test. The test coverage is based on regression checklists prepared manually in advance. Code review and guidance are part of the process to ensure quality and consistency across the project.

### Contributors

- **Evgeniya Turchina** – Project owner, framework architecture and core development  
- **Eldar Abdulhakov** – UI test scenarios, branch: `ea/partner`  
- **Irina Bessner** – UI test scenarios, branch: 
- **Anton Sladkomedov** – UI test scenarios, branch: `waiters_fix` 

---

## 🔄 Future Plans

- Add API test coverage using RestAssured

- Configure CI/CD process using Jenkins

- Continue building out page object structure and regression checklists

- Add Allure CI integration and historical report retention

- Implement parameterized test data
---
