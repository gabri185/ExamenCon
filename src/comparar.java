

public class comparar {
    public static String correo = "";
    String ip = "127.0.0.2";

    private static comparar instance = null;

    public static  comparar getInstance(){
        if (instance == null){
            instance = new comparar();
        }
        correo = "anonymous@danielcastelao.org";
        return instance;
    }
    public static  comparar getInstance(String correr){
        if (instance == null){
            instance = new comparar();
        }
        correo = correr;
        return instance;
    }

    Auxiliar(String Correo2) {
        this.correo = Correo2;
    }

    public boolean diferenciar() {
        if (correo!= "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}