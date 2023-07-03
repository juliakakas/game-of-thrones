import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Noble extends Character{
    private Set<House> houses = new HashSet<>();
    private int wealth;

    public Noble(String name, String birthPlace, Gender gender, House houses, int wealth) {
        super(name, birthPlace, gender);
        this.houses = Collections.singleton(houses);
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return  getName() + " of house " + houses +
                ", has " + wealth + " gold dragons.";
    }

    public Set<House> getHouses() {
        return houses;
    }

    public int getWealth() {
        return wealth;
    }

    public void setHouses(House houses) {
        this.houses = Collections.singleton(houses);
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }
}
