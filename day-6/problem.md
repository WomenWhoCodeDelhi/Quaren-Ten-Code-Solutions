# Day - 6

## Problem Statement

You're playing a level or the famous game 'The floor is lava'. In this game the floor is divided into x units and at each unit there may or may not exist a piece of furniture for you to step on.
You can jump on the furniture, but you must not jump onto the floor. Given a list of furniture' positions (in units) in sorted ascending order, determine if you are able to cross the level by landing on the last piece of furniture. Initially, you are on the first furniture and assume the first jump must be of 1 unit. If your last jump was of k units, then your next jump must be either k-1, k or k+1 units. Note that you can only jump in the forward direction.

The number of furniture pieces is >=2 and is <1100.
Each furniture's position will be a non negative integer <231
The first furniture's position is always 0.



## Examples

Input: [0,1,3,5,6,8,12,17]
Output: True
Explanation: There are a total of 8 furniture pieces. The first one is at the 0th unit, second one is at the 1st unit, third one is at the 3rd unit, and so on. The last furniture is at the 17th unit. Answer is true because you can jump to the last furniture by jumping 1 unit to the 2nd one, then 2 units to the 3rd one, then 2 units to the 4th one, then 3 units to the 6th one, then 4 units to the 7th one, and finally 5 units to the 8th furniture piece.



## Pre-reqs

bool ThefloorIsLava( vector <int> & furnitures) { }


