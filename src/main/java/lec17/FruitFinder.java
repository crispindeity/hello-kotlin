package lec17;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FruitFinder {

    @NotNull
    public List<Fruit> findFruit(@NotNull List<Fruit> fruits, String name) {
        List<Fruit> results = new ArrayList<>();

        for (Fruit fruit : fruits) {
            if (fruit.getName().endsWith(name)) {
                results.add(fruit);
            }
        }
        return results;
    }

    @NotNull
    public List<Fruit> filterFruits(@NotNull List<Fruit> fruits, FruitFilter fruitFilter) {
        List<Fruit> results = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitFilter.isSelected(fruit)) {
                results.add(fruit);
            }
        }
        return results;
    }

    public List<Fruit> predicateFilterFruits(@NotNull List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        List<Fruit> results = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitFilter.test(fruit)) {
                results.add(fruit);
            }
        }
        return results;
    }

    public List<Fruit> lambdaFilterFruits(@NotNull List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        return fruits.stream()
                .filter(fruitFilter)
                .collect(Collectors.toList());
    }
}
