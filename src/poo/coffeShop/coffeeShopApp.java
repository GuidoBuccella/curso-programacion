package poo.coffeShop;

import poo.coffeShop.model.CoffeeShop;
import poo.coffeShop.model.MenuItem;
import poo.coffeShop.model.TypeMenu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class coffeeShopApp {
    public static void main(String[] args) {

        //ITEMS
        MenuItem orangeJuice =new MenuItem("Orange Juice", TypeMenu.DRINK,200);
        MenuItem lemonade =new MenuItem("Lemonade", TypeMenu.DRINK,180);
        MenuItem cranberryJuice =new MenuItem("Cranberry", TypeMenu.DRINK,250);
        MenuItem pineappleJuice =new MenuItem("Pineapple Juice", TypeMenu.DRINK,250);
        MenuItem lemonIcedTea =new MenuItem("Lemon Iced Tea", TypeMenu.DRINK,250);
        MenuItem vanillaChaiLatte =new MenuItem("Vanilla Chai Latte", TypeMenu.DRINK,300);
        MenuItem hotChocolate =new MenuItem("Hot Chocolate", TypeMenu.DRINK,300);
        MenuItem icedCoffee =new MenuItem("Iced Coffee", TypeMenu.DRINK,280);
        MenuItem tunaSandwich =new MenuItem("Tuna Sandwich", TypeMenu.FOOD,500);
        MenuItem hamCheeseSandwich =new MenuItem("Ham and Cheese Sandwich", TypeMenu.FOOD,550);
        MenuItem baconAndEgg =new MenuItem("Bacon and Egg", TypeMenu.FOOD,550);
        MenuItem steak =new MenuItem("Steak", TypeMenu.FOOD,600);
        MenuItem hamburger =new MenuItem("Hamburger", TypeMenu.FOOD,600);
        MenuItem cinnamonRoll =new MenuItem("Cinnamon Roll", TypeMenu.FOOD,450);

        MenuItem[] menu={orangeJuice,lemonade,cranberryJuice,pineappleJuice,lemonIcedTea,vanillaChaiLatte,
                         hotChocolate,icedCoffee,tunaSandwich,hamCheeseSandwich,baconAndEgg,steak,hamburger,
                         cinnamonRoll};

        CoffeeShop guidoCoffee= new CoffeeShop("Guido's Caffee",menu);


        //guidoCoffee.fulfillOrder();
        System.out.println(guidoCoffee.cheapestItem());
        guidoCoffee.menuSelect(TypeMenu.FOOD);
        System.out.println(guidoCoffee.drinksOnly());
        System.out.println(guidoCoffee.foodOnly());
        /*guidoCoffee.addOrder("Lemonade");
        guidoCoffee.addOrder("Tuna Sandwich");
        guidoCoffee.addOrder("Ham and Cheese Sandwich");
        System.out.println(guidoCoffee.listOrder());
        System.out.println(guidoCoffee.dueAmount());
        guidoCoffee.fulfillOrder();
        guidoCoffee.fulfillOrder();
        guidoCoffee.fulfillOrder();*/


    }
}
