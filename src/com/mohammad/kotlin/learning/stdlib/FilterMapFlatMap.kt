package com.mohammad.kotlin.learning.stdlib

/**
 * Created by mohammadmoradyar on 6/30/17.
 */
data class Album(val title: String, val year: Int, val chartUk: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val title: String, val durationSeconds: Int)

val albums = listOf(
        Album("The Dark Side of the Moon", 1973, 2, 1,
                listOf(Track("Speak to Me", 90),
                        Track("Breathe", 163),
                        Track("On he Run", 216),
                        Track("Time", 421),
                        Track("The Great Gig in the Sky", 276),
                        Track("Money", 382),
                        Track("Us and Them", 462),
                        Track("Any Color You Like", 205),
                        Track("Brain Damage", 228),
                        Track("Eclipse", 123)
                )),
        Album("The Wall", 1979, 3, 1),
        Album("Wish You Were Here", 1975, 1, 1),
        Album("Animals", 1977, 2, 3),
        Album("The Piper at the Gates of Dawn", 1967, 6, 131),
        Album("The Final Cut", 1983, 1, 6),
        Album("Meddle", 1971, 3, 70),
        Album("Atom Heart Mother", 1970, 1, 55),
        Album("Ummagumma", 1969, 5, 74),
        Album("A Sauceful of Secrets", 1968, 9, 0),
        Album("More", 1969, 9, 153))

fun albumsWithTracksUnderXSecods(mySecods: Int, albums: List<Album>): List<Pair<String, String>> {
    /*
    Map is
    [a, b, c] -> f(X) => [f(a), f(b), f(c)]

    Flat Map is
    [[a,b],[c,d]] -> f(X) => [f(a) , f(b) , f(c) , f(d)]
     */
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationSeconds < mySecods
        }.map {
            Pair(albumTitle, it.title)
        }
    }
}

fun testFunction(tesValue: Int): List<String> {
    return albums.flatMap {
        it.tracks.filter {
            it.durationSeconds > tesValue
        }.map {
            it.title
        }
    }
}

fun main(args: Array<String>) {
    // Find number on in uk in traditional way (Non functional)
    for (album in albums)
        if (album.chartUk == 1)
            println("Found - ${album.title}")

    albums.forEach {
        if (it.chartUk == 1) println("Found - ${it.title}")
    }

    albums.filter { it.chartUk == 1 }.forEach { println("Found - ${it.title}") }

    var titles = albums.filter { it.chartUk == 1 }
            .map { Pair(it.title, it.year) }
    titles.forEach { println(it) }

    albumsWithTracksUnderXSecods(200, albums).forEach { println(it) }

    testFunction(50).forEach { println(it) }
}