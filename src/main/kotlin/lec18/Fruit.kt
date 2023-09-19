package lec18

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {

    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice

    fun nullOrValue(factoryPrice: Long): Long? {
        if (this.factoryPrice == factoryPrice) {
            return factoryPrice
        }
        return null
    }
}