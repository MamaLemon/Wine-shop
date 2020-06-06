package servlets;

import logic.WineService;
import logic.model.WineType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SelectWine")
public class SelectWineServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("Type");

        WineService wineService = new WineService();
        WineType wineType = WineType.valueOf(type);

        List wineBrands = wineService.getAvailableBrands(wineType);

        req.setAttribute("brands", wineBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }
}
