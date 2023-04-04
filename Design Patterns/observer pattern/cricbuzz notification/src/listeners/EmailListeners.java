package listeners;

import publishers.Match;

public class EmailListeners implements Listeners{
    String email;

    public EmailListeners(String email) {
        this.email = email;
    }

    public void update(Match match){
        System.out.println("email sent ..."+email);
        System.out.println(match.getTeamA().getName()+":"
                +match.getTeamA().getScorecard().getScore() +" - "
                +match.getTeamA().getScorecard().getWickets() + " for "
                +match.getTeamA().getScorecard().getOvers()+ "overs"
        );
        System.out.println(match.getTeamB().getName()+":"
                +match.getTeamB().getScorecard().getScore() +" - "
                +match.getTeamB().getScorecard().getWickets() + " for "
                +match.getTeamB().getScorecard().getOvers()+ "overs"
        );

    }
}
