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

  int p1, p2, t1, t2;
  cin >> p1 >> p2 >> t1 >> t2;

  auto _s = [](int p, int t) { return max((3 * p) / 10, p - (p / 250) * t); };
  int s1 = _s(p1, t1), s2 = _s(p2, t2);
  if (s1 == s2)
    cout << "Tie";
  else
    cout << (s1 > s2 ? "Misha" : "Vasya");

  return 0;
}