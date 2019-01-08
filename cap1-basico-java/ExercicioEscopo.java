public class ExercicioEscopo{

    public static void main(String[] x){
        ExercicioEscopoOne e = new ExercicioEscopoOne();
        //e.metodo1(); //Ex. 1
        //e.metodo2(); //Ex. 2
        //e.metodo3();   //Ex. 3 
        //e.metodo4(x);  //Ex. 4
        e.metodo5(); //Ex. 5
    }
}

class ExercicioEscopoOne{

    static int x = 15;
    static int i = 3;

    /*public void metodo1(){
        for(int i = 0; i < 20; i++){
            System.out.println(i);
        }
        System.out.println(i);
        //Compilador Java inteligente para reconhecer o escopo da variável.
    }*/

    public void metodo2(){
        for(int i = 0; i < 20; i++){
            System.out.println(i);
            System.out.println(i);
            System.out.println("finished");
        }
    }

    public void metodo3(){
        for(int i = 0; i < 20; i++){
            System.out.println(i);
        }
        
        int i = 15;
        System.out.println(i);
    }

    /*public void metodo4(String[] x){
        x = 200;
        System.out.println(x);
    }*/

    public void metodo5(){
        for(new ExercicioEscopoOne().i = 10; new ExercicioEscopoOne().i < 100; 
            new ExercicioEscopoOne().i++){
                System.out.println(i);
            }
    }
}