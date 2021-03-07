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
  int t, a, b;
  cin >> t;
  vector<int> A;
  while (t--) {
    cin >> a >> b;
    A.push_back(b - a);
  }
  sort(all(A));
  cout << A.size() - (lower_bound(all(A), 2) - A.begin());
  return 0;
}