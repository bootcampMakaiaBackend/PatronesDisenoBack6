public class Correo implements Notificable{
    @Override
    public void notificar() {
        System.out.println("Notificando desde el  correo electronico");
    }
}
