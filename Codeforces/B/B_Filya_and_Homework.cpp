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
    int n;
    cin >> n;
    vector<int> A(n);

    for (int &i : A)
        cin >> i;

    set<int> B = set<int>(all(A));

    if (B.size() <= 2) {
        return cout << "YES", 0;
    } else if (B.size() == 3) {
        int a = *B.begin();
        int b = *(++B.begin());
        int c = *(B.rbegin());
        if (b - a == c - b)
            return cout << "YES", 0;
    }
    cout << "NO";

    return 0;
}