/**
 * Write a description of class Fichier here.
 * 
 * @author (KETAM) 
 * @version (03-10-2017)
 */
public abstract class Composant
{
    private String nom;
    abstract int calculTaille();
    public void setNom(String nom) { this.nom = nom;}
    public String getNom() { return nom;}
}
