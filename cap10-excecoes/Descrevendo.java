import java.sql.SQLException;

public class Descrevendo{

    public static void main(String[] args){
        new A().execute();
    }
}

class A{

    public void execute(){
        String name;

        try{
            name.toLowerCase();
            System.out.println("segunda linha do try"); //Lança NullPointer
        }catch (IndexOutOfBoundsException e){
            System.out.println("Peguei");
        }
    }
}