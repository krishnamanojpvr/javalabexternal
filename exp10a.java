/*
 * 10. a. Demonstrate with a Java Program (using JDBC) to display all the employees who are
working in the given department. Read department number from the user. Also display records in
the ascending order of "employee name".
Given Employee Schema.
Note - Display records based on employee names in ascending order
The DB Credentials
Name of the DB - test;
Name of the table- emp;
JDBC_DRIVER = "com.mysql.jdbc.Driver";
DB_URL = "jdbc:mysql://localhost/test";
Username-student
Password-student
emp schema;
+-----------+---------------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-----------+---------------+------+-----+---------+-------+
| empno | int(4) | NO | PRI | NULL | |
| ename | varchar(50) | NO | | NULL | |
| job | varchar(50) | NO | | NULL | |
| mgr | int(4) | YES | | NULL | |
| hiredate | date | YES | | NULL | |
| sal | decimal(10,2) | YES | | NULL | |
| comm | decimal(10,2) | YES | | NULL | |
| deptno | int(2) | YES | MUL | NULL | |
+----------+---------------+------+-----+---------+-------+
Sample Database :
mysql> select * from emp;
+-------+-----------+---------------+------+------------+----------+---------+--------+
| empno | ename
| job
| mgr | hiredate | sal
| comm
| deptno |
+-------+-----------+---------------+------+------------+----------+---------+--------+
| 401 | Albert| Sr. Developer | 4001 | 2019-07-01 | 35000.00 | 3000.00 |4|
| 402 | Robert| Data Analyst | 4002 | 2019-08-01 | 30000.00 | 2000.00 |4|
| 403 | Suresh| Developer4|
| 1002 | 2019-09-01 | 24000.00 | 2000.00 |
| 501 | Nitesh| Developer| 1001 | 2019-08-01 | 25000.00 | 2000.00 |5|| 502 | Mahesh| Developer| 1001 | 2019-09-01 | 24000.00 | 2000.00 |5|
| 503 | Akhilesh | Sr. Developer | 1002 | 2019-08-01 | 45000.00 | 4000.00 |5|
| 1201 | Venkatesh | Sr. Developer | 101 | 2019-07-01 | 35000.00 | 3000.00 |12 |
| 1202 | Harish
| Data Analyst | 102 | 2019-08-01 | 30000.00 | 2000.00 |
12 |
+-------+-----------+---------------+------+------------+----------+---------+--------+
8 rows in set (0.00 sec)
 */

import java.sql.*;
import java.util.*;

public class exp10a {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Department Number : ");
        int deptNum = input.nextInt();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement stmt = con.createStatement();
            String sql = "select ename from emp where deptno = " + deptNum + " order by ename asc";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("");
            int numberOfColumns = rsmd.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                if (i > 1)
                    System.out.print(" , ");
                String columnName = rsmd.getColumnName(i);
                System.out.print(columnName);
            }
            System.out.println("");
            while (rs.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1)
                        System.out.print(", ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue);
                }
                System.out.println("");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        input.close();
    }
}