import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        // SWITCH используется, когда надо перебрать много условий (вместо кучи IF-ов)
        Scanner s1 = new Scanner(System.in);

        System.out.println("Введи возраст:");
        int age = s1.nextInt();

      /*  if (age == 10){                                       так плоход писать, т.к. есть на это
            System.out.println("Ты учишься в школе");           оператор Switch
        } else if (age == 18) {
            System.out.println("Ты закончил школу");
        }  */
        switch (age){
            case 0:
                System.out.println("Ты родился");
                break;      // завершает блок "Switch"
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            default:            // это условие выполнится, если ни одно из предыдущих не выполнилось
                System.out.println("Ни одно из предыдущих условий не подошло");
        }

        Scanner s2 = new Scanner(System.in);
        System.out.println("Снова Введи возраст:");
        String age2 = s2.nextLine();
        switch (age2){
            case "ноль" :
                System.out.println("Ты родился");
                break;      // завершает блок "Switch"
            case "семь" :
                System.out.println("Ты пошел в школу");
                break;
            default:            // это условие выполнится, если ни одно из предыдущих не выполнилось
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
