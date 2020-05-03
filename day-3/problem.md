# Day - 1 

## Problem Statement

Ram is the CEO of a company. He decided to give his employees some bonus points on the occasion of Diwali. Each employee is given a ranking on the basis of his/her performance. He randomly arranges his employees in a queue and allot them bonus points subjected to the following constraints:
Each employee must get at least one bonus point.
Employees with a higher rank get more bonus points than their neighbors in the queue.
What are the minimum bonus points given by Ram?

Input: An array consisting of rank of each employee
Output: Minimum bonus points given by Ram


## Examples

Example 1:
Input: [1,0,2]
Output: 5
Explanation: Ram allocates to the first, second and third employee with 2,1,2 bonus points respectively.

Example 2:
Input: [1,2,2]
Output: 4
Explanation: Ram allocates to the first, second and third employee with 1,2,1 bonus points respectively. The third employee gets 1 bonus point because it satisfies the above conditions.


## Pre-reqs

Int BonusPoints(vector <int>& rankings) { }

