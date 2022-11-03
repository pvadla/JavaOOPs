package aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationDemo {
    public static void main(String[] args) {
        //creating objects of person class
        Person a = new Person("Tanmay", 17);
        Person b = new Person("Sam", 18);
        Person c = new Person("Pitu", 19);
        Person d = new Person("Khushi", 20);

        List<Person> p1 = new ArrayList<>();
        p1.add(a);
        p1.add(c);
        //making a list of persons belongs to drama fest group
        List<Person> p2 = new ArrayList<>();
        p2.add(b);
        p2.add(d);

        //creating objects of group class
        Groups swGrp = new Groups("Social Welfare", p1);
        Groups dfGrp = new Groups("Drama Fest", p2);

        //before deleting drama fest group
        System.out.println("List of persons in Drama Fest group:");
        for(Person p : p2) {
            System.out.println("Person name: " + p.getName() + ", Age:" + p.getAge() + ", Group: Drama Fest");
        }

        //deleting drama fest group
        dfGrp = null;
        //after deleting drama fest group
        //person list will not destroy
        System.out.println("List of persons after deleting Drama Fest group:");
        for(Person p : p2) {
            System.out.println("Person name: " + p.getName() + ", Age: " + p.getAge());
        }

    }

}
