public class No {

    public Cliente c = new Cliente();
    public No next;

    public No(int horaDeEntrada) {
        c = new Cliente(horaDeEntrada);
        this.next = null;
    }

}
