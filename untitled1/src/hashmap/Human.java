package hashmap;

import java.util.Objects;

public class Human {
   private String name ;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name!=null?name.toUpperCase():null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return name.equals(human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
