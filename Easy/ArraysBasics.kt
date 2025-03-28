package com.example.algorithms.Easy

import kotlin.collections.ArrayList

fun main() {

    var array = arrayListOf(1, 3, 2, 9, 5, 6)

    //findMaximumNumber(array)
    //averageArray(array)
    //copyArray(array)
    //reverseArray(array)
    mulMatrix()


}

/*
 * find the maximum of the array values
 */
fun findMaximumNumber(array: ArrayList<Int>) {
    var numberMax = array[0]

    for (i in array.indices) {
        if (array[i] > numberMax) numberMax = array[i]
    }

    println(numberMax)
}


/*
 * compute the average of the array values
 */
fun averageArray(array: ArrayList<Int>) {
    var sum = 0.0
    var size = array.size

    for (i in array.indices) {
        sum += array[i]
    }
    var average: Double = sum / size

    println(average)
}

/*
 * copy to another array
 */
fun copyArray(array: ArrayList<Int>) {
    var secondArray = mutableListOf<Int>()

    for (i in array.indices) {
        secondArray.add(array[i])
    }
    println(secondArray)
}

/*
 * reverse the elements within an array
 */
fun reverseArray(array: ArrayList<Int>) {
    val temp = arrayOfNulls<Int>(array.size)

    for(i in array.indices) {
        temp[array.size - 1 - i] = array[i]
    }
    for (i in array.indices) {
        array[i] = temp[i]!!
    }
    println(array)
}

/*
 * matrix-matrix multiplication
 * (square matrices)
 * a[][]*b[][] = c[][]
 */
fun mulMatrix(){
    var rows = 2
    var columns = 3
    val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
    val secondMatrix = arrayOf(intArrayOf(-4, 2, 4), intArrayOf(5, 2, 3))

    //first Matrix
    println("First Matrix")
    for(row in firstMatrix) {
        for(columns in row){
            print("$columns ")
        }
        println()
    }
    println()
    //second Matrix
    println("Second Matrix")
    for(row in secondMatrix) {
        for(columns in row){
            print("$columns ")
        }
        println()
    }
    println()

    //m adding mul
    var mul = Array(rows) { IntArray(columns) }

    for(i in 0..rows - 1) {
        for(j in 0.. columns - 1){
            mul [i] [j] = firstMatrix[i][j] * secondMatrix[i][j]
        }
    }

    println("Mul of the two matrices is: ")
    for(row in mul) {
        for(columns in row){
            print("$columns ")
        }
        println()
    }
}