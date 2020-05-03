# Day - 9

## Problem Statement

Priyal is new to New York City. She wishes to explore the iconic city without having to pay the expensive cab prices. She decides to use Amtrak,the local train network of the city, to visit all the major tourist spots.
Amtrak has a list of train routes. Each routes[i] is a train route that the i-th train repeats forever. For example if routes[0] = [1,5,7], this means that the first train (0th indexed) travels in the sequence 1->5->7->1->5->7->1->...forever.
She starts at train station S( initially not on a train), and wishes to go to station T. Travelling by trains only what is the least number of trains she must take to reach her destination? Return -1 if it is not possible.



## Examples

Input: routes = [[1,2,7],[3,6,7]]
S=1
T=6
Output: 2
Explanation: The best strategy is to take the first train to the station 7, then take the second train to the station 6.



## Pre-reqs

int Trains( vector <vector<int>> & routes, int S, int T) { }
