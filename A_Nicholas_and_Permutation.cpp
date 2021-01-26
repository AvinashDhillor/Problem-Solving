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
  vector<int> A(n);
  for (int &i : A) cin >> i;
  int maxi = max_element(all(A)) - A.begin();
  int mini = min_element(all(A)) - A.begin();
  cout << max(max(maxi, mini), n - min(maxi, mini) - 1);
  return 0;
}