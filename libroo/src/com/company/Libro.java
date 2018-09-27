package com.company;

public class Libro {
    private String name;
    private Autor[] autor;
    private double price;
    private int qty = 0;



    Libro(String name, Autor[] author, double price )
    {
        this.name = name;
        this.autor = author;

        if(price < 0)
        {
            throw new RuntimeException("el valor tiene que ser positivo");
        }
        else this.price = price;
    }

    Libro(String name, Autor[] author, double price, int qty)
    {
        this.name = name;
        this.autor = author;

        if(price < 0)
        {
            throw new RuntimeException("el valor tiene que ser positivo");
        }
        else this.price = price;
        this.qty = qty;
    }

    public String getAuthorName() {
        String a = "los autores del libro son: ";
        for (int i = 0; i < autor.length; i++){
            a += autor[i].getNombre() +  " ";
        }
        return a;
    }

    public String getAuthorName(int i)
    {
        if(getAutor().length < i)
        {
            return "ese indice de autor no existe";
        }
        else return getAutor()[i].getNombre();
    }

    public String toString(){

        String autores = "";
        for(int i = 0; i < autor.length; i++)
        {
            autores = autores + " " + autor[i].verAuthor();
        }

        return "Book[name = " + this.name +
                ", authors = {" + autores +
                "}, price = " + this.price + ", qty = " + this.qty + "]";
    }

    public String getName()
    {
        return name;
    }

    public Autor[] getAutor()
    {
        return autor;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQty()
    {
        return qty;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }
}
