# Day - 2


## Problem Statement


In Shami’s village, a lake is known for having linked stones. Let’s name these stones as s1, s2, s3 and so on. Each stone has a number of seedlings sprouting from it.If shami is standing on one stone, he always wants to jump onto the next nearest stone with greater number of seedlings than the current stone he is standing on. If no stone exceeds the number of seedlings of the current stone, we assume the succeeding number of seedlings as 0. Return an array with each index containing the next greater number of seedlings that Shami will jump on for every stone.


## Examples


Example 1:
Input: 2-> 1 -> 5
Output: [5,5,0]

Example 2: 
Input: 2->7->4->3->5
Output: [7,0,5,5,0]


## Pre-reqs


Definition for singly-linked list.
  struct ListNode {
  	int val;
  	ListNode *next;
  	ListNode(int x) : val(x), next(NULL) {}
  };
