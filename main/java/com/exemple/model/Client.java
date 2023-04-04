package com.exemple.model;


// java beans (Entity)
public class Client {

        private int id_client ;

        private String nom ;

        private String telephone ;

        private String cin ;


    public Client() {
    }

    public Client(int id_client, String nom, String telephone, String cin) {
        this.id_client = id_client;
        this.nom = nom;
        this.telephone = telephone;
        this.cin = cin;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelepehone() {
        return telephone;
    }

    public void setTelepehone(String telepehone) {
        this.telephone = telepehone;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }


    @Override
    public String toString() {
        return "client{" +
                "id_client=" + id_client +
                ", nom='" + nom + '\'' +
                ", telepehone='" + telephone + '\'' +   ", Cin='" + cin + '\'' +
                '}';
    }
}
