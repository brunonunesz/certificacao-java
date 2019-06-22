import java.util.function.Predicate;

public class Lambdas{

    public static void main(String[] args){
        PersonFilter pf = new PersonFilter();
        List<Person> adults = pf.filter(persons, p -> p.getAge() >= 18);
    }
}

class Person{

    private String name;
    private int age;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}

@FunctionalInterface
interface Matcher<T>{
    boolean test(T t);
}

class AgeOFMajority implements Matcher<Person>{
    @Override
    public boolean test(Person p){
        return p.getAge() >= 18;
    }
}

class PersonFilter{
    public List<Person> filter(List<Person> input, Predicate<Person> matcher){
        List<Person> filter = new ArrayList<>();
        for(Person person: input){
            if(matcher.test(person)){
                filter.add(person);
            }
        }

        return filter;
    }
}