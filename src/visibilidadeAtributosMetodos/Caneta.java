package visibilidadeAtributosMetodos;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor da caneta: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Ela esta tampada? "+this.tampada);
    }

    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO");
        }else{
            System.out.println("RABISCO");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}
