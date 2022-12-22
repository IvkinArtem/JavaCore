package Lesson5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StreamsExamples {
    public static void main(String[] args) throws FileNotFoundException {
        String tempString = "кот";

        System.out.println(Arrays.toString(tempString.getBytes()));
        System.out.println(Charset.defaultCharset());
        System.out.println(Charset.availableCharsets());

        File file = new File("our_example.txt");

        OutputStream outPutStream = null;

        try {
            outPutStream = new FileOutputStream(file);
            outPutStream.write(tempString.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                outPutStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (OutputStream outputStream1 = new FileOutputStream(file, true)) {
            outputStream1.write(65);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

/*        long time = System.currentTimeMillis();

        try (OutputStream outputStream2 = new FileOutputStream(file, true)){
            for(int i = 0; i < 5 * 1024 * 1024; i++)
            {
                outputStream2.write(65);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("время на записть 5 Мб" + (System.currentTimeMillis() - time));*/

        /*long time = System.currentTimeMillis();

        try (OutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream("text2.txt"))) {
            for(int i = 0; i < 5 * 1024 * 1024; i++)
            {
                outputStream2.write(65);
                outputStream2.flush();
            }

        } catch (IOException e) {
           e.printStackTrace();
        }

        System.out.println("время на записть 5 Мб с буферизацией " + (System.currentTimeMillis() - time));*/

       /* try (InputStream inputStream = new FileInputStream("our_example.txt")) {
            for(int i = 0; i < new File("our_example.txt").length(); i++){
                System.out.println("i = " + (char)inputStream.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        byte[] bytes = null;
        try (InputStream inputStream = new FileInputStream("our_example.txt")) {
            bytes = new byte[inputStream.available()];
           inputStream.read(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( new String(bytes, StandardCharsets.UTF_8));
    }
}
