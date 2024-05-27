package Object_Methods;

import org.testng.annotations.Test;

public class ObjectMethods_toString {
     String name;
     String age;
     String number;

    public ObjectMethods_toString(String name, String age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }


    public String toString() {
        return "Person {"
                + "name =" + name
                + ", age = " + age
                + ", number = +38 " + number
                + " }";
    }

    @Test
    public void create_string() {
        ObjectMethods_toString person = new ObjectMethods_toString("Inessa", "21", "0958925913");
        System.out.println(person);
    }

}
