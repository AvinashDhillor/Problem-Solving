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

    int a, b;
    cin >> a >> b;
    int count = 0; 
    if(a < 2 && b < 2) return cout << 0, 0;
    while(a != 0 && b != 0) {
        int tmp = a;
        a = max(a, b) - 2;
        b = min(tmp, b) + 1;
        count++;
    }

    cout << count;
    return 0;
}