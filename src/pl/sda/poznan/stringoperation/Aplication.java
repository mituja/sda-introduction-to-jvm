package pl.sda.poznan.stringoperation;

import pl.sda.poznan.stringoperation.file.TextReader;

import java.util.List;

public class Aplication {
    public static void main(String[] args) throws InterruptedException {
        List<String> stringList = TextReader.readFromFile("C:\\Users\\HP\\IdeaProjects\\introduction-to-jvm\\tekst.txt");

        //lambda expression
        //stringList.forEach(e -> System.out.println(e));

        //method reference
        //stringList.forEach(System.out::println);

        //for-each
        for (String s : stringList) {
            System.out.println(s);
        }

        String text = null;
        for (String s : stringList) {
            System.out.println("Jestem w pętli");
            Thread.sleep(1000);
            text += s;
        }
        System.out.println(text);

        StringBuilder builder = new StringBuilder();
        for (String line : stringList) {
            builder.append(line).append("\n");
        }
        text = builder.toString();
        System.out.println(text);


    }
}
