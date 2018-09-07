package Patterns.templatePattern;

/**
 * Created by Sergey on 05.07.2018.
 */
public abstract class DrinkMaker {          // класс имеющий хоть один абстрактный метод обязан быть абстрактным классом

    abstract void getRightCup();   // выбрать подходящую чашку

    abstract void putIngredient();  // положить ингредиенты

    abstract void pour();           // залить жидкостью

    void makeDrink() {              // сделать напиток
        getRightCup();
        putIngredient();
        pour();
    }
}
