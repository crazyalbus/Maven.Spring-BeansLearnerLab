import java.util.Arrays;
import java.util.List;

public abstract class People <PersonType extends Person>{

    private List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType... people) {
        personList.addAll(Arrays.asList(people));
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAllPeople(List<PersonType> people) {
        personList.addAll(people);
    }

    public PersonType findById(long id) {
        return personList.get((int)id);
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
