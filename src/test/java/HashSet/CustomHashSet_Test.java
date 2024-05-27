package HashSet;

import org.testng.annotations.Test;

import static org.apache.groovy.json.internal.Chr.add;

public class CustomHashSet_Test{

    @Test
    public void testCustomHashSet() {
        CustomHashSet set = new CustomHashSet();
        set.add("Apple");
        set.add("Banana");
        set.add("Grape");

        if (set.contains("Grape")) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
