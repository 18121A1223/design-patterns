package publishers;

import listeners.Listeners;

import java.util.List;

public class Match {
    Team teamA;
    Team teamB;
    String[] eventTypes = new String[]{"over", "fiveOvers","tenOvers","inningsOver"};

    public EventManager getEventManager() {
        return eventManager;
    }

    EventManager eventManager = new EventManager(eventTypes);

    public Match(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void updateScore(Team A,int Score, int overs, int wickets){
        A.getScorecard().setScore(Score);
        A.getScorecard().setOvers(overs);
        A.getScorecard().setWickets(wickets);

        if(wickets == 10 || overs == 20){
            List<Listeners> listeners = (List<Listeners>) eventManager.SubscriberList.get("inningsOver");
            for(Listeners lis: listeners)
                lis.update(this);
        }

    }

}
