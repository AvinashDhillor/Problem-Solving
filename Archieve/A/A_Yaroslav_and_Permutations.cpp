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
  int size;
  cin >> size;
  if (size == 1) return cout << "YES", 0;
  map<int, int> A;
  for (int i = 0; i < size; i++) {
    int n;
    cin >> n;
    A[n]++;
  }

  for (auto it : A)
    if (it.second > ceil((double)size / 2.0)) return cout << "NO", 0;

  cout << "YES";
  return 0;
}