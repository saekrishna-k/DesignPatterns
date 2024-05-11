package Structural.decorator;

/*
 *   DECORATOR DESIGN PATTERN:
 *   =========================
 *   This pattern helps to add more functionality to existing object, without changing its structure.
 *
 * */

public class DecoratorClient {
   public static void main(String[] args){
       BasePizza farmHousePizza = new Mushroom(new ExtraCheese(new FarmHousePizza()));
       System.out.println(farmHousePizza.cost());
       BasePizza margheritaPizza = new Mushroom(new ExtraCheese(new MargheritaPizza()));
       System.out.println(margheritaPizza.cost());
   }
}
