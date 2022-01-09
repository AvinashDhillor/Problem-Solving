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

  int t, cnt = 0;
  string s;
  cin >> t >> s;

  int x = count(all(s), 'x'), X = t - x;
  cnt = abs(x - X) / 2;
  cout << cnt << endl;

  while (cnt-- != 0) {
    int index = find(all(s), x > X ? 'x' : 'X') - s.begin();
    s.replace(index, 1, (x > X ? "X" : "x"));
  }

  cout << s;

  return 0;
}