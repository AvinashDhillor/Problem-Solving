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
  set<int> A;
  for (int i = 0; i < t; i++) {
    cin >> n;
    A.insert(n);
  }
  cout << (A.size() == 1 ? "NO" : to_string(*(++A.begin())));
  return 0;
}