public class CapOneBasicoJava{

    public static void main(String[] args){
        System.out.println("Compartilhando a variável static para todas as instâncias");
        System.out.println("Acessando direto com a classe " + VariavelStatic.varStatic);
        System.out.println("Acessando através da instância " + new VariavelStatic().varStatic);

        VariavelStatic vs = new VariavelStatic();
        vs.metodo2(11);
    }

}

class VariavelStatic{

    public static String varStatic = "Bruno Static";
    public int mesmoNome = 10;
    //public String varStatic = "Bruno2 Static"; Não posso variável já definida

    public void metodo1(int mesmoNome){
        //Compila
    }

    public void metodo2(int mesmoNome){
        System.out.println("Variáveis com o mesmo nome, tecnica de shadowing");  
        System.out.println("variável de instância com this: " + this.mesmoNome);
        System.out.println("Variável de menor escopo, local: " + mesmoNome);
    }

}