#include <bits/stdc++.h> 
using namespace std; 
  
// Function to perform BFS traversal to 
// find minimum number of step needed 
// to reach x from K 
int minStepsNeeded(int k, int d1, int d2, int x) 
{ 
    // Calculate GCD of d1 and d2 
    int gcd = __gcd(d1, d2); 
  
    // If position is not reachable 
    // return -1 
    if ((k - x) % gcd != 0) 
        return -1; 
  
    // Queue for BFS 
    queue<pair<int, int> > q; 
  
    // Hash Table for marking 
    // visited positions 
    unordered_set<int> visited; 
  
    // we need 0 steps to reach K 
    q.push({ k, 0 }); 
  
    // Mark starting position 
    // as visited 
    visited.insert(k); 
  
    while (!q.empty()) { 
  
        int s = q.front().first; 
  
        // stp is the number of steps 
        // to reach position s 
        int stp = q.front().second; 
  
        if (s == x) 
            return stp; 
  
        q.pop(); 
  
        if (visited.find(s + d1) == visited.end()) { 
  
            // if position not visited 
            // add to queue and mark visited 
            q.push({ s + d1, stp + 1 }); 
  
            visited.insert(s + d1); 
        } 
  
        if (visited.find(s + d2) == visited.end()) { 
            q.push({ s + d2, stp + 1 }); 
            visited.insert(s + d2); 
        } 
  
        if (visited.find(s - d1) == visited.end()) { 
            q.push({ s - d1, stp + 1 }); 
            visited.insert(s - d1); 
        } 
        if (visited.find(s - d2) == visited.end()) { 
            q.push({ s - d2, stp + 1 }); 
            visited.insert(s - d2); 
        } 
    } 
} 
  
// Driver Code 
int main() 
{ 
    int k = 10, d1 = 4, d2 = 6, x = 8; 
  
    cout << minStepsNeeded(k, d1, d2, x); 
  
    return 0; 
} 