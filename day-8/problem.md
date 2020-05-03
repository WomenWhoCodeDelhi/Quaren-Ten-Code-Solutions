# Day - 8

## Problem Statement

Mansi and Riya are playing a game with stacks of buttons to pass their time in this quarantine phase. An even number of stacks are arranged in a row, and each stack has a positive integral number of buttons.
The objective of the game is to end with the maximum number of buttons. Since the total number of buttons are odd, there are no ties.
Mansi and Riya take turns, with Mansi starting first. Each turn, a player takes the entire stack of buttons from either the beginning or the end of the row. This continues until there are no more stacks of buttons left, at which point the person with the most button wins. Assuming Mansi and Riya are intelligent and both of them want to win, return True if and only if Mansi wins the game.




## Examples

Example 1:
Input: [5,3,4,5]
Output: true
Explanation: Mansi starts first, and can only take the first 5 or the last 5. Say she takes the first 5, so that the row becomes [3,4,5]. If Riya takes 3, then the board is [4,5] and Mansi takes 5 to win with 10 points. If Riya takes the last 5, then board is [3,4] and Mansi takes 4 to win with 9 points. This demonstrated that taking the first 5 was a winning move for Mansi, so we returned true.



## Pre-reqs

bool Game( vector <int> & stacks) { }

