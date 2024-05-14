public class MensajeTexto implements Notificable{
    @Override
    public void notificar() {
        System.out.println("Enviando mensaje desde texto");
    }
}
