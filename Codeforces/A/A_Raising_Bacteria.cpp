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
  long long n, a;
  cin >> n;
  int count = 0;
  while (n != 1) {
    if (n % 2 != 0) count++;
    n = n >> 1;
  }
  cout << count + 1;
  return 0;
}