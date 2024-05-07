import org.testng.annotations.Test;

public class ObjectMethods_CLONE implements Cloneable {
    public String name = "Inessa";

    @Override
//    public ObjectMethods clone() throws CloneNotSupportedException {
//        return (ObjectMethods) super.clone();
//    }
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null; // або кинути RuntimeException
        }
    }

    @Test
    public void create_clone () {
        ObjectMethods_CLONE original = new ObjectMethods_CLONE();
        ObjectMethods_CLONE cloned = (ObjectMethods_CLONE) original.clone();
        System.out.println("ORIGINAL" + original);
        System.out.println("CLONED" + cloned);
        System.out.println(original != cloned); //обидва об'єкти мають різні посилання в пам'яті
    }
}