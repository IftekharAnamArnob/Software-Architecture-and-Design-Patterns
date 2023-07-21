package Behavioural_Pattern.Strategy_Pattern;

public class TravelContext {

      private TravelStartegy travelStartegy;

      public TravelStartegy getTravelStartegy()
      {
            return travelStartegy;
      }

      public void setTravelStartegy(TravelStartegy travelStartegy)
      {
            this.travelStartegy=travelStartegy;
      }

      public void gotoairport()
      {
            travelStartegy.gotoairport();
      }

}
