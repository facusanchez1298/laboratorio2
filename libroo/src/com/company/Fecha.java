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

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }



    ///aca me estaba haciendo un bardo al pedo, hasta que vi que con numeros absolutos quedaba todo bien
   /* public void diferencia(Fecha fecha) {
        int año, mes, dia;
        int[] meses = {31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Fecha yo = this;

        if (yo.año > fecha.año) {
            if (yo.dia < fecha.dia) {
                yo.dia += meses[yo.mes - 1];
                yo.mes -= 1;

                dia = yo.dia - fecha.dia;
            } else dia = yo.dia - fecha.dia;

            if (yo.mes < fecha.mes) {
                yo.mes += 12;
                yo.año -= 1;
                mes = yo.mes - fecha.mes;
            } else mes = yo.mes - fecha.mes;

            año = yo.año - fecha.año;
        }



        if(yo.año < fecha.año){
            if (fecha.dia < yo.dia) {
                fecha.dia += meses[fecha.mes - 1];
                fecha.mes -= 1;

                dia = fecha.dia - yo.dia;
            } else dia = fecha.dia - yo.dia;

            if (fecha.mes < yo.mes) {
                fecha.mes += 12;
                fecha.año -= 1;
                mes = fecha.mes - yo.mes;
            } else mes = fecha.mes - yo.mes;

            año = fecha.año - yo.año;
        }


        if(yo.año == fecha.año){

        }
    }*/

   public void diferenciaVoid(Fecha fecha){
        int dia, mes, año;

        dia = Math.abs(this.dia - fecha.dia);
        mes = Math.abs(this.mes - fecha.mes);
        año = Math.abs(this.año - fecha.año);

        System.out.println("la diferencia es: dias: " + dia + "\n meses: " + mes + "\n años: " + año);
   }

   public Fecha diferencia(Fecha fecha){
       int dia, mes, año;
       dia = Math.abs(this.dia - fecha.dia);
       mes = Math.abs(this.mes - fecha.mes);
       año = Math.abs(this.año - fecha.año);

       Fecha a = new Fecha(dia, mes, año);
       return a;
   }

   public boolean equal(Fecha fecha){
       if((this.año == fecha.año) && (this.mes == fecha.mes) && (this.dia == fecha.dia)){
           return true;
       }
       else return false;
   }
}