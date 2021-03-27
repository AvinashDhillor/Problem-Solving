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

    int t;
    cin >> t;
    vector<int> A(t), prefix(t), sufix(t);
    for (int &i : A)
        cin >> i;

    sort(all(A));

    prefix[0] = A[0];
    sufix[t - 1] = A[t - 1];
    for (int i = 1; i < t; i++) {
        prefix[i] = prefix[i - 1] + A[i];
        sufix[t - i - 1] = sufix[t - i] + A[t - i - 1];
    }

    for (int i = t - 1; i >= 1; i--) {
        if (sufix[i] >= prefix[i - 1]) {
            if (t - i <= i && sufix[i] == prefix[i - 1])
                continue;
            cout << t - i << endl;
            return 0;
        }
    }
    cout << t << endl;
    return 0;
}