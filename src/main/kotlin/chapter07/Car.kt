package chapter07

class Car(val yearOfMake: Int, theColor: String) {
    var fuelLevel = 100
        private set
    var color = theColor
        set(value) {
            if (value.isBlank()) {
                throw RuntimeException("no empty!")
            }
            field = value
        }

    init {
        if (yearOfMake < 2020) {
            fuelLevel = 90
        }
    }
}