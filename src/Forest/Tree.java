package Forest;

public class Tree {
    public static void main(String[] args) {
        Belka belka1 = new Belka();
        System.out.println(belka1.b2);      // получили доступ к этой переменной благодаря молификатору
                                            // "protected" в классе, расположенном в том же пакете
    }


}
