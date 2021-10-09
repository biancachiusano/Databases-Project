
import java.time.LocalTime;

public class Order {

    private Integer orderID;
    private Integer customerID;
    private LocalTime orderTime;
    private Boolean orderConfirmation;
    private Boolean orderArrived;

    public Order(Integer orderID, Integer customerID, LocalTime orderTime, Boolean orderConfirmation, Boolean orderArrived) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.orderTime = orderTime;
        this.orderConfirmation = orderConfirmation;
        this.orderArrived = orderArrived;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public Boolean getOrderConfirmation() {
        return orderConfirmation;
    }

    public void setOrderConfirmation(Boolean orderConfirmation) {
        this.orderConfirmation = orderConfirmation;
    }

    public Boolean getOrderArrived() {
        return orderArrived;
    }

    public void setOrderArrived(Boolean orderArrived) {
        this.orderArrived = orderArrived;
    }
}
