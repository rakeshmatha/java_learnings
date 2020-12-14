package GenericsChallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class league<T extends Team> {
    String Name;
    private ArrayList<T> league = new ArrayList<>();
    public league(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }

    public boolean add(T team){
        if(league.contains(team)){
            System.out.println(this.Name+" already exixts");
            return false;
        }
        else{
            league.add(team);
            return true;
        }
    }
    public void showLeagueTable(){
        Collections.sort(league);
        for(T rankingBased : league){
            System.out.println(rankingBased.getName()+" ::"+ rankingBased.ranking());
        }
    }
}
