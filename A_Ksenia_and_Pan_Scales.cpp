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

#ifndef ONLINE_JUDGE
    freopen("in.txt", "r", stdin);
    freopen("err.txt", "w", stderr);
    freopen("out.txt", "w", stdout);
#endif

    string s, w;
    string left = "", right = "";
    getline(cin, left, '|');
    getline(cin, right);
    getline(cin, w);

    int remain = max(left.size(), right.size()) - min(left.size(), right.size());
    int val = w.size() - remain;
    if (val < 0 || val & 1) {
        return cout << "Impossible", 0;
    } else {
        int ab = 0;
        for (ab = 0; ab < remain; ab++) {
            if (left.size() < right.size())
                left += w[ab];
            else
                right += w[ab];
        }
        while (ab < w.size()) {
            left += w[ab++], right += w[ab++];
        }
    }
    cout << left << "|" << right << endl;
    return 0;
}