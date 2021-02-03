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

  int mLen = 1, tmp = 1, n;
  cin >> n;
  vector<int> A(n);
  for (int &i : A) cin >> i;
  for (int i = 1; i < n; i++) {
    if (A[i] < A[i - 1]) {
      tmp = 1;
      continue;
    }
    mLen = max(++tmp, mLen);
  }
  cout << mLen;
  return 0;
}