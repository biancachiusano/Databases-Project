
public class Drinks {

    private Integer drinkID;
    private String drinkName;
    private String drinkType;
    private Double drinkPrice;

    public Drinks(Integer drinkID, String drinkName, String drinkType, Double drinkPrice) {
        this.drinkID = drinkID;
        this.drinkName = drinkName;
        this.drinkType = drinkType;
        this.drinkPrice = drinkPrice;
    }

    public Integer getDrinkID() {
        return drinkID;
    }

    public void setDrinkID(Integer drinkID) {
        this.drinkID = drinkID;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public Double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(Double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}
