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
  int t, w, h, n, count;
  long long sheet;
  cin >> t;
  while (t--) {
    cin >> w >> h >> n;
    count = 0, sheet = 1;
    while (w % 2 == 0) {
      count++;
      w /= 2;
    }
    if (count != 0) sheet *= pow(2, count);
    count = 0;
    while (h % 2 == 0) {
      count++;
      h /= 2;
    }
    if (count != 0) sheet *= pow(2, count);

    cout << (sheet >= n ? "YES" : "NO") << endl;
  }

  return 0;
}