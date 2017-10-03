/**
 * Write a description of class Fichier here.
 * 
 * @author (KETAM) 
 * @version (03-10-2017)
 */
public class Fichier extends Composant
{
    private int taille;

    /**
     * Constructor for objects of class Fichier
     */
    public Fichier(String nom, int taille)
    {
        this.setNom(nom);
        this.taille = taille;
    }
    public int calculTaille()
    {
        return taille;
    }
}
