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
  int in = (n == 1 ? 1 : 2);
  auto a = [](int p) { return (p ? p / 7 * 2 : 0); };
  auto l = [](int x) { return (x % 7 == 6 ? 1 : 0); };
  cout << a(n) + l(n) << " " << a(n - 2) + in + l(n - 2);

  return 0;
}