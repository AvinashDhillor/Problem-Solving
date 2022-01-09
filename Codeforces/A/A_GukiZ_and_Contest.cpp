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
  vector<int> A(t), B(t);
  for (int &i : A) cin >> i;
  copy(all(A), B.begin());
  sort(all(B));
  for (int i = 0; i < t; i++) {
    int elements = (upper_bound(all(B), A[i]) - B.begin());
    cout << t - elements + 1 << " ";
  }

  return 0;
}