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

set<char> check;

int main() {
    FASTIO

    int n, m;
    char ch;
    cin >> n >> m >> ch;
    char A[n][m];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            cin >> A[i][j];

    set<char> s;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            if (A[i][j] == ch) {
                if (i - 1 >= 0)
                    s.insert(A[i - 1][j]);
                if (j - 1 >= 0)
                    s.insert(A[i][j - 1]);
                if (i + 1 < n)
                    s.insert(A[i + 1][j]);
                if (j + 1 < m)
                    s.insert(A[i][j + 1]);
            }

    s.erase(ch), s.erase('.');
    cout << s.size();

    return 0;
}