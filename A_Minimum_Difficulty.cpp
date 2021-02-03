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
  cin >> n;
  vector<int> A(n), B;
  for (int &i : A) cin >> i;
  int mn = INT_MIN;
  for (int i = 1; i < n; i++) {
    k = A[i] - A[i - 1];
    mn = max(mn, k);
    B.push_back(k);
  }

  int sum = B[0] + B[1];
  for (int i = 2; i < B.size(); i++) sum = min(B[i - 1] + B[i], sum);

  cout << max(mn, sum);

  return 0;
}