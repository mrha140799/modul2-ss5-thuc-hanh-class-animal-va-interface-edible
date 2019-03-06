package Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cục ta cục tác";
    }

    @Override
    public String howToEat() {
        return "Mổ";
    }
}
