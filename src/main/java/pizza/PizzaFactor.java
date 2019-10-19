package pizza;

import java.util.List;

public class PizzaFactor {

    public static Pizza create(PizzaType pizzaType, double cost, List<String> components )

    {if(PizzaType.CAPRICIOSA.equals(pizzaType))
        {
return new CapriciosaPizza(cost,components, PizzaType.CAPRICIOSA);


        }
        else if(PizzaType.MARGHERITA.equals(pizzaType))

    {

        return new CapriciosaPizza(cost,components,PizzaType.MARGHERITA);
    }

        else if(PizzaType.HAWAI.equals(pizzaType))

    {

        return new HawaiPizza(cost,components,PizzaType.HAWAI);
    }
        else
    {

        return null;
    }

    }
}
