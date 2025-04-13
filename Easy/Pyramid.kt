package com.example.algorithms.Easy

fun main() {

    var levels = 8

    for (i in 1..levels){
        val start = 2 * i - 1
        val spaces = levels - i
        println(" ".repeat(spaces) + "*".repeat(start))
    }
}

