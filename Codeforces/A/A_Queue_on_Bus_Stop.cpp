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
  vector<bool> B(n, true);
  int sol = 0;
  for (int i = 0; i < n; i++) {
    int tmp = A[i];
    if (B[i]) {
      for (int j = i + 1; j < n; j++) {
        if (tmp + A[j] <= k) {
          B[j] = false, tmp += A[j];
        } else
          break;
      }
      sol++;
    }
  }

  cout << sol << endl;
  return 0;
}