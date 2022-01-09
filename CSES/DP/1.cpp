#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<vector<int>> A(7, vector<int>(n + 1, 0));
    A[1][0] = 1;

    for (int i = 1; i <= 6; i++) {
        for (int j = 1; j <= n; j++) {
            if (j - i >= 0)
                A[i][j] = A[i][j - i] + A[i - 1][j];
            else {
                A[i][j] = A[i - 1][j];
            }
        }
    }

    for (int i = 1; i <= 6; i++) {
        for (int j = 1; j <= n; j++) {
            cout << A[i][j] << " ";
        }
        cout << endl;
    }

    cout << A[6][n];
    return 0;
}