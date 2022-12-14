package Lesson5;

import java.io.*;
import java.util.ArrayList;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterExample {
    public static void main(String[] args) {
        /*try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("1.txt"), UTF_8)) {
            int x;
            while ((x = inputStreamReader.read()) != -1) {
                System.out.println(x);
                System.out.println((char) x);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"))) {
            System.out.println(bufferedReader.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("2.txt"))) {
            String tempString;

            while ((tempString = bufferedReader.readLine()) != null){
                String[] studentsParms = tempString.split(" ");
                students.add(new Student(studentsParms[0], studentsParms[1], Integer.parseInt(studentsParms[2])));
            };

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(students);

        try (PrintWriter printWriter = new PrintWriter("new_students.csv")) {

            for (Student student : students){
                printWriter.println(student.toString());
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }








    }
}
