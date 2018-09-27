package com.company;

public class Autor {

    private String email;
    private char genero;
    private String nombre;
    private Fecha fechaNacimiento;


    Autor(String nombre, String email, char genero) {
        this.nombre = nombre;
        this.email = email;
        if ((genero == 'f') || (genero == 'm') || (genero == 'F') || (genero == 'M')) {
            this.genero = genero;
        } else throw new RuntimeException("solo se aceptan los caracteres" +
                " m (para masculino) y f(para femenino)");
    }

    Autor(String nombre, String email, char genero, int dia, int mes, int año) {
        this.nombre = nombre;
        this.email = email;
        if ((genero == 'f') || (genero == 'm') || (genero == 'F') || (genero == 'M')) {
            this.genero = genero;
        } else throw new RuntimeException("solo se aceptan los caracteres" +
                " m (para masculino) y f(para femenino)");

        this.fechaNacimiento = new Fecha(dia, mes, año);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String verAuthor() {
        return "aunthor[nombre = " + this.nombre + ", email = " + this.email +
                ", gender = " + this.genero + "]";
    }
}
