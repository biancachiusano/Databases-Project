public class Pizza {

    private Integer pizzaID;
    private String pizzaType;
    private Double pizzaPrice;

    public Pizza(Integer pizzaID, String pizzaType, Double pizzaPrice) {
        this.pizzaID = pizzaID;
        this.pizzaType = pizzaType;
        this.pizzaPrice = pizzaPrice;
    }

    public Integer getPizzaID() {
        return pizzaID;
    }

    public void setPizzaID(Integer pizzaID) {
        this.pizzaID = pizzaID;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(Double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
}
