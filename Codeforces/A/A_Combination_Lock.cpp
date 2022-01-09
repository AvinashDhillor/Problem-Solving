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

  int t;
  cin >> t;
  string a, b;
  cin >> a >> b;

  int sol = 0;
  for (int i = 0; i < t; i++) {
    int p = a[i] - '0';
    int q = b[i] - '0';
    sol += min(abs(p - q), abs(9 - max(p, q) + (min(p, q) + 1)));
  }
  cout << sol;

  return 0;
}