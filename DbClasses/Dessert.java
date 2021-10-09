public class Dessert {
    private Integer dessertID;
    private String dessertString;
    private String dessertType;
    private Double dessertPrice;

    public Dessert(Integer dessertID, String dessertString, String dessertType, Double dessertPrice) {
        this.dessertID = dessertID;
        this.dessertString = dessertString;
        this.dessertType = dessertType;
        this.dessertPrice = dessertPrice;
    }

    public Integer getDessertID() {
        return dessertID;
    }

    public void setDessertID(Integer dessertID) {
        this.dessertID = dessertID;
    }

    public String getDessertString() {
        return dessertString;
    }

    public void setDessertString(String dessertString) {
        this.dessertString = dessertString;
    }

    public String getDessertType() {
        return dessertType;
    }

    public void setDessertType(String dessertType) {
        this.dessertType = dessertType;
    }

    public Double getDessertPrice() {
        return dessertPrice;
    }

    public void setDessertPrice(Double dessertPrice) {
        this.dessertPrice = dessertPrice;
    }
}
