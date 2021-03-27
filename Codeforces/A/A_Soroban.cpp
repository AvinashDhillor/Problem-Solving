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

  vector<string> A({"O-|-OOOO", "O-|O-OOO", "O-|OO-OO", "O-|OOO-O", "O-|OOOO-",
                    "-O|-OOOO", "-O|O-OOO", "-O|OO-OO", "-O|OOO-O",
                    "-O|OOOO-"});
  string k;
  cin >> k;
  for (int i = k.size() - 1; i >= 0; i--) {
    cout << A[k[i] - '0'] << endl;
  }

  return 0;
}