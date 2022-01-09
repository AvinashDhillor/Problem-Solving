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

  int n, m, k, p, one = 0, two = 0;
  cin >> n >> m >> k;
  for (int i = 0; i < n; i++) {
    cin >> p;
    p & 1 ? one++ : two++;
  }
  cout << (m - one >= 0 && (m - one + k) - two >= 0
               ? 0
               : abs(one - min(m, (m + k - two))));

  return 0;
}