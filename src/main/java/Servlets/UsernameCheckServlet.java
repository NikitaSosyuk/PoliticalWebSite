package Servlets;

import model.UserModel.UserDB;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UsernameCheck")
public class UsernameCheckServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String usernmame = req.getParameter("username");
        UserDB dataBase = new UserDB();
        resp.setCharacterEncoding("UTF-8");
        if (dataBase.getUserByName(usernmame) == null) {
            resp.getWriter().write("true");
        } else {
            resp.getWriter().write("false");
        }
    }
}
