package URFU.EducationProject.ShoppingService.Contracts;

public class PurchaseDto {
    private double price;
    private InfoDto info;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InfoDto getInfo() {
        return info;
    }

    public void setInfo(InfoDto info) {
        this.info = info;
    }
}
