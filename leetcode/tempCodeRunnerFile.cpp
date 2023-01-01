// 290. Word Pattern
// https://leetcode.com/problems/word-pattern/

#include <bits/stdc++.h>

using namespace std;

bool wordPattern(string pattern, string s) {
    vector<string> tokens;
    stringstream ss(s);
    string tmp;
    while (ss >> tmp)
    {
        cout << tmp << endl;
    }
    return 0; 
}

int main() {
    wordPattern("abcd", "my name is avinash")
    return 0;
}