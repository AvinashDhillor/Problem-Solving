#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

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
    deque<int> A;
    for (int i = 0; i < t; i++) {
        int a;
        cin >> a;
        A.push_back(a);
    }

    int si = 0, di = 0;
    int cur = 1;
    while (cur <= t) {

        if (A.size() == 1) {
            cur & 1 ? si += A.front() : di += A.front();
            break;
        }
        int first = A.front();
        int second = *(A.end() - 1);
        if (first > second) {
            A.pop_front();
            cur & 1 ? si += first : di += first;
        } else {
            cur & 1 ? si += second : di += second;
            A.pop_back();
        }
        cur++;
    }

    cout << si << " " << di << endl;

    return 0;
}