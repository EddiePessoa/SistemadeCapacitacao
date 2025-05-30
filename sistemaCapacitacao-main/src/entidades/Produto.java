package entidades;

public class Produto {

    private String name;
    private double price;
    private int Quantity;

    public Produto(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }



    public double TotalValueStock(){
        double total = Quantity *  price;

        return total;
    }

    public void AddProducts(int quantity){
        int  qntd = Quantity +  quantity;
        setQuantity(qntd);
    }

    public void RemoveProducts(int quantity){
        int qntd = Quantity - quantity;
        setQuantity(qntd);
    }



}
