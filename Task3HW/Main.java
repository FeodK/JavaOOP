package Task3HW;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ааа", 1);
        Student student2 = new Student("Мфф", 2);
        Student student3 = new Student("Авв", 3);
        Student student4 = new Student("Ивв", 4);
        Student student5 = new Student("КВВ", 5);

        List<Student> group1Students = Arrays.asList(student1, student2);
        List<Student> group2Students = Arrays.asList(student3);
        List<Student> group3Students = Arrays.asList(student4, student5);

        StudentGroup group1 = new StudentGroup("Group1", group1Students);
        StudentGroup group2 = new StudentGroup("Group2", group2Students);
        StudentGroup group3 = new StudentGroup("Group3", group3Students);

        List<StudentGroup> stream1Groups = Arrays.asList(group1, group2);
        Stream stream1 = new Stream(stream1Groups);

        List<StudentGroup> stream2Groups = Arrays.asList(group3);
        Stream stream2 = new Stream(stream2Groups);

        List<Stream> streams = Arrays.asList(stream1, stream2);

        System.out.println("Потоки до сортировки:");
        printStreamsInfo(streams);

        StreamService.sortStreams(streams);

        System.out.println("\nПотоки после сортировки:");
        printStreamsInfo(streams);
    }

    private static void printStreamsInfo(List<Stream> streams) {
        for (Stream stream : streams) {
            System.out.println("Поток: ");
            for (StudentGroup group : stream) {
                System.out.println("  Группа: " + group.groupName + ", Количество студентов: " + group.students.size());
            }
        }
    }
}