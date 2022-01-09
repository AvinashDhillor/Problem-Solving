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

  int n;
  cin >> n;
  string s, a, b;
  cin >> s;
  int ab = count(all(s), '4'), cd = count(all(s), '7');

  if (ab + cd != n) return cout << "NO", 0;

  a = s.substr(0, n / 2), b = s.substr(n / 2, n / 2);
  sort(all(a));
  sort(all(b));
  cout << (a == b ? "YES" : "NO");

  return 0;
}