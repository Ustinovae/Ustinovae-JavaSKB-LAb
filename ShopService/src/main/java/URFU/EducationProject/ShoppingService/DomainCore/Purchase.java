package URFU.EducationProject.ShoppingService.DomainCore;

public class Purchase {
    private double price;
    private Info info;
    private int id;

    public Purchase(double price, Info info, int id){
        this.price = price;
        this.info = info;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public Info getInfo() {
        return info;
    }

    public int getId() {
        return id;
    }
}
