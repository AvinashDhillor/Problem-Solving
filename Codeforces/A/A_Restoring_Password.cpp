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

  vector<string> A(8, "");
  string s, k;
  cin >> s;
  for (int i = 0; i < 8; i++) A[i] = s.substr(i * 10, 10);

  map<string, int> B;
  for (int i = 0; i < 10; i++) {
    cin >> k;
    B[k] = i;
  }

  for (string s : A) cout << B[s];

  return 0;
}