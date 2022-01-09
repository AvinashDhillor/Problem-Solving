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

  int n, left = 0, right = 0;
  cin >> n;
  vector<int> A(n), B(n);
  for (int &i : A) cin >> i;
  for (int &i : B) cin >> i;
  for (int i = 0; i < n; i++) left |= A[i], right |= B[i];

  cout << left + right;
  return 0;
}