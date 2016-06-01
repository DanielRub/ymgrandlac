/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Daniel Rub <daniel.rubambura at danielrubambura@gmail.com>
 */
@Named(value = "parent")
@ApplicationScoped
public class Parent {

    /**
     * Creates a new instance of Parent
     */
    public Parent() {

    }
    private String message;
    private String sendLabel = "Envoyer";
    private String telNumber;
    private int idDestinataire = 0;
    private String labelDestinataire = "Tél";
    private String labelParent = "Tous";
    private int idLabelParent = 0;
    private String labelPersonnel = "Tous";
    private int idLabelPersonnel = 0;
    private String labelEtudiant = "Tous";
    private int idLabelEtudiant = 0;

    private int idFaculte;
    private int idDépartement;
    private int idPromotion;

    public String getLabelEtudiant() {
        return labelEtudiant;
    }

    public void setLabelEtudiant(String labelEtudiant) {
        this.labelEtudiant = labelEtudiant;
    }

    public int getIdLabelEtudiant() {
        return idLabelEtudiant;
    }

    public void setIdLabelEtudiant(int idLabelEtudiant) {
        switch (idLabelEtudiant) {
            case 0:
                setLabelEtudiant("Tous");
                break;
            case -1:
                setLabelEtudiant("Litige des Frais");
                break;
            case -2:
                setLabelEtudiant("Choisir..");
                break;
            case 1:
                setLabelEtudiant("FSTA");
                break;
            case 2:
                setLabelEtudiant("FSEG");
                break;

        }
        this.idLabelEtudiant = idLabelEtudiant;
    }

    public String getLabelPersonnel() {
        return labelPersonnel;
    }

    public void setLabelPersonnel(String labelPersonnel) {
        this.labelPersonnel = labelPersonnel;
    }

    public int getIdLabelPersonnel() {
        return idLabelPersonnel;
    }

    public void setIdLabelPersonnel(int idLabelPersonnel) {
        switch (idLabelPersonnel) {
            case 0:
                setLabelPersonnel("Tous");
                break;
            case 1:
                setLabelPersonnel("Choisir..");
                break;
        }
        this.idLabelPersonnel = idLabelPersonnel;
    }

    public int getIdLabelParent() {
        return idLabelParent;
    }

    public void setIdLabelParent(int idLabelParent) {
        switch (idLabelParent) {
            case 0:
                setLabelParent("Tous");
                break;
            case 1:
                setLabelParent("Litige des Frais");
                break;
            case 2:
                setLabelParent("Choisir..");
                break;
        }
        this.idLabelParent = idLabelParent;
    }

    public String getLabelParent() {
        return labelParent;
    }

    public void setLabelParent(String labelParent) {
        this.labelParent = labelParent;
    }

    public String getLabelDestinataire() {
        return labelDestinataire;
    }

    public void setLabelDestinataire(String labelDestinataire) {
        this.labelDestinataire = labelDestinataire;
    }

    public int getIdDestinataire() {
        return idDestinataire;
    }

    public void setIdDestinataire(int idDestinataire) {
        setIdLabelParent(0);
        setIdLabelEtudiant(0);
        setIdLabelPersonnel(0);
        switch (idDestinataire) {
            case 0:
                setLabelDestinataire("Tél");
                break;
            case 1:
                setLabelDestinataire("Parents");
                break;
            case 2:
                setLabelDestinataire("Etudiants");
                break;
            case 3:
                setLabelDestinataire("Personnel");
                break;
        }
        System.out.println("LabelDestinataire = " + labelDestinataire);
        this.idDestinataire = idDestinataire;
    }

    public String getMessage() {
        return message;
    }

    public String getSendLabel() {
        return sendLabel;
    }

    public void setSendLabel(String sendLabel) {
        this.sendLabel = sendLabel;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void afficher() {
        System.out.println("sendLabel = " + sendLabel);
    }

    public String sendmessage() {
        System.out.println("sendLabel = " + sendLabel);
        this.setSendLabel("Envoi en cours..");
        System.out.println("sendLabel = " + sendLabel);
        System.out.println("this.telNumber = " + this.telNumber);
        System.out.println("this.message = " + this.message);

        return null;
    }
}
