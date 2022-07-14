package GetSetConstructor;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampar;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.destampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    public boolean getTampar() {
        return this.tampar;
    }
    public void setTampar(boolean t){
        this.tampar = t;
    }

    public void Status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Tampada? "+this.tampar);
    }

    public void destampar(){
        this.tampar = false;
    }
    public void tampar(){
        this.tampar = true;
    }

}
