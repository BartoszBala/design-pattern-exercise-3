package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        CapriciosaPizza capriciosaPizza = new CapriciosaPizza(31.99,Arrays.asList("cheese","champignons","ham"));
//        HawaiPizza hawaiPizza = new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
//        MargheritaPizza margheritaPizza = new MargheritaPizza(24, Arrays.asList("cheese"));


        Pizza capriciosaPizza = PizzaFactor.create(PizzaType.CAPRICIOSA,32,Arrays.asList("cheese","champignons","ham"));
        Pizza hawaiPizza = PizzaFactor.create(PizzaType.HAWAI,55,Arrays.asList("cheese","pineaple","ham"));
        Pizza margheritaPizza = PizzaFactor.create(PizzaType.MARGHERITA,45,Arrays.asList("cheese"));
        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();
      margheritaPizza.showPizzaInfo();
    }

}
