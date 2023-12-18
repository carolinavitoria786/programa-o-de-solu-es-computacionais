package pratica10;

public class pratica10_ex3 {
    private int hora;
    private int minuto;
    private int segundo;

    public pratica10_ex3() {
        this(0, 0, 0);
    }

    public pratica10_ex3(int hora) {
        this(hora, 0, 0);
    }

    public pratica10_ex3(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public pratica10_ex3(int hora, int minuto, int segundo) {
        setTime(hora, minuto, segundo);
    }

    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. Utilizando valor padrão (0).");
            this.hora = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido. Utilizando valor padrão (0).");
            this.minuto = 0;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido. Utilizando valor padrão (0).");
            this.segundo = 0;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public static void main(String[] args) {
       
        pratica10_ex3 tempo1 = new pratica10_ex3(); 
        pratica10_ex3 tempo2 = new pratica10_ex3(8); 
        pratica10_ex3 tempo3 = new pratica10_ex3(12, 30); 
        pratica10_ex3 tempo4 = new pratica10_ex3(18, 45, 30); 

        System.out.println("Tempo 1: " + tempo1.toString());
        System.out.println("Tempo 2: " + tempo2.toString());
        System.out.println("Tempo 3: " + tempo3.toString());
        System.out.println("Tempo 4: " + tempo4.toString());
    }
}

