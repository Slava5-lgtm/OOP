package Leсture_1.Ex003;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2); // Было а.х = 0 и а.у = 0 и возврощяемся в Point2D.java и добовляем 14 15
                                       // строчку

        System.out.println(a.getX()); // Выводим на экран
        // Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(0); // Создаем точку в
        System.out.println(b);
        // Point2D b = new Point2D(0, 10);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
    
}
