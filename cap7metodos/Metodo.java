package cap7metodos;

public class Metodo{

    static public void main(String[] args){
        System.out.println("Quantidade de args: " + args.length);
        
        if(args.length >= 1){
            System.out.println(args[0]);
        }
    }
}