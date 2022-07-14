package GetSetConstructor;

public class Main {
    public static void main(String[] args){

        Caneta c1 = new Caneta("BIC", "ROXO", 0.5f); //montando caneta setando os valores normais -- esta dando errado pq ta sem argumento o construtor caneta
        c1.Status();
        System.out.println("");

        Caneta c2 = new Caneta("BIC CRISTAL", "VERMELHA", 0.7f);
        c2.Status();


    }
}
