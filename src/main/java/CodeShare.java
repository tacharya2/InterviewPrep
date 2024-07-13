//public class OrderService {
//    public double ClearanceDiscountPercentage = 0.1;
//
//    public void PlaceOrder(int customerId, List<OrderItem> items) {
//
//        CustomerApiWrapper customerWrapper = new CustomerApiWrapper();
//
//        Customer customer = customerWrapper.GetCustomerById(customerId);
//        Order order = new Order(customer, items);
//
//        // Apply clearance discount
//        double clearanceDiscount = order.Price * ClearanceDiscountPercentage;
//
//        order.Price -= clearanceDiscount;
//
//        // Apply customer discount (if any)
//        double customerDiscount = customerWrapper.GetCustomerDiscount(customerId);
//
//        if (customerDiscount > 0) {
//            double discount = order.Price * customerDiscount;
//
//            order.Price -= discount;
//        }
//
//        OrderDao orderDao = new OrderDao();
//
//        orderDao.SaveOrder(order);
//
//        ShippingService shippingService = new ShippingService();
//
//        shippingService.ShipOrder(order);
//
//        Logger logger = new Logger();
//        logger.LogInformation("Order placed and shipped: " + order);
//    }
//
//    public List<Order> GetOrdersByCustomer(int customerId) {
//        CustomerApiWrapper customerWrapper = new CustomerApiWrapper();
//        Customer customer = customerWrapper.GetCustomerById(customerId);
//        OrderDao orderDao = new OrderDao();
//        List<Order> orders = orderDao.GetOrdersByCustomer(customer);
//        foreach (Order order in orders) {
//            Items orderItems = orderDao.GetOrderItems(order.Id);
//            foreach (Item item in orderItems) {
//                order.AddItem(item);
//            }
//        }
//        return orders;
//    }
//
//    public Order GetOrderById(int orderId) {
//        OrderDao orderDao = new OrderDao();
//        Order order = orderDao.GetOrderById(orderId);
//        Items orderItems = orderDao.GetOrderItems(order.Id);
//        foreach (Item item in orderItems) {
//            order.AddItem(item);
//        }
//        return order;
//    }
//
//}
//}
