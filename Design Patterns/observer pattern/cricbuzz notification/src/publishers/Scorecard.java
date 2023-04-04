package publishers;//for every 5 o vers score should be notified to users through email or push notifications
//or when wicket has fallen

public class Scorecard {

    int score;
    int wickets;
    int overs;

    public Scorecard(int score, int wickets, int overs) {
        this.score = score;
        this.wickets = wickets;
        this.overs = overs;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }
    //business logic



}
