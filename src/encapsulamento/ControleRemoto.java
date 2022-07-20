package encapsulamento;

public class ControleRemoto implements Controlador{

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //fim atributos

    //metodos especiais
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //fim metodos especiais

    //metodos abstratos

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (isLigado()){
            System.out.println("-------MENU-------");
            System.out.println("Ligado? "+this.isLigado());
            System.out.println("Tocando? "+this.isTocando());
            System.out.print("Volume "+this.getVolume()+": ");
            for (int i=1; i<=this.getVolume(); i+=10){
                System.out.print("|");
            }
        }else {
            System.out.println("TV esta desligada, impossivel abrir menu");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() + 1);
        }else{
            System.out.println("Impossível Aumentar Volume, TV Desligada!");
        }
    }

    @Override
     public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 1);
        }else {
            System.out.println("Impossível Abaixar Volume, TV Desligada!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && this.isTocando()==false){
            this.setTocando(true);
        }else {
            System.out.println("Não deu para dar Play");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else {
            System.out.println("Não deu para pausar");
        }
    }
    //fim metodos abstratos
}
