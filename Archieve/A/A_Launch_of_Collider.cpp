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
    string s;
    cin >> s;
    vector<int> A(t);
    for (int &i : A)
        cin >> i;

    int sol = INT_MAX;
    for (int i = 1; i < s.size(); i++) {
        if (s[i] == 'L' && s[i - 1] == 'R') {
            sol = min(sol, A[i] - A[i - 1]);
        }
    }
    cout << (sol == INT_MAX ? -1 : sol / 2) << endl;
    return 0;
}