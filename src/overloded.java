public class overloaded {
    private double price;

    public double getPrice(){
        return price;
    }
    public void setPrice (double price){
        this.price=price;
    }
    public void getPrice (int quantity){
        return price * quantity;
    }
}