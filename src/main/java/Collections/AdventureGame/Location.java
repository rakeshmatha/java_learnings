package Collections.AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Location {
    private final int locationID;
    private final String locationDescription;
    private final Map<String,Integer> exits;

    public int getLocationID() { return locationID; }

    public String getDescription() { return locationDescription; }

    public Map<String, Integer> getExits() { return new HashMap<String,Integer>(exits); }

    public Location(int locationID, String locationDescription, Map<String,Integer> exits) {
        this.locationID = locationID;
        this.locationDescription = locationDescription;
        if(exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        }
        else{
            this.exits = new HashMap<>();
        }
        this.exits.put("Q",0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationID == location.locationID && Objects.equals(locationDescription, location.locationDescription) && Objects.equals(exits, location.exits);
    }

    @Override
    public int hashCode() { return Objects.hash(locationID, locationDescription, exits); }
}