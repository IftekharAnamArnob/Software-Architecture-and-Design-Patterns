package Behavioural_Pattern.Memento;

public class Originator {

     private LEd_Tv lEd_tv;

     public LEd_Tv getlEd_tv()
     {
          return lEd_tv;
     }

     public void setlEd_tv(LEd_Tv lEd_tv)
     {
          this.lEd_tv=lEd_tv;
     }


     public Memento creatememento()
     {
          return new Memento(lEd_tv);
     }

     public void setMemento(Memento memento)
     {
          lEd_tv=memento.getlEd_tv();

     }

     public String toString()
     {
          return "Originator [ledTV=" +
                  "size=" + lEd_tv.getSize() +
                  ", Name=" + lEd_tv.getName() +
                  ", usbSupport=" + lEd_tv.getUsb() +
                  "]";
     }

}
