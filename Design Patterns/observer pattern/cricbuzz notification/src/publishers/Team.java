package publishers;

public class Team {
    String Name;
    String ShortName;

    Scorecard Scorecard;


    public Team(String name, String shortName, Scorecard scorecard) {
        Name = name;
        ShortName =shortName;
        Scorecard = scorecard;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
    }

    public publishers.Scorecard getScorecard() {
        return Scorecard;
    }

    public void setScorecard(publishers.Scorecard scorecard) {
        Scorecard = scorecard;
    }



}
