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
  int sol = 0, energy = 0;
  for (int i = 1; i < n; i++) {
    int c = A[i - 1] - A[i];
    if (energy - c < 0) {
      sol += abs(c);
    } else {
      energy += c;
    }
  }

  cout << sol;

  return 0;
}