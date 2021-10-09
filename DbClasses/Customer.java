
public class Customer {
    private Integer customerID;
    private String customerName;
    private Integer customerPhoneNumber;
    private String customerAddress;
    private Integer numberOfOrders;

    public Customer(Integer customerID, String customerName, Integer customerPhoneNumber, String customerAddress, Integer numberOfOrders) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerAddress = customerAddress;
        this.numberOfOrders = numberOfOrders;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(Integer customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(Integer numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }
}
