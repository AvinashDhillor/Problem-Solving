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

  int n, sol = 0, prev = 0, energy = 0;
  cin >> n;
  vector<int> A(n);
  for (int &i : A) cin >> i;

  for (int i = 0; i < n; i++) {
    energy += prev - A[i];
    if (energy < 0) sol += abs(energy), energy = 0;
    prev = A[i];
  }

  cout << sol;

  return 0;
}