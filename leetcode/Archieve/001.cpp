// 290. Word Pattern
// https://leetcode.com/problems/word-pattern/

#include <bits/stdc++.h>

using namespace std;

bool wordPattern(string pattern, string s) {
    vector<string> tokens;
    stringstream ss(s);
    string tmp;
    while (ss >> tmp) {
        tokens.push_back(tmp);
    }

    if (pattern.length() != tokens.size())
        return false;

    unordered_map<char, string> my_map;
    unordered_map<string, char> my_map2;

    int index = 0;
    for (char i : pattern) {
        if (my_map.find(i) != my_map.end()) {
            string a = my_map[i];
            if (a != tokens[index]) {
                return false;
            }
        } else {
            if (my_map2.find(tokens[index]) != my_map2.end()) {
                char k = my_map2[tokens[index]];
                if (k != i)
                    return false;
            } else {
                my_map[i] = tokens[index];
                my_map2[tokens[index]] = i;
            }
        }
        index++;
    }

    return true;
}

int main() {
    cout << (bool)wordPattern("aaaa", "dog dog dog dog");
    return 0;
}