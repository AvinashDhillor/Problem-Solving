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
  vector<int> A(t);
  for (int &i : A) cin >> i;
  int m = max_element(all(A)) - A.begin();
  int mi = min_element(A.rbegin(), A.rend()) - A.rbegin();
  cout << (m + mi + (m >= t - mi - 1 ? -1 : 0));

  return 0;
}