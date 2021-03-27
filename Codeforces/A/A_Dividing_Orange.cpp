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

  int n, k, p;
  cin >> n >> k;
  set<int> A;
  vector<int> B;
  for (int i = 0; i < k; i++) {
    cin >> p;
    A.insert(p), B.push_back(p);
  }
  auto it = 0;
  int count = 0;
  for (int i = 1; i <= n * k; i++) {
    if ((count + 1) % n == 0) {
      cout << B[it++] << endl;
      count++;
    }
    while (A.find(i) != A.end()) {
      i++;
    }
    cout << i << " ";
    count++;
  }

  //   vector<int> A(n * k), B;
  //   for (int i = 0; i < A.size(); i++) A[i] = i + 1;

  //   for (int i = 0; i < k; i++) {
  //     int p;
  //     cin >> p;
  //     A.erase(find(all(A), p));
  //     B.push_back(p);
  //   }
  //   int l = 0;

  //   for (int i = 0; i < k; i++) {
  //     for (int j = 1; j < n; j++) cout << A[l++] << " ";
  //     cout << B[i] << endl;
  //   }
  return 0;
}