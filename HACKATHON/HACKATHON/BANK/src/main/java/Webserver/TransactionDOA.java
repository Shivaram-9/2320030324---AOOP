package Webserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDOA {

    private final String JDBC_URL = "jdbc:mysql://localhost:3306/BANK";
    private final String JDBC_USER = "root";
    private final String JDBC_PASS = "sriramnandula";


    public void insertTransaction(String accountNumber, String transactionType, double amount) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS)) {
                String sql = "INSERT INTO transactions (account_number, transaction_type, amount) VALUES (?, ?, ?)";
                try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                    stmt.setString(1, accountNumber);
                    stmt.setString(2, transactionType);
                    stmt.setDouble(3, amount);
                    stmt.executeUpdate();
                    System.out.println("Transaction inserted successfully!");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); 
        }
    }


    public static void main(String[] args) {
        TransactionDOA transactionDAO = new TransactionDOA();
        

        String accountNumber = "12345267890";
        String transactionType = "Deposit";
        double amount = 260.75;


        transactionDAO.insertTransaction(accountNumber, transactionType, amount);
        

    }
}
