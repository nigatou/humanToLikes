const val likes1 = 10
const val likes2 = 11
const val likes3 = 13
const val likes4 = 16
const val likes5 = 21
const val likes6 = 45

fun main() {
    humanToLikes(likes1)
    humanToLikes(likes2)
    humanToLikes(likes3)
    humanToLikes(likes4)
    humanToLikes(likes5)
    humanToLikes(likes6)
}

fun humanToLikes(likes: Int) {
    val phrase: String = if (likes % 10 == 1 && likes != 11) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $phrase")
}