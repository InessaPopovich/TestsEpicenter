import org.testng.annotations.Test;

public class ObjectMethods_getClass {
    @Test
    public void Class() {
        String a = "Hello";
        Class aClass = a.getClass();
        System.out.println(aClass);
    }

}
