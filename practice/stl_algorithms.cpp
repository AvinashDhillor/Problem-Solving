#include <bits/stdc++.h>

using namespace std;

int main() {
    vector<int> a;
    for (int i = 10; i > 0; i--) {
        a.push_back(i);
    }
    // sorting elements
    sort(a.begin(), a.end());

    for (int i : a) {
        cout << i << " ";
    }
    cout << endl;

    // find minimum element
    int min = *min_element(a.begin(), a.end());
    cout << min << endl;

    // find if element exists
    int element = *find(a.begin(), a.end(), 11);
    cout << element << endl;
}