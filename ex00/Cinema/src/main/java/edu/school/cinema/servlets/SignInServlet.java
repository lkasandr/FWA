package edu.school.cinema.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//Vhod
@WebServlet("/signIn")
public class SignInServlet extends HttpServlet {

    //В случае успешной проверки должен быть сгенерирован объект HttpSession
    // с пользовательским атрибутом (значение атрибута — объект,
    // содержащий текущие пользовательские данные).
    HttpSession session;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Hello</h1>");
        printWriter.print("<p> email :: " + email + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

        System.out.println("email :: " + email);
        System.out.println("password :: " + password);

    }
}
