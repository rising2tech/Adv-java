I’ve included:

- project overview
- requirements
- meaning of

  - `Class.forName("com.mysql.cj.jdbc.Driver");`
  - `jdbc:mysql://localhost:3306/Advjava`

- credentials for **root** and **advjava**
- exceptions you faced and why they occur
- how to run the program

You can copy-paste and edit if you want.

---

# JDBC MySQL Connection Demo (Java)
## JdbcPro1ConnectionToMySQLDB

This project shows how to connect a **Java application** to a **MySQL database** using **JDBC**.

The project contains:

- loading MySQL JDBC Driver
- creating database connection
- handling exceptions
- closing the connection

---

## ✔ Technologies Used

- Java
- JDBC API
- MySQL Database
- MySQL Connector/J (JAR)

---

## 📂 Project Class Used

`JdbcPro1.java`

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url, userName, password);

---

## 🔌 JDBC URL Used

```
jdbc:mysql://localhost:3306/Advjava
```

### Meaning of each part

| Part        | Meaning                             |
| ----------- | ----------------------------------- |
| `jdbc`      | Java Database Connectivity          |
| `mysql`     | Database type is MySQL              |
| `localhost` | Database is hosted on local machine |
| `3306`      | Default MySQL port                  |
| `Advjava`   | Database (schema) name              |

---

## Meaning of Driver Loading Line

Class.forName("com.mysql.cj.jdbc.Driver");

This line:

- loads the **MySQL JDBC driver class**
- registers it with `DriverManager`
- allows Java to talk to MySQL

Simple meaning:

👉 “Enable Java to use MySQL database driver.”

Without this line, Java cannot connect to MySQL.

---

## 👤 Database Users & Credentials

### 1️⃣ Root User (default MySQL admin)

- **username:** `root`
- **password:** `Root@111`

### 2️⃣ Custom User (created for project)

- **username:** `advjava`
- **password:** `Advjava@111`
- **database:** `Advjava`

Grant statement used:

```sql
GRANT ALL PRIVILEGES ON Advjava.* TO 'advjava'@'localhost';
```

---

## ⚠ Exceptions Encountered & Meaning

### 1️⃣ `Unknown database 'studentdb'`

**Reason:** database name in URL did not exist

```text
java.sql.SQLSyntaxErrorException: Unknown database 'studentdb'
```

**Fix:** Created/used correct database → `Advjava`

---

### 2️⃣ `No suitable driver`

**Reason:** Connector JAR missing or wrong URL passed

```text
java.sql.SQLException: No suitable driver found
```

**Fix:** added MySQL connector JAR + correct URL

---

### 3️⃣ `NullPointerException on con.close()`

**Reason:** connection failed earlier, `con` was null

---

## ▶ How to Run This Project

1. Install MySQL
2. Create database:

```sql
CREATE DATABASE Advjava;
```

3. Create user (optional):

```sql
CREATE USER 'advjava'@'localhost' IDENTIFIED BY 'Advjava@111';
GRANT ALL PRIVILEGES ON Advjava.* TO 'advjava'@'localhost';
FLUSH PRIVILEGES;
```

4. Add MySQL connector JAR to project build path
5. Change credentials if needed
6. Run `main()` method in `JdbcPro1`

Expected Output:

```
Connect method execution starts
Connected Successfully!
```

---

## 🚀 Future Enhancements

- Insert records into `emp` table
- Read employee data
- Update & delete records
- Use PreparedStatement
- Create CRUD console application
