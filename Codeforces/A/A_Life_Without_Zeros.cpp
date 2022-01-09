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

  ll a, b;
  cin >> a >> b;
  ll sum = a + b;

  auto p = [](ll num) {
    string k = to_string(num);
    k.erase(remove(all(k), '0'), k.end());
    return stoll(k);
  };

  cout << (p(a) + p(b) == p(sum) ? "YES" : "NO");

  return 0;
}