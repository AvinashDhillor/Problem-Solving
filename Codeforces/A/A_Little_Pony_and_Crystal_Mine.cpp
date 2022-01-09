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
  int n, i = 0;
  cin >> n;
  string A = "", sol = "";
  for (int i = 0; i < n; i++) A += 'D';
  sol = A;
  while (i < n / 2) {
    A[i] = A[n - 1 - i] = '*', sol = A + "\n" + sol + "\n" + A, i++;
  }

  cout << sol << endl;
  return 0;
}