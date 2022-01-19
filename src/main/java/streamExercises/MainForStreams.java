package streamExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainForStreams {
    public static void main(String[] args) {
        Person person = new Person(18,"Madalin");
        Person person1 = new Person(19,"Andreea");
        Person person2 = new Person(20,"Robi");
        Person person3 = new Person(26,"Andrei");
        Person person4 = new Person(27,"Adelina");
        Person person5 = new Person(28,"Rita");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        persons.stream()
                .map(p -> p.getAge())
                .filter(age -> age > 20)
                .forEach(System.out::println);

        Student one = new Student();
        Student two = new Student();
        Student three = new Student();
        one.setGrade(5L);
        two.setGrade(6L);
        three.setGrade(7L);
        one.setName("abMadalin");
        two.setName("Andreea");
        three.setName("Robi");

        List<Student> students = new ArrayList<>();
        students.add(one);
        students.add(two);
        students.add(three);

        //get the Students whose name starts with "ab"
        students.stream()
                .filter(s -> s.getName().startsWith("ab"))
                .forEach(System.out::println);

        //create a new list with the name of the students uppercased
        List<Student> studentUppercased = students.stream()
                .map(s -> {
                    Student student = new Student();
                    String tempName = s.getName();
                    Long tempGrade = s.getGrade();
                    student.setName(tempName.toUpperCase());
                    student.setGrade(tempGrade);
                    return student;
                })
                .collect(Collectors.toList());

        System.out.println(studentUppercased);
        System.out.println(students);

        //find the average grade of the students
        OptionalDouble avg = students.stream()
                .mapToLong(Student::getGrade)
                .average();

        double avgDouble = students.stream()
                .collect(Collectors.averagingDouble(Student::getGrade));

        System.out.println(avgDouble);

        double average = avg.getAsDouble();
        System.out.println(average);
    }
}
