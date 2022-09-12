package poo.coffeShop.model;

public class MenuItem {
    private String nameItem;
    private TypeMenu type;
    private int price;

    //CONSTRUCTOR ITEMS


    public MenuItem(String nameItem, TypeMenu type, int price) {
        this.nameItem = nameItem;
        this.type = type;
        this.price = price;
    }

    //GETTER ITEM
    public String getNameItem() {
        return nameItem;
    }
    //SETTER ITEM
    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    //GETTER TYPE MENU
    public TypeMenu getType() {
        return type;
    }
    //SETTER TYPE MENU
    public void setType(TypeMenu type) {
        this.type = type;
    }

    //GETTER PRICE
    public int getPrice() {
        return price;
    }
    //SETTER PRICE
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return nameItem;
    }
}
