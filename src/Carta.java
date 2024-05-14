public class Carta implements Notificable {

    @Override
    public void notificar() {
        System.out.println("Se esta notificando desde la Carta");
    }
}
