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

    vector<vector<char>> A(4, vector<char>(4));
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            cin >> A[i][j];
        }
    }

    for (int i = 1; i < 4; i++) {

        for (int j = 1; j < 4; j++) {
            int count = 1;
            char tar = A[i][j];
            if (tar == A[i - 1][j])
                count++;
            if (tar == A[i - 1][j - 1])
                count++;
            if (tar == A[i][j - 1])
                count++;
            if (count == 3 || count == 4) {
                return cout << "YES", 0;
            }
        }
    }
    cout << "NO";
    return 0;
}