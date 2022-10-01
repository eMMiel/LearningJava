
/**
 * Write a description of class Cirkel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cirkel
{
    // instance variables - replace the example below with your own
    private double straal;

    /**
     * Constructor for objects of class Cirkel
     */
    public Cirkel(double giveStraal)
    {
        if (giveStraal > 0){
            straal = giveStraal;
        }
        else {
            System.out.println("Geef een positief getal voor de straal");
        }
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double oppervlakteCirkel()
    {
        double oppervlakteCirkel = 3.14 * straal * straal;
        return oppervlakteCirkel;
    }
    public double omtrekCirkel()
    {
        double omtrekCirkel = 3.14 * straal + straal;
        return omtrekCirkel;
    }
}
