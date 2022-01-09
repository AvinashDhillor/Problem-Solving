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

    int t, n;
    cin >> t;
    vector<int> A(t);

    for (int &i : A)
        cin >> i;

    sort(all(A));

    for (int i = t - 2; i >= 1; i--) {
        int diff = A[i + 1] - A[i];
        int index = lower_bound(A.begin(), A.begin() + i, diff + 1) - A.begin();
        if (index < i)
            return cout << "YES", 0;
    }

    cout << "NO";

    return 0;
}