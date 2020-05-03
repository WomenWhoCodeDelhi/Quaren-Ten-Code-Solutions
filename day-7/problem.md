# Day - 7

## Problem Statement

Riya is exploring an amusement park. There are N different rides and each ride has a distinct number assigned to it from 0,1,2,......N-1. Every ride needs a pass to be accessible. The owner of each ride has some passes to access the other rides. Owner of ride i has a list of passes rides[i], and each pass rides[i][j] is an integer in [0,1,... N-1]. A pass rides [i][j] =x opens the ride with number x.

Initially all the rides are denied entry into except ride 0. Riya starts from ride 0 and can switch back and forth between rides freely. Find out if Riya can ride all the rides in the amusement park or not. Return true if she can ride all the rides in the amusement park.




## Examples

Example 1: 
Input: [[1],[2],[3],[]]
Output: true
Explanation: Riya starts from ride 0, and picks up a pass for ride 1. She then goes to ride 1, and picks up a pass for ride 2. She then goes to ride 2, and picks up a pass for the ride 3. She then goes to ride 3. Since she was able to go to every ride, we returned true.

Example 2:
Input:[[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: Riya can't enter the ride with number 2.


## Pre-reqs

bool amusementPark( vector <vector<int> > & rides) {  }

