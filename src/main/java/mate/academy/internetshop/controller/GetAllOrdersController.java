package mate.academy.internetshop.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mate.academy.internetshop.lib.Injector;
import mate.academy.internetshop.model.Order;
import mate.academy.internetshop.service.OrderService;
import mate.academy.internetshop.service.UserService;

public class GetAllOrdersController extends HttpServlet {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy.internetshop");
    private UserService userService =
            (UserService) INJECTOR.getInstance(UserService.class);
    private OrderService orderService =
            (OrderService) INJECTOR.getInstance(OrderService.class);

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Long userId = (Long) req.getSession().getAttribute("user_id");
        List<Order> orders = orderService.getUserOrders(userService.get(userId));
        req.setAttribute("orders", orders);
        req.getRequestDispatcher("/WEB-INF/views/orders/allOrders.jsp").forward(req, resp);
    }
}
