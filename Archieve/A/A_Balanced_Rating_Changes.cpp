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

  int size;
  cin >> size;
  vector<int> A(size);
  for (int &i : A) cin >> i;
  int n_odd = 0, p_odd = 0, n_sum = 0, p_sum = 0;
  for (int i = 0; i < size; i++) {
    if (A[i] < 0) {
      if (A[i] & 1) n_odd++;
      n_sum += A[i] / 2;
    } else {
      if (A[i] & 1) p_odd++;
      p_sum += A[i] / 2;
    }
  }

  int i = 0;
  while (p_sum != abs(n_sum)) {
    if (p_sum > abs(n_sum) && (A[i] < 0 && A[i] & 1)) {
      n_sum--;
      A[i] = (A[i] - 1) / 2;
    } else if (p_sum < abs(n_sum) && (A[i] > 0 && A[i] & 1)) {
      p_sum++;
      A[i] = (A[i] + 1) / 2;
    } else {
      A[i] = A[i] / 2;
    }
    i++;
  }

  while (i < size) {
    A[i] = A[i] / 2;
    i++;
  }

  for (int i : A) cout << i << endl;

  return 0;
}