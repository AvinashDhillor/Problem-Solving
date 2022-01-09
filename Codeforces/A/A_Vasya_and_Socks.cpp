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

  int a, b, n;
  cin >> a >> b;
  int socks = a / b;
  while (socks != 0) {
    n = a + socks;
    socks += n / b - a / b - (n - a);
    a = n;
  }
  cout << a << endl;
  return 0;
}