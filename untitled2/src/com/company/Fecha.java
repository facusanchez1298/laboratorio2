package com.company;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    Fecha(int dia, int mes, int año) {
        if ((mes < 13) && (mes > 0)) {
            this.mes = mes;

            if (mes == 2) {
                if (dia > 0 && dia <= 29) {
                    this.dia = dia;
                }
            }

            if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 9) || (mes == 11)) {
                if (dia > 0 && dia <= 31) {
                    this.dia = dia;
                }
            }

            if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 9) || (mes == 11)) {
                if (dia > 0 && dia <= 31) {
                    this.dia = dia;
                }

            } else throw new RuntimeException("el dia ingresado no es valido para ese mes");
        } else throw new RuntimeException("el mes ingresado no es valido");

        this.año = año;
    }

    Fecha(String fecha){
        fromString(fecha);
    }
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }


    public Fecha fromString(String fecha) {
        int i = 0;
        String a = "", b = "", c = "";
        while( fecha.charAt(i) != '/') {
            a += fecha.charAt(i);

            i++;
        }
        this.dia = Integer.parseInt(a);
        i++;

        while( fecha.charAt(i) != '/') {
            b += fecha.charAt(i);
            i++;
        }
        i++;
        this.mes = Integer.parseInt(b);

        for(; i< fecha.length();i++){
            c += fecha.charAt(i);
        }
        this.año = Integer.parseInt(c);
        return this;
    }

    private String hasta(char caracterABuscar, String buscado, int i){

        String a = "";
        while( buscado.charAt(i) != caracterABuscar){
            a += buscado.charAt(i);
            i++;
        }
        i++;
        return a;
    }


    public void diferenciaVoid(Fecha fecha) {
        int dia, mes, año;

        dia = Math.abs(this.dia - fecha.dia);
        mes = Math.abs(this.mes - fecha.mes);
        año = Math.abs(this.año - fecha.año);

        System.out.println("la diferencia es: dias: " + dia + "\n meses: " + mes + "\n años: " + año);
    }

    public Fecha diferencia(Fecha fecha) {
        int dia, mes, año;
        dia = Math.abs(this.dia - fecha.dia);
        mes = Math.abs(this.mes - fecha.mes);
        año = Math.abs(this.año - fecha.año);

        Fecha a = new Fecha(dia, mes, año);
        return a;
    }

    public boolean equal(Fecha fecha) {
        if ((this.año == fecha.año) && (this.mes == fecha.mes) && (this.dia == fecha.dia)) {
            return true;
        } else return false;
    }
}
