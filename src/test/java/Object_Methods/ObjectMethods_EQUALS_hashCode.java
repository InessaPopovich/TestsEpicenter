package Object_Methods;

import org.testng.annotations.Test;

public class ObjectMethods_EQUALS_hashCode {

    public String person1 = "Inessa";
    public String person2 = "Inessa";
    public String person3 = "Vlad";
    public String person4 = "Vova";

    @Test
    public void equals() {
        System.out.println("person1=person2?" + person1 == person2); // false
        System.out.println("person2=person3? " + person2.equals(person3)); // person2=person3?false
    }

    @Test
    public void hashcode_test() {
        System.out.println(person1.hashCode());
    }
}
