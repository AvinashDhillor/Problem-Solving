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

  int n, k, a, b, c, d;
  cin >> n;
  k = n - 2;
  vector<int> A(n);
  for (int &i : A) cin >> i;

  sort(all(A));

  a = upper_bound(A.begin(), A.end(), INT_MIN) - A.begin();
  cout << 1 << " " << A[a] << endl;

  if (upper_bound(all(A), 0) == A.end()) {
    b = upper_bound(A.begin() + a + 1, A.end(), A[a]) - A.begin();
    c = lower_bound(A.begin() + b + 1, A.end(), A[b]) - A.begin();
    cout << 2 << " " << A[b] << " " << A[c] << endl;
    k--;
  } else {
    d = upper_bound(all(A), 0) - A.begin();
    cout << 1 << " " << A[d] << endl;
  }

  cout << k << " ";
  for (int i = 0; i < n; i++)
    if (i != a and i != b and i != c and i != d) cout << A[i] << " ";

  return 0;
}