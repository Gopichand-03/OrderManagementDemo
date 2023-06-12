package Project.OrderManagementDemo.dto;

import Project.OrderManagementDemo.model.ShoppingCart;
import Project.OrderManagementDemo.util.DateUtil;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

public class OrderDTO {

    private String orderDescription;
    private List<ShoppingCart> cartItems;
    private String customerAdress;
    private String customerName;
    private long customerId;
    private LocalDateTime dateAt;

    public OrderDTO() {
    }

    public OrderDTO(String orderDescription, List<ShoppingCart> cartItems, long customerId, String customerAdress, String customerName, LocalDateTime dateAt) {
        this.orderDescription = orderDescription;
        this.cartItems = cartItems;
        this.customerAdress = customerAdress;
        this.customerName = customerName;
        this.customerId = customerId;
        this.dateAt  = dateAt;
    }

    public LocalDateTime getDateAt() {

        return LocalDateTime.now();
    }

    public void setDateAt(LocalDateTime dateAt) {
        this.dateAt = dateAt;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public List<ShoppingCart> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<ShoppingCart> cartItems) {
        this.cartItems = cartItems;
    }

    public String getCustomerAdress() {return customerAdress;}

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderDescription='" + orderDescription + '\'' +
                ", cartItems=" + cartItems +
                ", customerEmail='" + customerAdress + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
