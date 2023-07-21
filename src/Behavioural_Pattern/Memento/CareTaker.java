package Behavioural_Pattern.Memento;

import java.util.ArrayList;

public class CareTaker {

 ArrayList<Memento> ledTvlist = new ArrayList<>();


  public void addMemento(Memento memento)
  {
      ledTvlist.add(memento);
      System.out.println("Led tv's snapshot Maintained by caretaker"+ledTvlist);

  }

  public Memento getMemento(int index)
  {
     return ledTvlist.get(index);

  }



}
