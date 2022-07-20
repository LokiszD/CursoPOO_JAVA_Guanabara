package exemploPraticoObjeto;

public class Main {
    public static void main(String[] args) {

    ContaBanco cb1 = new ContaBanco();

    cb1.abrirConta(1111, "cc", "Lucas Dias");
    cb1.depositar(500);
    cb1.sacar(50);
    cb1.pagarMensalidade();
    cb1.sacar(488);
    cb1.fecharConta();
    cb1.estadoAtual();

    ContaBanco cb2 = new ContaBanco();

    cb2.abrirConta(1112,"cp", "antonieta");
    cb2.estadoAtual();



    }
}
