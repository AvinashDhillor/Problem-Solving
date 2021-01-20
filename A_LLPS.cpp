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
  string s;
  cin >> s;
  char m = ' ';
  int cnt = 0;
  for (char &c : s)
    if (c == m)
      cnt++;
    else if (c > m)
      m = c, cnt = 1;

  while (cnt--) cout << m;
  return 0;
}