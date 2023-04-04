package com.exemple.model;

import java.sql.SQLException;
import java.util.List;
public class Test {

    public static void main(String[] args) {


        try {
                // entity
                Client cli  = new Client(0,"User","314728865","PK5926514");

                //Transacatio
                ClientDAO clidao = new ClientDAO();

                // save trasanction
                clidao.save(cli);


             List<Client> mylist =  clidao.getAll();

            for (Client temp :mylist) {

                System.out.println(temp.toString());

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        try {
            // entity
            Produit pri  = new Produit(0l,"Tomate",31.46f,"2", "Legume");

            //Transacatio
            ProduitDAO pridao = new ProduitDAO();

            // save trasanction
            pridao.save(pri);


            List<Produit> mylist =  pridao.getAll();

            for (Produit temp :mylist) {

                System.out.println(temp.toString());

            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            // entity
            Commande com  = new Commande(0l,"PK5926514","Tomate","1", "Paye");

            //Transacatio
            CommandeDAO comDAO = new CommandeDAO();

            // save trasanction
            comDAO.save(com);


            List<Commande> mylist =  comDAO.getAll();

            for (Commande temp :mylist) {

                System.out.println(temp.toString());

            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    }
