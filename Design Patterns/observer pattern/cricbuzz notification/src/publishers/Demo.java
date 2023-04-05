package publishers;

import listeners.EmailListeners;
import listeners.Listeners;
import listeners.PushNotifications;

public class Demo {
    public static void main(String args[]){

        Listeners email1 = new EmailListeners("gk@gmail.com");
        Listeners email2 = new EmailListeners("gk2@gmail.com");
        Listeners push1 = new PushNotifications("dharaneshwar");
        //creating match
        Scorecard scorecard1 = new Scorecard(0,0,0);
        Scorecard scorecard2 = new Scorecard(0,0,0);
        Team team1 = new Team("india","IND", scorecard1);
        Team team2 = new Team("Australia","IND", scorecard2);
        Match match = new Match(team1,team2);
        match.getEventManager().subscribe("inningsOver",email1);
        match.getEventManager().subscribe("inningsOver",email2);
        match.getEventManager().subscribe("inningsOver",push1);

        match.updateScore(team1,110,20,4);

        match.updateScore(team2,109,20,10);


        return;




    }

}
