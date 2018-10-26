/**Программа, считывающая количество
/*пользователей из консоли,
/*далее для каждого из них
/*запрашивает login и password,
/*затем ждет ввода login`а с клавиатуры
/*и возвращает в консоль password пользователя.
/*
 /* @version 1.0 26 Oct 2018
 /* @author Pavel Shakhov
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**Создаем класс.
 */
public final class Account {

    /**Создаем конструктор.
     */
    private Account() { }

    /**@param args .
     *@throws Exception .*/
    public static void main(final String[] args)
            throws Exception {

        Map<String, String> map = new HashMap<String, String>();

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйста, введите "
                + "количество пользователей:\r");
        int n = input.nextInt();
        System.out.println("Количество "
                + "пользователей: " + n);

        for (int i = 1; i <= n; i++) {

            System.out.println("Введите login "
                    + "для пользователя №" + i + ":\r");
            String login = input.nextLine();

            System.out.println("Введите password "
                    + "для пользователя №" + i + ":\r");
            String password = input.nextLine();

            map.put(login, password);
        }

        //System.out.println(map);

        System.out.println("Введите login:\r");
        String login = input.nextLine();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (login.equals(entry.getKey())) {
                System.out.println("Пароль: " + entry.getValue());
            }
        }
    }
}
