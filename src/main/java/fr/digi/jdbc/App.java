package fr.digi.jdbc;

import fr.digi.jdbc.bll.ArticleService;
import fr.digi.jdbc.bll.FournisseurService;
import fr.digi.jdbc.bo.Article;
import fr.digi.jdbc.bo.Fournisseur;

import java.sql.SQLException;
import java.util.Scanner;

public class App {

    public static FournisseurService fournisseurService = FournisseurService.getSingle();
    public static ArticleService articleService = ArticleService.getSingle();

    public static void main(String[] args) throws SQLException {

        //FournisseurService service = new FournisseurService(); ==> Couplage fort
        //FournisseurService service = FournisseurService.getSingle(); ==> Couplage faible
        /*System.out.println("Bienvenue dans ma super app !!");
        System.out.println("Faites votre choix :");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            choice = displayMenu(scanner);
            switch (choice) {
                case 1:
                    getAllFournisseur();
                    break;
            }

        } while (choice < 5);*/
        //insertFournisseur("La Maison de la Peinture");
        //getAllFournisseur();
        //getOneFournisseur(12L);
        //updateFournisseur(2L, "FDM SAS");

        /*Fournisseur fournisseur = fournisseurService.getOne(1L);
        Article article1 = new Article();
        article1.setRef("A01");
        article1.setDesignation("Peinture blanche 1L");
        article1.setPrix(12.5);
        article1.setFournisseur(fournisseur);
        articleService.create(article1);
        *//*---------------------------------*//*
        Article article2 = new Article();
        article2.setRef("D01");
        article2.setDesignation("Peinture rouge mate 1L");
        article2.setPrix(15.5);
        article2.setFournisseur(fournisseur);

        articleService.create(article2);
        *//*---------------------------------*//*
        Article article3 = new Article();
        article3.setRef("H01");
        article3.setDesignation("Peinture bleue mate 1L");
        article3.setPrix(15.5);
        article3.setFournisseur(fournisseur);
        articleService.create(article3);*/


        articleService.reducePriceMat();
        System.out.println("Le prix moyen des peintures est de : "+articleService.averagePrice()+" €");
    }

    /**
     * display menu
     *
     * @param scanner scanner
     * @return {@link int}
     */
    public static int displayMenu(Scanner scanner) {
        int menuOption;

        System.out.println("Faites votre choix :");
        System.out.println("1. Voir tous le fournisseurs");
        System.out.println("2. Voir le fournisseur de votre choix (l'id du fournisseur)");
        System.out.println("3. Mettre a jour un fournisseur (indiquer l'id du fournisseur puis son nouveau nom)");
        System.out.println("4. Supprimmer un fournisseur");
        System.out.println("5. Sortir");

        menuOption = Integer.parseInt(scanner.next());
        return menuOption;
    }

    /**
     * get all fournisseur
     */
    public static void getAllFournisseur() {
        try {
            fournisseurService.getAll();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * insert fournisseur
     *
     * @param fournisseur fournisseur
     */
    public static void insertFournisseur(String fournisseur) {
        try {
            fournisseurService.create(new Fournisseur(fournisseur));
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * get one fournisseur
     *
     * @param aLong aLong
     */
    public static void getOneFournisseur(Long aLong) {
        try {
            fournisseurService.getOne(aLong);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * update fournisseur
     *
     * @param idFournisseur idFournisseur
     * @param name          name
     */
    public static void updateFournisseur(Long idFournisseur, String name) {
        try {
            Fournisseur updateFournisseur = new Fournisseur(idFournisseur, name);
            fournisseurService.update(updateFournisseur);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * delete fournisseur
     *
     * @param idFournisseur idFournisseur
     */
    public static void deleteFournisseur(Long idFournisseur) {
        try {
            fournisseurService.delete(idFournisseur);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
