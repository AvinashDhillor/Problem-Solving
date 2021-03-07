#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

#define FASTIO                 \
  ios::sync_with_stdio(false); \
  cin.tie(NULL);               \
  cout.tie(NULL);

int main() {
  FASTIO
  int i1 = 0, i2 = 0, n, k;
  cin >> n;
  for (int i = 1; i <= n; i++) {
    cin >> k;
    k& 1 ? i1 += i : i2 += i;
  }
  cout << min(i1, i2);
  return 0;
}