package Animals;

import Animals.Animals;

public class Lion extends Animals {

    @Override
    public void breathe(){
        System.out.println("Дыхание льва");
    }

    @Override
    public void move() {
        System.out.println("Лев медленно двигается");
    }

    public void growl(){
        System.out.println("Лев рычит");
    }
}
