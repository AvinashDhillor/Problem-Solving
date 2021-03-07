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
  int score = A[k - 1];
  sort(all(A));
  int index = score == 0 ? upper_bound(all(A), score) - A.begin()
                         : lower_bound(all(A), score) - A.begin();

  cout << (index != A.size() ? A.size() - index : 0);
  return 0;
}