public class ExercicioString{
    public static void main(String[] args){
        String s = "estudando para a certificação";
        System.out.println(s.substring(3, 6));
    }
}

class D{
    String msg;

    void imprime(){
        if(!msg.isEmpty())
            System.out.println(msg);
        else 
            System.out.println("empty");
    }
}