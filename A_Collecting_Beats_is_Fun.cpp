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
  char c;
  cin >> n;
  map<char, int> A;
  for (int i = 0; i < 16; i++) {
    cin >> c;
    if (c != '.') A[c]++;
    if (A[c] > n * 2) return cout << "NO", 0;
  }

  cout << "YES";
  return 0;
}