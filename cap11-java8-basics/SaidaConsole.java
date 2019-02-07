public class SaidaConsole{

    public static void main(String[] args){
        
        System.out.printf("%s %n", "foo");
        System.out.printf("%b %n", false);
        System.out.printf("%d %n", 42);
        System.out.printf("%d %n", 1024L);
        System.out.printf("%f %n", 24.9f);
        System.out.printf("%f %n", 44.0);
        System.out.printf("%c %n", 'a');
        System.out.printf("%s, it's %b, the result is %d %n", "yes", true, 100);
        System.out.printf("%2$s %1$s %n", "World", "Hello");
        System.out.printf("%5d%n", 22);
        System.out.printf("[%+05d] %n", 22);
        System.out.printf("[%-5s] %n", "foo");
    }
}