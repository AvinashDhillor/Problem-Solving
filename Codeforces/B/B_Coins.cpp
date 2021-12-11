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

    string a, b, c;
    cin >> a >> b >> c;
    if (a[1] == '>')
        swap(a[0], a[2]);
    if (b[1] == '>')
        swap(b[0], b[2]);
    if (c[1] == '>')
        swap(c[0], c[2]);

      vector<string> S = {"ABC", "ACB", "BAC", "BCA", "CAB", "CBA"}, A = {a, b, c};

    for (int i = 0; i < S.size(); i++) {
        int pass = 0;
        for (int j = 0; j < 3; j++) {
            int index = find(all(S[i]), A[j][0]) - S[i].begin();
            for (int x = index + 1; x < S[i].size(); x++) {
                if (S[i][x] == A[j][2]) {
                    pass++;
                    continue;
                }
            }
        }
        if (pass == 3)
            return cout << S[i], 0;
    }

    cout << "Impossible";

    return 0;
}