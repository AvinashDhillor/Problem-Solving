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
  int sol = 0;
  for (int i = 0; i < n; i++) {
    string s;
    cin >> s;
    int count = 0;
    for (char c : s)
      if (c == '4' || c == '7') count++;
    if (count <= k) sol++;
  }
  cout << sol;

  return 0;
}