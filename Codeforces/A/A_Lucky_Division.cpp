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
  cin >> n;

  auto p = [](int n) {
    string k = to_string(n);
    for (int i = 0; i < k.size(); i++) {
      if (k[i] != '4' && k[i] != '7') return false;
    }
    return true;
  };
  for (int i = 1; i <= n; i++) {
    if (p(i) && n % i == 0) return cout << "YES", 0;
  }
  cout << "NO";
  return 0;
}