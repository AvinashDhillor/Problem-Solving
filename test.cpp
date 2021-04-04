#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

void solve() {
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    vector<int> A = {6,
                     1,
                     26,
                     13,
                     16,
                     30,
                     16,
                     23,
                     9,
                     1,
                     5,
                     14,
                     7,
                     2,
                     17,
                     22,
                     21,
                     23,
                     16,
                     3,
                     5,
                     17,
                     22,
                     10,
                     1,
                     24,
                     4,
                     30,
                     8,
                     18};

    sort(A.begin(), A.end());

    for (int i : A)
        cout << i << " ";

    return 0;
}