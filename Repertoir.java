import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Fichier here.
 * 
 * @author (KETAM) 
 * @version (03-10-2017)
 */
public class Repertoir extends Composant
{
    private ArrayList<Composant> composants;
    public Repertoir(String nom)
    {
        this.setNom(nom);
        this.composants = new ArrayList<Composant>();
    }
    public boolean ajouter(Composant composant)
    {
        if(this.contient(composant)) {
            return false;
        }
        else if((composant instanceof Repertoir) && (((Repertoir) composant).contient(this))) {
            return false;
        }
        else {
            return composants.add(composant);
        }
    }
    
    public boolean retirer(Composant composant)
    {
        return composants.remove(composant);
    }
    
    public int calculTaille()
    {
        Iterator<Composant> str = composants.iterator();
        int somme = 0;
        
        while(str.hasNext()) {
            somme +=str.next().calculTaille(); 
        }
        return somme;
    }
}
