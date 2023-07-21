package Behavioural_Pattern.Memento;

public class Memento {

     private LEd_Tv lEd_tv;

     public Memento(LEd_Tv lEd_tv)
     {
         this.lEd_tv=lEd_tv;

     }

     public LEd_Tv getlEd_tv()
     {
         return lEd_tv;
     }

     public void setlEd_tv()
     {
         this.lEd_tv=lEd_tv;
     }


     public String toString()
     {
         return  "Memento [ledTV=" +lEd_tv + "]";
     }


}
