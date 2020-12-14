package GenericsChallenge;

public abstract class Player {
    String Name;

    public Player(String name) {
        Name = name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
