package Patterns.templatePattern;

/**
 * Created by Sergey on 05.07.2018.
 */
public class LatteMaker extends DrinkMaker {

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }
}
