package poo.coffeShop.model;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class CoffeeShop {
    private String name;
    private MenuItem[] menu;
    private List<MenuItem> orders;

    public CoffeeShop(String name, MenuItem[] menu) {
        this.name = name;
        this.menu = menu;
        orders = new LinkedList<MenuItem>();
    }

    //GETTER NAME
    public String getName() {
        return name;
    }

    //SETTER NAME
    //GETTER MENU
    public MenuItem[] getMenu() {
        return menu;
    }

    //SETTER MENU
    public void setMenu(MenuItem[] menu) {
        this.menu = menu;
    }

    //GETTER ORDERS
    public List<MenuItem> getOrders() {
        return orders;
    }

    //SETTER ORDERS
    public void setOrders(List<MenuItem> orders) {
        this.orders = orders;
    }

    public void addOrder(String name) {
        boolean seAgrego = false;
        for (int i = 0; i < menu.length; i++) {
            if (name.equalsIgnoreCase(menu[i].getNameItem())) {
                orders.add(menu[i]);
                seAgrego = true;
            }
        }
        if (!seAgrego) {
            JOptionPane.showMessageDialog(null, "This Item is currently Unavailable!");
        }
    }

    public void fulfillOrder() {
        if (orders.isEmpty()) {

            JOptionPane.showMessageDialog(null, "All orders have been fulfilled!");

        } else {
            JOptionPane.showMessageDialog(null, "The " + orders.get(0) + " is ready!");
            orders.remove(0);
        }
    }

    public List<MenuItem> listOrder() {

        return orders;
    }

    public int dueAmount() {
        int totalAmount = 0;

        for (int i = 0; i < orders.size(); i++) {

            totalAmount += orders.get(i).getPrice();
        }
        return totalAmount;
    }

    public String cheapestItem() {
        int cheapest = Integer.MAX_VALUE;
        String cheapestItem = "";
        for (int i = 0; i < menu.length; i++) {

            int item = menu[i].getPrice();
            if (cheapest > item) {
                cheapest = item;
                cheapestItem = menu[i].getNameItem();
            }
        }
        return "Nuestro producto mas barato es: " + cheapestItem;
    }

    public String drinksOnly(){
        return menuSelect(TypeMenu.DRINK);
    }
    public String foodOnly(){
        return menuSelect(TypeMenu.FOOD);
    }

    public String menuSelect(TypeMenu tipo){
        String resultado="";

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].getType() == tipo) {
                    resultado += menu[i].getNameItem() + "\n";
            }
        }return "La lista de "+tipo+" es: " + "\n" + resultado;
    }
}
