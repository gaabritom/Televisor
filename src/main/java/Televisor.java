
public class Televisor {

    protected int canal;
    protected String tamanho;
    protected String modelo;

    Televisor() {
        canal = 4;
        tamanho = "15 polegadas";
        modelo = "SEMP TOSHIBA";
    }

    Televisor(int c, String t, String m) {
        canal = c;
        tamanho = t;
        modelo = m;
    }

    int getCanal() {
        return canal;
    }

    String getTamanho() {
        return tamanho;
    }

    String getModelo() {
        return modelo;
    }
}
