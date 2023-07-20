package Structural_Pattern.Facade;

public class Facade_Demo {

    public static void main(String[] args) {

          DVD dvd = new DVD();
          Projector projector = new Projector();
          SoundSystem soundSystem = new SoundSystem();

          HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(dvd,projector,soundSystem);


          homeTheatreFacade.WatchMovie();


          homeTheatreFacade.EndMovie();
    }
}
