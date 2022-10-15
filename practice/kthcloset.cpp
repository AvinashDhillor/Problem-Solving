#include <bits/stdc++.h>

using namespace std;

vector<int> findClosestElements(vector<int> &arr, int k, int x) {
    sort(arr.begin(), arr.end());
    vector<int> sol;

    int ele = lower_bound(arr.begin(), arr.end(), x) - arr.begin();
    int left = ele - 1;
    int right = ele;
    if (ele == arr.size()) {
        int right = ele - 1;
        while (k-- > 0) {
            sol.push_back(arr[right--]);
        }
    } else if (ele == 0) {
        int left = ele;
        while (k-- > 0) {
            sol.push_back(arr[left++]);
        }
    } else
        while (sol.size() < k) {
            if (right == 0) {
            }

            if (abs(x - arr[left]) == abs(x - arr[right])) {
                sol.push_back(arr[left--]);
            } else if (abs(x - arr[left]) < abs(x - arr[right])) {
                sol.push_back(arr[left--]);
            } else {
                sol.push_back(arr[right++]);
            }
        }
    sort(sol.begin(), sol.end());
    return sol;
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5};

    vector<int> sol = findClosestElements(arr, 4, 3);

    for (auto it : sol) {
        cout << it << " ";
    }

    return 0;
}