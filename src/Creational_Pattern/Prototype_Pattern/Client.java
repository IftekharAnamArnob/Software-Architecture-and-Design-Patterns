package Creational_Pattern.Prototype_Pattern;

public class Client {
    public static void main(String[] args) {

        Sheep sally = new Sheep();
        Clonefactory clonefactory = new Clonefactory();

        Sheep Clonesheep = (Sheep) clonefactory.getClone(sally);


        System.out.println(sally);
        System.out.println(Clonesheep);


        System.out.println("Sally's Hashcode "+System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clones Hashcode "+System.identityHashCode(System.identityHashCode(Clonesheep)));

    }
}
