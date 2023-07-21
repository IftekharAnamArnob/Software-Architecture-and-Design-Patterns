package Behavioural_Pattern.Chain_Of_Responsibility;

public class Pattern_Demo {

    public static void main(String[] args) {

        TeamLeader teamLeader = new TeamLeader();
        Projectleader projectleader = new Projectleader();
        Hr hr = new Hr();

        teamLeader.setnextsupervisor(projectleader);

        projectleader.setnextsupervisor(hr);

        teamLeader.applyleave("John",9);
        System.out.println();
        teamLeader.applyleave("Abir",15);
        System.out.println();
        teamLeader.applyleave("Rakib",22);
        System.out.println();
        teamLeader.applyleave("Rajar chele",34);
        System.out.println();



    }
}
