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
  a = abs(a), b = abs(b);
  if (a + b <= c && (c - a + b) % 2 == 0) return cout << "Yes", 0;
  cout << "No";

  return 0;
}