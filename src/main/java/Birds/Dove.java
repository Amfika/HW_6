package Birds;

import Birds.Birds;

public class Dove extends Birds {

    @Override
    public void breathe(){
        System.out.println("Дыхание голубя");
    }

    @Override
    public void move() {
        System.out.println("Голубь летит");
    }

    public void voice(){
        System.out.println("Голубь курлычет");
    }
}
