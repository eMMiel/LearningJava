
/**
 * Write a description of class DigitaleWijnKelder here.
 *
 * @Emiel Duhayon
 * @v0.01 28/09/2022
 */
public class DigitaleWijnKelder
{
    // instance variables - replace the example below with your own
    private String Naam;
    private String Soort; /** Wit, Rosé of Rood */
    private int Jaartal;
    private double AlcoholPercentage;
    private boolean Bio;

    public DigitaleWijnKelder(String naamWijn, String soortWijn, int jaartalWijn, double alcoholPercentageWijn, boolean bioWijn)
    {
        Naam = naamWijn;
        Soort = soortWijn;
        Jaartal = jaartalWijn;
        AlcoholPercentage = alcoholPercentageWijn;
        Bio = bioWijn;
    }

    
    public String getNaamWijn()
    {    
        return Naam;
    }
    public String getSoortWijn()
    {
        return Soort;
    }
    public int getJaartal()
    {
        return Jaartal;
    }
    public double getAlcoholPercentage()
    {
        return AlcoholPercentage;
    }
    public boolean getBioWijn()
    {
        return Bio;
    }
    public void editNaamWijn(String nieuwNaam)
    {
        Naam = nieuwNaam;
    }
    public void editSoortWijn(String nieuwSoort)
    {
        Soort = nieuwSoort;
    }
    public void editJaartalWijn(int nieuwJaartal)
    {
       Jaartal = nieuwJaartal;         
    }
    public void editAlcoholPercentage(double nieuwAlcohol)
    {
        AlcoholPercentage = nieuwAlcohol;        
    }
    public void editBioWijn(boolean nieuwBio)
    {
        Bio = nieuwBio;
    }
    public int leeftijdWijn()
    {
        int huidigJaartal = java.time.LocalDate.now().getYear();
        int leeftijdWijn = huidigJaartal - Jaartal;
        return leeftijdWijn;
    }
}
