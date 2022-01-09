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

  int n, k;
  cin >> n >> k;
  string s;
  cin >> s;

  int g = find(all(s), 'G') - s.begin();
  int t = find(all(s), 'T') - s.begin();

  if (g > t) swap(s[g], s[t]);

  for (int i = min(g, t); i < n; i += k)
    if (s[i] == 'T')
      return cout << "YES", 0;
    else if (s[i] == '#')
      return cout << "NO", 0;

  cout << "NO";
  return 0;
}