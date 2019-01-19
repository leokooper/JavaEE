package ru.leonchenko.enterprise.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@WebServlet(urlPatterns = "/catalog")
public class CatalogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("/WEB-INF/jsp/catalog.jsp").forward(req,resp);
    }
}
