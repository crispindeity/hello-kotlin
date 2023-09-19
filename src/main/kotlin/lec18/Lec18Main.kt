package lec18

fun main() {
    val fruits = listOf(
        Fruit(1L, "사과", 1000L, 1100L),
        Fruit(2L, "사과", 2000L, 2200L),
        Fruit(3L, "바나나", 3000L, 3300L),
        Fruit(4L, "바나나", 4000L, 4400L),
        Fruit(5L, "수박", 5000L, 5500L),
        Fruit(6L, "포도", 6000L, 6600L),
    )

    val apples = fruits.filter { it.name == "사과" }

    val appleIndex = fruits.filterIndexed { index, fruit ->
        println(index)
        fruit.name == "사과"
    }

    val applePrices = fruits
        .filter { it.name == "사과" }
        .map { it.currentPrice }

    val applePriceIndex = fruits
        .filter { it.name == "사과" }
        .mapIndexed { index, fruit ->
            println(index)
            fruit.currentPrice
        }

    val values = fruits
        .filter { it.name == "사과" }
        .mapNotNull { it.nullOrValue(2000L) }

    val isAllApple = fruits.all { it.name == "사과" }
    val isNoApple = fruits.none { it.name == "사과" }
    val isAnyApple = fruits.any { it.factoryPrice >= 10000L }
    val fruitCount = fruits.count()
    val fruitAscSort = fruits.sortedBy { it.currentPrice }
    val fruitDescSort = fruits.sortedByDescending { it.currentPrice }

    val distinctFruitNames = fruits
        .distinctBy { it.name }
        .map { it.name }

    val firstFruit = fruits.first()
    val firstOrNullFruit = fruits.firstOrNull()
    val lastFruit = fruits.last()
    val lastOrNullFruit = fruits.lastOrNull()

    val map: Map<String, List<Fruit>> = fruits.groupBy { it.name }
    val idMap: Map<Long, Fruit> = fruits.associateBy { it.id }

    val priceMap: Map<String, List<Long>> = fruits
        .groupBy({ it.name }, { it.factoryPrice })

    val idPriceMap: Map<Long, Long> = fruits
        .associateBy({ it.id }, { it.factoryPrice })

    val map2: Map<String, List<Fruit>> = fruits
        .groupBy { it.name }
        .filter { (key, value) -> key == "사과" }


    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1000, 1100),
            Fruit(2L, "사과", 2000, 2200),
            Fruit(3L, "사과", 3000, 3300),
            Fruit(4L, "사과", 4000, 4400),
        ),
        listOf(
            Fruit(5L, "바나나", 5000, 5500),
            Fruit(6L, "바나나", 6000, 6600),
            Fruit(7L, "바나나", 7000, 7700),
        ),
        listOf(
            Fruit(8L, "수박", 10000, 11000),
        )
    )

    val samePriceFruits = fruitsInList.flatMap { list ->
            list.filter { it.factoryPrice == it.currentPrice }
        }

    val samePriceFruits2 = fruitsInList.flatMap { it.samePriceFilter }
    val singleList = fruitsInList.flatten()
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)

typealias FruitFilter = (Fruit) -> Boolean

private fun filterFruits(
    fruit: List<Fruit>, filter: FruitFilter
): List<Fruit> {
    return fruit.filter(filter)
}

