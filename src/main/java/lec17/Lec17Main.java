package lec17;

import java.util.Arrays;
import java.util.List;

public class Lec17Main {

    public void filterTest() {
        FruitFinder fruitFinder = new FruitFinder();

        List<Fruit> fruits = Arrays.asList(
                new Fruit("사과", 1000),
                new Fruit("사과", 1200),
                new Fruit("사과", 1200),
                new Fruit("사과", 1500),
                new Fruit("바나나", 3000),
                new Fruit("바나나", 3200),
                new Fruit("바나나", 2500),
                new Fruit("수박", 10000)
        );

        List<Fruit> results = fruitFinder.filterFruits(fruits, new FruitFilter() {
            @Override
            public boolean isSelected(Fruit fruit) {
                return Arrays.asList("사과", "바나나")
                        .contains(fruit.getName()) && fruit.getPrice() > 1000;
            }
        });

        for (Fruit result : results) {
            System.out.println(result.getName());
        }

        List<Fruit> results2 = fruitFinder.predicateFilterFruits(fruits, fruit -> fruit.getName().equals("사과"));

        for (Fruit result : results2) {
            System.out.println(result.getName());
        }

        List<Fruit> results3 = fruitFinder.lambdaFilterFruits(fruits, fruit -> fruit.getName().equals("사과"));

        for (Fruit result : results3) {
            System.out.println(result.getName());
        }

        List<Fruit> result4 = fruitFinder.lambdaFilterFruits(fruits, Fruit::isApple);

        for (Fruit result : result4) {
            System.out.println(result.getName());
        }
    }

    public static void main(String[] args) {
        Lec17Main lec17Main = new Lec17Main();
        lec17Main.filterTest();
    }
}
