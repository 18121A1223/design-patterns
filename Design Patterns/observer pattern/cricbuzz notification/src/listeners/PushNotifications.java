package listeners;

import publishers.Match;

public class PushNotifications implements Listeners {

    String username;

    public PushNotifications(String username) {
        this.username = username;
    }

    public void update(Match match){
        System.out.println("notifcation sent to ..."+username);
        System.out.println(match.getTeamA().getName()+":"
                +match.getTeamA().getScorecard().getScore() +" - "
                +match.getTeamA().getScorecard().getWickets() + " for "
                +match.getTeamA().getScorecard().getOvers()+ "overs"
        );
        System.out.println(match.getTeamB().getName()+":"
                +match.getTeamA().getScorecard().getScore() +" - "
                +match.getTeamA().getScorecard().getWickets() + " for "
                +match.getTeamA().getScorecard().getOvers()+ "overs"
        );

    }
}
