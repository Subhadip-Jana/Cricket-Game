import java.util.Scanner;

public class Tournament {

    private String tournamentName;
    private int year;

    Team[] teams;
    private int teamCounter;

    public Tournament() {
        teams = new Team[25];
        teamCounter = 0;
    }


    public Tournament(String tournamentName, int year) {
        this.tournamentName = tournamentName;
        this.year = year;
        teams = new Team[25];
        teamCounter = 0;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Scanner sc = new Scanner(System.in);

    public void addTeam()
    {
        teams[teamCounter] = new Team();
        System.out.println("Enter Team name: ");
        teams[teamCounter].setTeamName(sc.next());
        System.out.println("Enter CEO Name: ");
        teams[teamCounter].setCeoName(sc.next());
        System.out.println("Enter maximum number of players in your team: ");
        int nop=sc.nextInt();
        if(nop<11)
        {
            System.out.println(".....!!...Cricket team has minimum 11 players...!!.....");
            System.out.println(".............!!...Anyway Proceeding...!!..............!");
        }
        while(nop>0)
        {

            teams[teamCounter].addPlayer();
            nop --;
        }
        teamCounter++;
    }

    public void displayTournament()
    {

        System.out.println("\n|| Team Details: ||");
        System.out.println("....................");
        for (int i = 0; i < teamCounter; i++)
        {
            teams[i].display();
        }

    }

}
