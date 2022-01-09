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
  vector<int> A(n);
  for (int &i : A) cin >> i;

  for (int i = 0; i < n; i++) {
    A[i] = 5 - A[i];
  }

  sort(all(A));

  int range = lower_bound(all(A), k) - A.begin();
  cout << (n - range) / 3 << endl;
  return 0;
}