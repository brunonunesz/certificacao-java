public class ManipuleString{

    public static void main(String[] args){
        String name = "Bruno";
        String emBranco = " ";
        String java = "java";
        String newJava = java.substring(2);

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(emBranco.trim().isEmpty());  //true
        System.out.println(emBranco.isEmpty()); //false
        System.out.println(java.replace('j', 'J'));
        System.out.println("javaj".replace('j', 'J'));
        System.out.println(newJava);
    }
}