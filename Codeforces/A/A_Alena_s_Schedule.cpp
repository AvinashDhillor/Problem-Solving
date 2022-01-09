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

  int sol = 0;
  int n;
  cin >> n;
  vector<int> A(n);
  for (int& i : A) cin >> i;
  sol += count(all(A), 1);
  for (int i = 2; i < n; i++)
    if (A[i] == 1 && A[i - 1] == 0 && A[i - 2] == 1) sol++;

  cout << sol << endl;

  return 0;
}