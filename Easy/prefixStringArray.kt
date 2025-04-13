package com.example.algorithms.Easy


/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.

*/

fun main() {
    val strs = arrayOf("Cuna", "Cuy", "Cine")

    var prefix = ""

    strs.sort()

    var first = strs[0].toCharArray()

    var last = strs[strs.size - 1].toCharArray()

    val minSize = minOf(first.size, last.size)

    for (i in 0 until minSize) {
        if (first[i] == last[i]) {
            prefix += first[i]
        } else {
            break
        }
    }

    println(prefix)

}