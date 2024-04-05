import groovy.transform.TailRecursive;
import org.testng.annotations.Test;

import java.util.*;

public class iterator_test {

    @Test
    public void Iterator() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("goodbye");
        list.add("meow");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();  //видаляємо всі елементи списку
        }
        System.out.println(list);
    }

    @Test
    public void Iterotor2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("goodbye");
        list.add("meow");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {              //перевірка чи є елемент
            System.out.println(iterator.next());  //за допомогою next ми отримуємо цей елемент, без нього ми не зможемо видалити елемент
        }
    }

    @Test
    public void ListIterator() {
        String s = "madam";
        List<Character> list2 = new LinkedList<>();
        for(char ch: s.toCharArray()) {
            list2.add(ch);
        }
//        System.out.println(list2);
        ListIterator<Character> iterator = list2.listIterator();                       //створюємо ітератор, який буде рухатися з початку списку до кінця
        ListIterator<Character> reverse_iterator = list2.listIterator(list2.size());   //створюємо другий ітератор, але він буде рухатися у зворотному напрямку: з кінця списку до початку

        boolean isPolindrome = true;
        while(iterator.hasNext() && reverse_iterator.hasPrevious()) {                  // починаємо цикл, який триватиме доти, доки обидва ітератори мають куди рухатися - iterator.hasNext() перевіряє, чи є наступний елемент у напрямку зліва направо, reverse_iterator.hasPrevious() перевіряє, чи є попередній елемент у напрямку справа наліво
            if(iterator.next() != reverse_iterator.previous()) {                       //не равен !=, якщо символ, до якого дістався звичайний ітератор, не відповідає символу, до якого дістався зворотній ітератор, це означає, що слово не є паліндромом
                isPolindrome = false;                                                  //встановлюємо стан перевірки на "ні, це не паліндром" та виходимо з циклу (break;)
                break;
            }
        }
        if(isPolindrome) {                                                             //після завершення циклу перевіряємо, чи змінна isPolindrome залишилася істинною
            System.out.println("Polindrome");
        } else{
        System.out.println("Not Polindrome");
    }
}
}
