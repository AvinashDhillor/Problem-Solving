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
  int a = 1, b = n * n, k = n;
  while (k-- && cout << endl)
    for (int i = 0; i < n / 2; i++) cout << a++ << " " << b-- << " ";

  return 0;
}