package methodmerge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class callCompare {

    public static void main(String[] args) {

        Comparator<Person> comparator = (p1, p2) -> {
            String last1 = p1.getLast();
            String last2 = p2.getLast();
            int result = last1.compareTo(last2);

            if (result != 0) {
                return result;
            } else {
                String first1 = p1.getFirst();
                String first2 = p2.getFirst();
                return first1.compareTo(first2);
            }
        };

        //比較データ取得
        List<Person> data = makePerson();
        System.out.println(comparator.compare(data.get(0), data.get(1)));
        System.out.println(comparator.compare(data.get(1), data.get(2)));
        System.out.println(comparator.compare(data.get(2), data.get(0)));
    }

    public static List<Person> makePerson() {
        Person person1 = new Person("佐藤", "一郎");
        Person person2 = new Person("佐藤", "ニ郎");
        Person person3 = new Person("鈴木", "太一");

        List<Person> returnData = Arrays.asList(person1, person2, person3);
        return returnData;

    }

}
