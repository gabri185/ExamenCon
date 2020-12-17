

public class Main {


    public static void main(String[] args) {
        if (conectar("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (conectar2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
    }

    public static boolean conectar(String comando) {
        comparar compr = comparar.getInstance();
        System.out.println("Conectando a " + compr.ip + ", con el usuario " + comando);
        return compr.diferenciar();
    }

    public static boolean metodo2() {
        comparar compr2 = comparar.getInstance();
        System.out.println("Conectando a " + compr2.ip + ", con el usuario " + compr2.correo);
        return compr2.diferenciar();
    }
}
