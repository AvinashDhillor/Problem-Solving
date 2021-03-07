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
  int t, n;
  cin >> t;
  while (t--) {
    int size, one = 0, two = 0;
    cin >> size;
    while (size--) {
      cin >> n;
      n == 1 ? one++ : two++;
    }
    int av = (two % 2) * 2;
    one -= av;
    cout << (one >= 0 && one % 2 == 0 ? "YES" : "NO") << endl;
  }
  return 0;
}