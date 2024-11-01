package Webserver;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/TransactionsServlet")
public class TransactionsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String accountNumber = request.getParameter("accountNumber");
        String transactionType = request.getParameter("transactionType");
        double amount = Double.parseDouble(request.getParameter("amount"));


        new Thread(() -> {
        	TransactionDOA transactionDAO = new TransactionDOA();
            transactionDAO.insertTransaction(accountNumber, transactionType, amount);
        }).start();
        response.sendRedirect("acknowledgment.jsp");
    }
}
