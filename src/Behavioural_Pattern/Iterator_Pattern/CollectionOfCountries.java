package Behavioural_Pattern.Iterator_Pattern;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CollectionOfCountries implements Iterable<String> {

    private String[] countries;
    private int size;

    public CollectionOfCountries(int Capacity){

        countries = new String[Capacity];
        size=0;

    }

    public void addcountry(String country){
        if(size<countries.length){
            countries[size]=country;
            size++;
        }

    }

    public Iterator<String> iterator(){

        return new CountryIterator();

    }

    private class CountryIterator implements Iterator<String>{

        private  int index;

        public CountryIterator(){
            index=0;
        }

        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public String next() {
            if(hasNext()){

                String country= countries[index];
                index++;
                return country;


            }
            else {
                throw new NoSuchElementException();
            }



        }


    }




}
