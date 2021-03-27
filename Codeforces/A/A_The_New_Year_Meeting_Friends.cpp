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
  vector<int> A(3);
  cin >> A[0] >> A[1] >> A[2];
  sort(all(A));
  int a = A[1] - A[0], b = A[2] - A[1], c = A[2] - A[0];
  cout << (min((a + b), min((c + b), (a + c))));
  return 0;
}