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

  int a = n, b = 1, diff = abs(A[n - 1] - A[0]);

  for (int i = 1; i < n; i++) {
    int tmp = abs(A[i] - A[i - 1]);
    if (diff > tmp) diff = tmp, a = i, b = i + 1;
  }

  cout << a << " " << b;
  return 0;
}