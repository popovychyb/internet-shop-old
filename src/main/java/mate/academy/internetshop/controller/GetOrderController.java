package mate.academy.internetshop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mate.academy.internetshop.lib.Injector;
import mate.academy.internetshop.service.OrderService;

public class GetOrderController extends HttpServlet {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy.internetshop");
    private OrderService orderService =
            (OrderService) INJECTOR.getInstance(OrderService.class);

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("products",
                orderService.get(Long.valueOf(req.getParameter("id"))).getProducts());
        req.getRequestDispatcher("/WEB-INF/views/orders/showOrder.jsp").forward(req, resp);
    }
}
