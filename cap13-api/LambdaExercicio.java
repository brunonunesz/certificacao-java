import java.util.function.Predicate;

public class LambdaExercicio{
    int a = 0;
    
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            new Thread(() -> System.out.println(i)).start();
        }
    }

    private void method(int b){
        Predicate<Integer> d = a -> a > 0;
        
        if(d.test(a)){
            System.out.println(a);
        }
    }

}