const val likes1 = 121
const val likes2 = 211
const val likes3 = 1011
const val likes4 = 4
const val likes5 = 5
const val likes6 = 6
const val likes7 = 7
const val likes8 = 8
const val likes9 = 9

fun main() {
    humanToLikes(likes1)
    humanToLikes(likes2)
    humanToLikes(likes3)
    humanToLikes(likes4)
    humanToLikes(likes5)
    humanToLikes(likes6)
    humanToLikes(likes7)
    humanToLikes(likes8)
    humanToLikes(likes9)
}

fun humanToLikes(likes: Int) {
    val phrase: String = if (likes < 21 && likes % 10 == 1 && (likes - 11 % 10 == 0)) {
        "человеку"
    } else if (likes in 21..121 && likes % 10 == 1) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $phrase")
}