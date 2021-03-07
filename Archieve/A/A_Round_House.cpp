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

  int a, b, c, ans;
  cin >> a >> b >> c;
  c = c < 0 ? a - ((c % a) * -1) : c % a;
  ans = b + c;
  cout << (ans % a == 0 ? a : ans % a);

  return 0;
}