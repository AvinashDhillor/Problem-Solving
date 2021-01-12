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
  int a, b, c;
  cin >> a >> b >> c;
  cout << min({a + b + c, 2 * b + 2 * a, 2 * b + 2 * c, 2 * a + 2 * c});
  return 0;
}