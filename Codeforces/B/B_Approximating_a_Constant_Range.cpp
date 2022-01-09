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
    vector<int> A(n);
    for(int &i : A) cin >> i;

    int prev = -1, next = 0, current = A[0], currentCount = 1, prevCount =0, len =1;
    for(int i = 1; i < n; i++)  {
        next = A[i];
        if(next == current) currentCount++;
        else if(next == prev) {
           prevCount += currentCount;
           prev = current;
           current  = next;
           currentCount = 1;
        } else {
            len = max(len, currentCount+ prevCount);
            prevCount = currentCount;
           prev = current;
           current  = next;
           currentCount = 1;
        }
    }

    cout << max(len , currentCount + prevCount);


    return 0;
}