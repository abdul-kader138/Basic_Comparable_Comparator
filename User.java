package Basic_Comparable_Comparator;

/**
 * Created by Babu on 4/3/2016.
 */
public class User implements Comparable<User> {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }
}
