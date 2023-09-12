package lec12;

public class Lec12Main {

    public static void main(String[] args) {
        Person.Factory.newBaby("ABC");

        // @JvmStatic 이 있는 경우 이름 또는 Companion 호출 없이 바로 사용 가능
        Person.newBaby("ABC");

        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("움직인다~~~");
            }

            @Override
            public void fly() {
                System.out.println("난다~~~");
            }
        });
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}
