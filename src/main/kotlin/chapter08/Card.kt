package chapter08

enum class Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}
sealed class Card(val suit: Suit)
class Ace(suit: Suit) : Card(suit)
class King(suit: Suit) : Card(suit)