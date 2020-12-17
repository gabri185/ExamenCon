package com.cod;

public class Auxiliar {
    String email = "";
    String ip_1 = "127.0.0.2";

    Auxiliar() {
        email = "anonymous@danielcastelao.org";
    }

    Auxiliar(String param1) {
        this.eemail = param1;
    }

    public boolean con() {
        if (email != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}