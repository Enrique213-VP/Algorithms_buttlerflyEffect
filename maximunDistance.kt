package com.example.algorithms

/*
Maximum distance

* Given a text and a subText that might be in the text, return the maximum distance from the subText to * any side of the text. If the subText is not in the text, return -1. The distance is the number of *characters from the subText to any of the text sides.

Example:
Input:

    text = abcdefghi
    subText = de

    Output: 4

Explanation:

The minimum distance is the one on the right side (fghi).

Constraints:

1 <= text.length <= 2147483647
1 <= subText.length <= text.length
Text and subText contain only English lowercase letters

 */
fun main() {

    var text = "abcdefghi"
    var subText = "de"

    readSolved(text, subText)


}


fun readSolved(text: String, subText: String) {

    var con = 0
    var se = 0
    var ul = subText.last()


    for (i in text) {

        if (i == ul) {
            break
        }
        con++
    }

    for (j in text.reversed()) {
        if (j == ul) {
            break
        }
        se++
    }
    if (con < se) {
        print(se)
    } else {
        print(con)
    }
}