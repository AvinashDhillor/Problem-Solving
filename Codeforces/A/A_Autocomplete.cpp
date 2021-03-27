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

  string s, k;
  cin >> s;
  int n;
  cin >> n;
  set<string> A;
  for (int i = 0; i < n; i++) {
    cin >> k;
    if (k.substr(0, s.size()) == s) A.insert(k);
  }

  cout << (A.size() == 0 ? s : *A.begin());

  return 0;
}