package fr.digi.jdbc.bo;

import java.io.Serializable;

/**
 *  article
 *
 */
public class Article implements Serializable {


    private Long id;
    private String ref;
    private String designation;
    private double prix;
    private Long id_fou;
    private Fournisseur fournisseur;

    public Article(String ref, String designation, double prix, Fournisseur fournisseurs) {

        this.ref = ref;
        this.designation = designation;
        this.prix = prix;
        this.fournisseur = fournisseurs;
    }

    public Article(Long id, String ref, String designation, double prix) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
        this.prix = prix;
    }

    public Article(Long id, String ref, String designation) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
    }

    public Article(Long id, String ref) {
        this.id = id;
        this.ref = ref;
    }

    public Article(Long id) {
        this.id = id;
    }

    public Article() {
    }

    public Article(String ref, String designation, double prix, Long id_fou) {
        this.ref = ref;
        this.designation = designation;
        this.prix = prix;
        this.id_fou = id_fou;
    }

    /**
     * get field
     *
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return ref
     */
    public String getRef() {
        return this.ref;
    }

    /**
     * set field
     *
     * @param ref
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * get field
     *
     * @return designation
     */
    public String getDesignation() {
        return this.designation;
    }

    /**
     * set field
     *
     * @param designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * get field
     *
     * @return prix
     */
    public double getPrix() {
        return this.prix;
    }

    /**
     * set field
     *
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * get field
     *
     * @return fournisseur
     */
    public Fournisseur getFournisseur() {
        return this.fournisseur;
    }

    /**
     * set field
     *
     * @param fournisseur
     */
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    /**
     * get field
     *
     * @return id_fou
     */
    public Long getId_fou() {
        return this.id_fou;
    }

    /**
     * set field
     *
     * @param id_fou
     */
    public void setId_fou(Long id_fou) {
        this.id_fou = id_fou;
    }
}
