
package gato;


public class Parque{
    public static int main (String [] args){
        cat puppy=new cat ("Pitty");
        puppy.nome="Jambo";
        puppy.miar();
        cat gata=new cat("Amora");
        gata.idade=5; boolean femea =true;
        gata.miar();
        puppy.mae=gata;
        return 0;
    }
}
