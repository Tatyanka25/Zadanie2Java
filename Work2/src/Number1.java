import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number1 {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String str = task.nextLine();
        System.out.println(str);
        Pattern pattern = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            Pattern pattern2 = Pattern.compile("(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/(01|0[3-9]|1[0-2])\\/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])|(0[1-9]|1[0-9]|2[0-9])\\/(02)\\/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])");
            Matcher matcher2 = pattern2.matcher(str);
            if (matcher2.find()) {
                System.out.println("Введенное выражение является датой");
            }
            else {
                System.out.println("Введенное выражение не является датой");
            }
        }
        else {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
        task.close();
    }
}
