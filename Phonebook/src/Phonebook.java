import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Phonebook {

    static Scanner sc = null;
    static String name = null;
    static String phone = null;
    static String contact = null;

    public static void main(String args[])throws IOException {

        String nameDir = "C:/java/";//присваиваем переменной имя - путь до создаваемой папки
        File a = new File(nameDir);

        // Создание на диске папки и всех вышестоящих каталогов
        a.mkdirs();


        File file = new File("C:/java/Phonebook.txt");

        // Создание файла
        file.createNewFile();

        List<String> lines = Files.readAllLines(Paths.get("C:/java/Phonebook.txt"), Charset.defaultCharset());

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file, true);

        sc = new Scanner(new InputStreamReader(System.in));

        System.out.println("Введите имя контакта:");
        name = sc.next();

        System.out.println("Введите номер:");
        phone = sc.next();

        contact = name + "; " + phone;

        // Запись содержимого в файл
        writer.write(contact + "\r");
        writer.flush();
        writer.close();

        //for (String x:lines)
        //{
        //обработка всех строк как нам нужно
        if(lines.contains(contact)) {

            try {
                throw new Exception("My one time exception with some message!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        //}


    }
}
