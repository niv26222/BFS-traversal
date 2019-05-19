# FS-traversal




Check if it is possible to reach a number by making jumps of two given length
Given a starting position ‘k’ and two jump sizes ‘d1’ and ‘d2’, our task is to find the minimum number of jumps needed to reach ‘x’ if it is possible.

At any position P, we are allowed to jump to positions :

P + d1 and P – d1
P + d2 and P – d2
Examples:

Input : k = 10, d1 = 4, d2 = 6 and x = 8 
Output : 2
1st step 10 + d1 = 14
2nd step 14 - d2 = 8

Input : k = 10, d1 = 4, d2 = 6 and x = 9
Output : -1
-1 indicates it is not possible to reach x.
Recommended: Please try your approach on {IDE} first, before moving on to the solution.


In the previous article we discussed a strategy to check whether a list of numbers is reachable by K by making jump of two given lengths.

Here, instead of a list of numbers, we are given a single integer x and if it is reachable from k then the task is to find the minimum number of steps or jumps needed.

We will solve this using Breadth first Search:
Approach:

Check if ‘x’ is reachable from k. The number x is reachable from k if it satisfies (x – k) % gcd(d1, d2) = 0.
If x is reachable :
Maintain a hash table to store the already visited positions.
Apply bfs algorithm starting from the position k.
If you reach position P in ‘stp’ steps, you can reach p+d1 position in ‘stp+1’ steps.
If position P is the required position ‘x’ then steps taken to reach P is the answer
