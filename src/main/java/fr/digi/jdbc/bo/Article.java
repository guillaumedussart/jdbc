package fr.digi.jdbc.bo;

import java.io.Serializable;
import java.util.List;

/**
 *  article
 *
 */
public class Article implements Serializable {
    private int id;
    private String ref;
    private String designation;
    private double prix;
    private List<Fournisseur> fournisseurs;

    public Article(int id, String ref, String designation, double prix, List<Fournisseur> fournisseurs) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
        this.prix = prix;
        this.fournisseurs = fournisseurs;
    }

    public Article(int id, String ref, String designation, double prix) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
        this.prix = prix;
    }

    public Article(int id, String ref, String designation) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
    }

    public Article(int id, String ref) {
        this.id = id;
        this.ref = ref;
    }

    public Article(int id) {
        this.id = id;
    }

    public Article() {
    }

    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
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
     * @return fournisseurs
     */
    public List<Fournisseur> getFournisseurs() {
        return this.fournisseurs;
    }

    /**
     * set field
     *
     * @param fournisseurs
     */
    public void setFournisseurs(List<Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
    }
}
