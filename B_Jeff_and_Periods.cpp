#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

#define FASTIO                   \
    ios::sync_with_stdio(false); \
    cin.tie(NULL);               \
    cout.tie(NULL);

int main() {
    FASTIO
    int t;
    cin >> t;
    map<int, vector<int>> A;
    for (int i = 0; i < t; i++) {
        int n;
        cin >> n;
        A[n].push_back(i);
    }
    vector<pair<int, int>> S;
    for (auto it : A) {
        if (it.second.size() == 1) {
            S.push_back({it.first, 0});
            continue;
        }
        int dif = it.second[1] - it.second[0], f = 0;
        for (int i = 2; i < it.second.size(); i++) {
            if (it.second[i] - it.second[i - 1] != dif) {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            S.push_back({it.first, dif});
        }
    }

    cout << S.size() << endl;
    for (auto it : S) {
        cout << it.first << " " << it.second << endl;
    }
    return 0;
}