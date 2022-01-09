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

  vector<int> A{2, 7, 2, 3, 3, 4, 2, 5, 1, 2};
  int n;
  cin >> n;
  cout << A[n % 10] * A[(n / 10) % 10];

  return 0;
}