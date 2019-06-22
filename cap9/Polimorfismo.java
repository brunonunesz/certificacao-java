import java.io.FileNotFoundException;
import java.io.IOException;

public class Polimorfismo{

    public static void main(String[] args) throws IOException{
        
    }
}

interface Vehicle{
    int getSpeed();
    void turnon();
}

abstract class Car implements Vehicle{
    public void turnon(){
        System.out.println("on!");
    }
}

class ConcreteCar extends Car implements Vehicle {
    public int getSpeed(){
        return 1;
    }
}