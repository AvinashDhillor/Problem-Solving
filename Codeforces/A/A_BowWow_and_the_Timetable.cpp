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
  int one_count = 0, index;
  for (int i = s.size() - 1; i >= 0; i--) {
    if (s[i] == '1') {
      index = s.size() - i - 1;
      one_count++;
    }
  }
  if (one_count == 0) {
    cout << 0;
  } else if (one_count == 1) {
    cout << ceil((double)index / 2.0);
  } else {
    cout << (index / 2) + 1;
  }

  return 0;
}