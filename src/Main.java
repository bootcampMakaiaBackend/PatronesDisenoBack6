public class Main {
    public static void main(String[] args) {
       Notificable notificable = FabricaNotificadora.obtenerNotificador("SATELITE");
       notificable.notificar();
    }
}