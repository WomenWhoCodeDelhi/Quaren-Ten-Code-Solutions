# Day - 4

## Problem Statement

Various houses are present in a housing locality that are aligned in a straight horizontal line(from left to right) and each house has an antenna that transmits a signal in the right to left direction. House A shall block the signal of House B if A is present to the left of B and A is taller than B.
So, the range of a signal of a given antenna can be defined as: {(the number of contagious houses just to the left of the given house whose height is less than or equal to the height of the given house) +1).
You need to find the range of antennas of each house.

Input: Height of each house
Output: Print the range of each antenna


## Examples

Example: 
Input: 100 80 60 70 60 75 85
Output: 1 1 1 2 1 4 6
Explanation: The 6th antenna has a range of 4 because there are 3 contiguous houses( 3rd 4th and 5th) just to the left of the 6th house whose height is less than or equal to the height of 6th house.



