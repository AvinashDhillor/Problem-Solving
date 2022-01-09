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

int fact(int n) {
  int k = 1;
  for (int i = 1; i <= n; i++) k *= i;
  return k;
}

int main() {
  FASTIO

  int t;
  cin >> t;
  map<int, int> A, B;
  int count = 0;
  for (int i = 0; i < t; i++) {
    for (int j = 0; j < t; j++) {
      char c;
      cin >> c;
      if (c == 'C') A[i]++, B[j]++;
    }
  }

  for (auto it : A)
    count += it.second >= 2 ? (--it.second * (it.second + 1)) / 2 : 0;

  for (auto it : B)
    count += it.second >= 2 ? (--it.second * (it.second + 1)) / 2 : 0;

  cout << count << endl;
  return 0;
}