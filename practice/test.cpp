#include <bits/stdc++.h>

using namespace std;

class PairClass {
public:
    int a, b;
    PairClass(int _a, int _b) {
        this->a = _a;
        this->b = _b;
    }

    string convertToString() {
        return this->a + "  " + this->b;
    }
};

struct CustomSort {
    bool operator()(PairClass *a, PairClass *b) {
        return a->a < b->a;
    }
};

int main() {
    priority_queue<PairClass *, vector<PairClass *>, CustomSort> pq;
    PairClass *two = new PairClass(23, 13);
    cout << two->convertToString();
    pq.push(new PairClass(1, 4));
    pq.push(new PairClass(2, 3));
    pq.push(new PairClass(3, 2));
    pq.push(new PairClass(4, 1));

    while (!pq.empty()) {
        PairClass *top = pq.top();
        cout << top->convertToString() << " " << endl;
        pq.pop();
    }

    return 0;
}