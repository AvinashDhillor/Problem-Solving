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
    vector<pair<int, int>> A;

    for(int i = 0; i < n; i++) {
        int r;
        cin >> r;
        if(!A.empty() && A.rbegin()->first == r)
            A.rbegin()->second++;
        else
            A.push_back({r, 1});
    }

    int range = INT_MIN;
    for(int i = 0; i < A.size(); i++) {
        int mn = A[i].first, mx = A[i].first;
        int k = i - 1, m = i + 1;
        int count = A[i].second;
        while(k >= 0) {
            mn = min(mn, A[k].first);
            mx = max(mx, A[k].first);
            if(mx - mn > 1)  {
                break;
            }
            count += A[k].second;
            k--;
        }
        while(m < n) {
            mn = min(mn, A[m].first);
            mx = max(mx, A[m].first);
            if(mx - mn > 1)  {
                break;
            }
            count += A[m].second;
            m++;
        }
        range = max(count, range);

    }
    cout << range;
    return 0;
}