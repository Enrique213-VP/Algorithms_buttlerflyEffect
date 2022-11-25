package com.example.algorithms

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */

fun main(){

    var strs = arrayOf("dog","race","car")

    print(longestCommonPrefix(strs))
}

fun longestCommonPrefix(strs: Array<String>): String {

    var size = strs.size

    if (size == 0) return ""

    if(size == 1) return strs[0]

    strs.sort()

    return  size.toString()

}