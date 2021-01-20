package Servlets;

import model.UserModel.UserDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/ErrorSignInPage")
public class ErrorSignInPageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String cookieCheck = req.getParameter("radio");
        HttpSession session = req.getSession();

        UserDB users = new UserDB();

        if(username.equals("") || password.equals("")) {
            req.getServletContext().getRequestDispatcher("/signInPage.html").forward(req, resp);
        } else {
            if (users.userIsExist(username, password)) {
                resp.sendRedirect("/homePage");
                session.setAttribute("username", username);
                if (cookieCheck != null && cookieCheck.equals("true")) {
                    Cookie cookie = new Cookie("saved", username);
                    cookie.setMaxAge(100);
                    resp.addCookie(cookie);
                }
            } else {
                req.getServletContext().getRequestDispatcher("/ErrorSignInPage.html").forward(req, resp);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/ErrorSignInPage.html").forward(req, resp);
    }

}
