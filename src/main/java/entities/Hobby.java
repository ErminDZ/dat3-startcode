package entities;

import javax.persistence.ManyToMany;
import java.util.List;

public class Hobby {

    @ManyToMany
    private List<Person> persons;

}
