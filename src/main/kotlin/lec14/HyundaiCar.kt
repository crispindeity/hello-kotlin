package lec14

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante: HyundaiCar("아반떼", 1000L)
class Sonata: HyundaiCar("소나타", 2000L)
class Granduer: HyundaiCar("그렌저", 3000L)