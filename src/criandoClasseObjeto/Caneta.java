package criandoClasseObjeto;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor da caneta: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Ela esta tampada? "+this.tampada);
    }

    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO");
        }else{
            System.out.println("RABISCO");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

}
