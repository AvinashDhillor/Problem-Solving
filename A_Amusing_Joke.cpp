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

  string a, b, c;
  cin >> a >> b >> c;
  a += b;
  sort(all(a));
  sort(all(c));
  cout << (a == c ? "YES" : "NO");

  return 0;
}