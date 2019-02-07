class A{
    
    public static void main(String[] args){
        new B().x(new Object[]{34789, 673482});
    }
}

class B{

    void x(Object... args){
        System.out.println(args.length);
    }
}
