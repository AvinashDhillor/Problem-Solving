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

  int t;
  cin >> t;
  while (t--) {
    int size;
    cin >> size;
    vector<int> A(size, 0);
    int maxi = INT_MIN;
    for (int i = 0; i < size; i++) {
      int n;
      cin >> n;
      A[i] += n;
      maxi = max(maxi, A[i]);
      if (i + n < size) {
        A[i + n] = max(A[i + n], A[i]);
      }
    }
    cout << maxi << endl;
  }

  return 0;
}