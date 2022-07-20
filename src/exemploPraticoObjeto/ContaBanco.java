package exemploPraticoObjeto;

public class ContaBanco {

    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //fim attributos

    //Construtor, Get e Set
    public ContaBanco(){ //construtor - sempre que criar conta o status é falso e o saldo é 0
        this.setStatus(false);
        this.setSaldo(0);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //fim Construtor, Get e Set

    //Métodos Personalizados
    public void abrirConta(int n, String t, String nome){ //n=numConta, t=tipo, nome=dono
        if (this.status == false || n == this.numConta) {
            if (t == "cc" || t == "cp") {
                this.setStatus(true);
                this.setNumConta(n);
                this.setTipo(t);
                this.setDono(nome);
                System.out.println("Conta Aberta com Sucesso!");
                if (this.tipo == "cc") { //se for conta corrente
                    this.saldo += 50;
                } else { //se for conta poupança
                    this.saldo += 150;
                }
            }else {
                System.out.println("Inválido, coloque cc para conta corrente ou cp para conta poupança");
            }
        }else{
            System.out.println("Esta conta ja existe!");
        }

    }

    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("CONTA FECHADA");
        }else if(this.getSaldo() > 0){
            System.out.println("Não pode ser fechada - ERRO[conta esta com saldo]");
        }else{
            System.out.println("Não pode ser fechada - ERRO[conta esta negativada]");
        }
    }

    public float depositar(float add) {
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+add);
        }else{
            System.out.println("Esta conta esta fechada ou não existe!");
        }
        return this.getSaldo();
    }

    public float sacar(float tirar){
        if (this.getStatus()){
            if (this.getSaldo() > 0 && tirar <= this.getSaldo()){
                this.setSaldo(this.getSaldo()-tirar);
            }else {
                System.out.println("Saldo insuficiente para essa ação");
            }
        }else {
            System.out.println("Esta conta esta fechada ou não existe!");
        }
        return this.getSaldo();
    }

    public double pagarMensalidade(){
        if(this.getTipo() == "cc"){ //mensalidade da conta corrente
            this.setSaldo(this.getSaldo()-12);
        }else{ //mensalidade da conta poupança
            this.setSaldo(this.getSaldo()-20);
        }
        System.out.println("Mensalidade Paga com Sucesso!");
        return this.getSaldo();
    }

    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: "+getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Conta esta ativa? "+this.getStatus());
    }
    //fim Métodos Personalizados

}
