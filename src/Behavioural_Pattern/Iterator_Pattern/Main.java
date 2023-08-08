package Behavioural_Pattern.Iterator_Pattern;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        CollectionOfCountries collectionOfcountries = new CollectionOfCountries(5);

        collectionOfcountries.addcountry("Bangladesh");
        collectionOfcountries.addcountry("India");
        collectionOfcountries.addcountry("France");
        collectionOfcountries.addcountry("Japan");
        collectionOfcountries.addcountry("USA");

        Iterator<String> iterator = collectionOfcountries.iterator();

        while(iterator.hasNext())
        {
            String country = iterator.next();
            System.out.println("Country Name: "+country);

        }




    }
}