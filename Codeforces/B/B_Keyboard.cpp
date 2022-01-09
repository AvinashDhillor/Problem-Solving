#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

int dist(double i, double j, double x, double y) {
    int val = ceil(sqrt((pow(i - x, 2.0) + pow(j - y, 2.0))));
    return val;
}

#define FASTIO                   \
    ios::sync_with_stdio(false); \
    cin.tie(NULL);               \
    cout.tie(NULL);

int main() {
    FASTIO
    int n, m, x;
    cin >> n >> m >> x;
    unordered_map<char, vector<pair<int, int>>> A;
    vector<pair<int, int>> B;
    unordered_set<char> check;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            char c;
            cin >> c;
            if (c == 'S')
                B.push_back({i, j});
            else
                A[c].push_back({i, j});
        }
    }

    for (auto it1 : A) {
        vector<pair<int, int>> tmp = it1.second;
        int m = INT_MAX;
        for (auto it2 : tmp) {
            for (auto it : B) {
                m = min(dist(it.first, it.second, it2.first, it2.second), m);
            }
        }
        if (m > x)
            check.insert(it1.first);
    }

    int s;
    cin >> s;
    string st;
    cin >> st;
    int count = 0;

    for (int i = 0; i < s; i++) {
        if (B.size() == 0 && isupper(st[i]))
            return cout << -1, 0;
        if (A.find(tolower(st[i])) == A.end())
            return cout << -1, 0;
        if (isupper(st[i]) && check.find(tolower(st[i])) != check.end())
            count++;
    }

    cout << count;
    return 0;
}