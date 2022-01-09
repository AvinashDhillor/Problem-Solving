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

  int a_size, t, a;
  cin >> a_size >> t;

  vector<int> A(a_size + 1, -1);

  while (t--) {
    cin >> a;
    int i = a;
    while (i <= a_size && A[i] == -1) A[i++] = a;
  }

  for (int i = 1; i <= a_size; i++) cout << A[i] << " ";

  return 0;
}