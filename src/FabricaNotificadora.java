public class FabricaNotificadora {

    public static Notificable obtenerNotificador(String tipo) {
        switch (tipo) {
            case "CORREO" :
                return new Correo();
            case "CARTA" :
                return new Carta();
            case "TXT" :
                return new MensajeTexto();
            default:
                return new Correo();
        }
    }
}
