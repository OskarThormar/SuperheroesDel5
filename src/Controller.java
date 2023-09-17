import database.Database;
import superhero.Superhero;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Controller {
    private Database db;
    public Controller() {
        this.db = new Database();
    }


    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        db.addSuperhero(name, realName, superPower, yearCreated, isHuman, strength);
    }
    public ArrayList<Superhero> getSuperheroes() {
        return db.getSuperheroes();
    }
    public String getIndexedSuperheroes(){
        return db.getIndexedSuperheroes();
    }
    // Din searchForSuperhero tager en String som argument, men du giver ikke nogen.
 //   public String getSearchForSuperheroes(){
 //       return db.searchForSuperheroes();
 //   }
}
