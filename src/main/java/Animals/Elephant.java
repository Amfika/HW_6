package Animals;

import Animals.Animals;

public class Elephant extends Animals {

    @Override
    public void breathe() {
        System.out.println("Дыхание слона");
    }

    @Override
    public void move() {
        System.out.println("Слон медленно передвигается");
    }

    public void splashWater(){
        System.out.println("Слон набирает воду в хобот и обливается");
    }
}
