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

  int n;
  cin >> n;
  // cin >> n;
  // vector<int> A(n);
  // for (int &i : A) cin >> i;

  // sort(all(A));
  for (int i = 0; i <= n; i++) {
    cout << i << " ";
  }

  return 0;
}