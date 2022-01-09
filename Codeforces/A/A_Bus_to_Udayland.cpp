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
  int t;
  cin >> t;
  string s[t];
  for (int i = 0; i < t; i++) cin >> s[i];
  int f = 1;
  for (int i = 0; i < t; i++) {
    if (s[i][0] == 'O' && s[i][1] == 'O')
      s[i][0] = '+', s[i][1] = '+', f = 0;

    else if (s[i][3] == 'O' && s[i][4] == 'O')
      s[i][3] = '+', s[i][4] = '+', f = 0;

    if (f == 0) break;
  }
  cout << (f == 1 ? "NO" : "YES\n");

  for (int i = 0; i < t && f == 0; i++) cout << s[i] << endl;

  return 0;
}