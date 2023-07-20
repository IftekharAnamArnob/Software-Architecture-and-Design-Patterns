package Structural_Pattern.Facade;

public class HomeTheatreFacade {

      private DVD dvd;
      private Projector projector;
      private SoundSystem soundSystem;

      public HomeTheatreFacade(DVD dvd,Projector projector,SoundSystem soundSystem)
      {
          this.dvd=dvd;
          this.projector=projector;
          this.soundSystem=soundSystem;

      }

      void WatchMovie(){
          System.out.println("Starting a movie!");
          dvd.ON();
          dvd.InsertDIsk();
          projector.ON();
          projector.SetInput();
          soundSystem.ON();
          soundSystem.ChangeVolume();

      }

      void EndMovie(){
          System.out.println("Movie has Ended");
          dvd.OFF();
          projector.OFF();
          soundSystem.OFF();
      }


}
