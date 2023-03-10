import java.util.Scanner;

public class Batsman extends Player {

    private int run;
    private int hundred;
    private int fifty;

    public Batsman() {
        run = hundred = fifty = 0;
    }

    public Batsman(int playerID, String playerName, int run, int hundred, int fifty) {
        super(playerID, playerName);
        this.run = run;
        this.hundred = hundred;
        this.fifty = fifty;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    Scanner sc = new Scanner(System.in);
    public void read()
    {
        super.read();
        System.out.println("Enter number of Runs: ");
        run = sc.nextInt();
        System.out.println("Enter number of hundreds: ");
        hundred = sc.nextInt();
        System.out.println("Enter number of fifties: ");
        fifty = sc.nextInt();

    }

    @Override
    public String toString() {
        return super.toString()+" Batsman [" +
                "Runs:  "+ run +
                ", Centuries: " + hundred +
                ", fifties: " + fifty +
                ']';
    }


}
