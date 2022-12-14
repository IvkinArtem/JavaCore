package Lesson5;

import javax.naming.spi.ObjectFactory;
import java.io.*;

public class SerializacionExamples {
    public static void main(String[] args) {
        File file = new File("student");


        Student student1 = new Student("Anton", "Ivanov", 25);
        Student student2 = new Student("Anton", "Ivanov", 35);
        /*try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Student studentFromFile = (Student) objectInputStream.readObject();
            System.out.println(studentFromFile);

            Student studentFromFile2 = (Student) objectInputStream.readObject();
            System.out.println(studentFromFile2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
