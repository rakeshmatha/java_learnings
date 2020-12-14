package GenericsChallenge;

/*create a generic cass to implement a league table for a sport. The class should allow teams to add to the list and stor list of teams belong to the league
 * your class should have a method to print out the teams in order with the team at the top of the league printed first
 * Only teams of the same type should be added to any particu;ar instance of the league*/
public class GenericMain {
    public static void main(String[] args) {
        league<Team<SoccerPlayer>> soccerLeague = new league<>("PREMIER LEAGUE");
        Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");
        Team<SoccerPlayer> barcelona = new Team<>("Barcelona");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        Team<SoccerPlayer> mancty = new Team<>("Manchester city");
        soccerLeague.add(realMadrid);
        soccerLeague.add(barcelona);
        soccerLeague.add(arsenal);
        soccerLeague.add(chelsea);
        soccerLeague.add(mancty);
        realMadrid.matchResult(barcelona,3,5);
        chelsea.matchResult(arsenal,4,2);
        barcelona.matchResult(realMadrid,1,1);
        arsenal.matchResult(chelsea,2,1);
        mancty.matchResult(chelsea,1,1);
        arsenal.matchResult(realMadrid,1,3);
//Show me the soccer league table
        league<Team> League = new league<>("UEFA");
        League.add(barcelona);
        League.add(realMadrid);
        League.add(mancty);
        League.add(chelsea);
        League.add(arsenal);
        League.showLeagueTable();
    }
}
