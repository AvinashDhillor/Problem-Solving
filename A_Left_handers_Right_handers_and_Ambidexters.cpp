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

  int l, r, a, tmp, sol = 0;
  cin >> l >> r >> a;
  tmp = l;
  l = min(l, r);
  r = max(tmp, r);
  while (l < r && a != 0) l++, a--;
  sol = a == 0 ? l * 2 : (l * 2) + ((a / 2) * 2);
  cout << sol;
  return 0;
}