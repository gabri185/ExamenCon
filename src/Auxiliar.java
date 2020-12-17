

public class Auxiliar {
    String correo = "";
    String ip = "127.0.0.2";

    Auxiliar() {
        correo = "anonymous@danielcastelao.org";
    }

    Auxiliar(String Correo2) {
        this.correo = Correo2;
    }

    public boolean con() {
        if (correo!= "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}