public class Main {
    public static void main(String[] args) {

        CarWithLombok car1 = new CarWithLombok(
                "GLE", "Mercedes", 2020, 350000, "white", 5
        );

        CarWithLombok car2 = new CarWithLombok(
                "GLE", "Mercedes", 2020, 350000, "white", 5
        );

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());


        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("HashCode 1: " + car1.hashCode());
        System.out.println("HashCode 2: " + car2.hashCode());


        car1.setColor("black");
    }
}