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
        if(composants.contains(composant)) {
            return false;
        }
        else if((composant instanceof Repertoir) && (((Repertoir) composant).contient(this))) {
            return false;
        }
        else {
            return composants.add(composant);
        }
    }
    //calcul de taille appel a la fonction de chaque type 
      public int calculTaille()
    {
        Iterator<Composant> str = composants.iterator();
        int calcul= 0;
        while(str.hasNext()) {
            calcul +=str.next().calculTaille(); 
        }
        return calcul;
    }
    //retirer un coposant 
    public boolean retirer(Composant composant)
    {
        return composants.remove(composant);
    }
       public boolean contient(Composant comp) {
        Iterator<Composant> str = composants.iterator();
        Composant tmp;
       
        while(str.hasNext()) {
            tmp = str.next();
            
            if(tmp.equals(comp)){
                return true;
            }
            else if(tmp instanceof Repertoir) {
               //repertoir imbriquer
                 if(((Repertoir) tmp).contient(comp)) {
                    return true;
                }
            }
        }
        return false;
    }
  
}
