package more;

import java.util.Scanner;

public class Mornar {
    private String ime;
    private int kvalitet;

    public Mornar(String ime, int kvalitet) {
        this.ime = ime;
        this.kvalitet = kvalitet;
        if (kvalitet >= 100) {
            kvalitet = 100;
        }
        if (kvalitet <= 0) {
            kvalitet = 0;
        }
    }

    @Override
    public String toString() {
        return "Mornar{" +
                "ime='" + ime + '\'' +
                ", kvalitet=" + kvalitet +
                '}';
    }

    public String getIme() {
        return ime;
    }

    public int getKvalitet() {
        return kvalitet;
    }
}
