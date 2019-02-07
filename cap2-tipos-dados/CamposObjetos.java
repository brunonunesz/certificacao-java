public class CamposObjetos{

    public static void main(String[] args){
        B b = new B();
        b.c = 10;
        System.out.println(b.c);
        b.c(30);
        System.out.println(b.c);
    }
}

class B{
    int c;

    void c(int c){
        c = c;
    }
}