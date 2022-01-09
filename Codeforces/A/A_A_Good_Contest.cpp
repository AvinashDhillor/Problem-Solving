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

  int t, a, b;
  string s;
  cin >> t;
  while (t--) {
    cin >> s >> a >> b;
    if (a >= 2400 && b - a > 0) return cout << "YES", 0;
  }
  cout << "NO";
  return 0;
}