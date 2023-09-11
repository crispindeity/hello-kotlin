package lec10;

public interface JavaSwimable {

    int swinAbility = 4;

    default void act() {
        System.out.println("어푸 어푸");
    }
}
