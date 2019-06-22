package cap7metodos;

public class WhileTest {

    public static void main(String[] args) {

        int i = 1;

        //While - Estruturas

        while(i < 10){
            System.out.println(i);
            i++;
        }

        while(i < 10)
            System.out.println(i++);

        final boolean RUNNING = true;
        while(RUNNING){
            System.out.println("do something");
        }

        boolean brruno = true;
    }
}
