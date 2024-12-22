package org.example.observer;

public class Main {
    public static void main(String[] args) {
        CricketMatch match = new CricketMatch();

        Observer runsToWinObserver = new RunsToWin();
        Observer runsAganistPlayerObserver = new RunsAganistPlayer();
        Observer avgScoreObserver = new AverageScoreObserver();

        match.registerObserver(runsToWinObserver);
        match.registerObserver(runsAganistPlayerObserver);
        match.registerObserver(avgScoreObserver);

        match.setScore(100L);

    }
}
