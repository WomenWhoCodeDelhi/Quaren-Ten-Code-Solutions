# Day - 10

## Problem Statement

Griweshka, the mighty demon attacking the land of the Nomore group of Islands. The residents must rush to the nearest waterboy, where boats are waiting for them to save them from the attack. Find the minimum distance they must travel to save themselves from the attack. Given a matrix consists of 0 and 1, wherein 0 represents water and 1 represents land. Find the minimum distance needed to travel from each cell. The distance between two adjacent cells is 1.



## Examples

Example 1:
Input: [[0,0,0], [0,1,0], [0,0,0]]
Output: [[ 0,0,0], [0,1,0], [0,0,0]]

Example 2:
Input: [[0,0,0], [0,1,0], [1,1,1]]
Output: [[ 0,0,0], [0,1,0], [1,2,1]]

The number of elements of the given matrix will not exceed 10,000.
There is at least one 0 in the given matrix.
The cells are adjacent in only four directions up, down, left and right.



## Pre-reqs

vector<vector<int>> Griweshka(vector<vector<int>>& Nomore){ }

