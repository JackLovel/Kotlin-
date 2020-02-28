package lambda

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)


val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.WINDOWS),
    SiteVisit("/login", 34.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

val averageWindowDuration = log
    .filter { it.os == OS.WINDOWS }
    .map (SiteVisit::duration)
    .average()

// 抽象出一个扩展函数
fun List<SiteVisit>.averageDurationFor(os: OS) =
    filter { it.os == OS.WINDOWS }
    .map (SiteVisit::duration)
    .average()

val averageMobileDuration = log.
    filter { it.os in setOf(OS.WINDOWS, OS.ANDROID) }
        .map (SiteVisit::duration)
        .average()

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

fun main() {
    println(averageWindowDuration)
    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))
    println(averageMobileDuration)
    println(log.averageDurationFor{it.os == OS.IOS && it.path == "/signup"})
    println(log.averageDurationFor{it.os in setOf(OS.ANDROID, OS.IOS)})
}
