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

  string a, b, sol = "";
  cin >> a >> b;
  for (int i = 0; i < a.size(); i++) sol += a[i] != b[i] ? '1' : '0';
  cout << sol << endl;
  return 0;
}