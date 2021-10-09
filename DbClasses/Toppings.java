
public class Toppings {

    private Integer toppingID;
    private String toppingName;
    private Double toppingPrice;
    private Boolean vegetarian;

    public Toppings(Integer toppingID, String toppingName, Double toppingPrice, Boolean vegetarian) {
        this.toppingID = toppingID;
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
        this.vegetarian = vegetarian;
    }

    public Integer getToppingID() {
        return toppingID;
    }

    public void setToppingID(Integer toppingID) {
        this.toppingID = toppingID;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public Double getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(Double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}
