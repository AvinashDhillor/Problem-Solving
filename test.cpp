#include <bits/stdc++.h>

using namespace std;

int main() {

    vector<int> A = {10};
    int index = lower_bound(A.begin(), A.end(), 1) - A.begin();
    cout << index;
}