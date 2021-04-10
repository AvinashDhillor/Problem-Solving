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

    int n, k;
    cin >> n >> k;
    vector<vector<char>> A(n, vector<char>(n, 'S'));

    for (int i = 0; i < n && k != 0; i += 1) {
        for (int j = (i & 1 ? 1 : 0); j < n; j += 2) {
            A[i][j] = 'L';
            k--;
            if (k == 0)
                break;
        }
    }
    if (k > 0)
        return cout << "NO", 0;

    cout << "YES" << endl;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << A[i][j];
        }
        cout << endl;
    }

    return 0;
}