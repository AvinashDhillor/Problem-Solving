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

  int t, n, p, q;
  cin >> t;
  vector<int> A(t + 1, 0);
  for (int i = 0; i < t; i++) {
    cin >> n;
    A[i + 1] = A[i] + n;
  }

  int tmp = A[max(p - 1, q - 1)] - A[min(p - 1, q - 1)];
  cout << min(tmp, A[t] - tmp);
  return 0;
}