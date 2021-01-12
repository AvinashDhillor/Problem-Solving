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
  vector<int> A(n);
  for (int &i : A) cin >> i;
  int total = accumulate(all(A), 0);

  set<int> B(all(A));
  int sol = 0;
  for (auto i : B) {
    if (!((total - i) & 1)) sol += count(all(A), i);
  }
  cout << sol << endl;

  return 0;
}