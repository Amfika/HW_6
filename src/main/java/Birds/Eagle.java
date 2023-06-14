package Birds;

import Birds.Birds;

public class Eagle extends Birds {

    @Override
    public void breathe(){
        System.out.println("Дыхание орла");
    }

    @Override
    public void move() {
        System.out.println("Орёр взмахивает крылом");
    }

    public void eat(){
        System.out.println("Орёл предпочитает охотиться на грызунов");
    }
}
