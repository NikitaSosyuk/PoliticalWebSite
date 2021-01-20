package Servlets;

import model.NewsModel.News;
import model.NewsModel.NewsDAO;
import model.NewsModel.NewsDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet("/homePage")
public class HomePageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NewsDAO newsDB = new NewsDB();
        List<News> news;
        if (req.getParameter("id") == null) {
            news= newsDB.getAllNews();
        } else {
            news = newsDB.getNewsByConsignmentId(Integer.parseInt(req.getParameter("id")));
        }


        req.setAttribute("news", news);
        req.getServletContext().getRequestDispatcher("/homePage.jsp").forward(req, resp);
    }

}
