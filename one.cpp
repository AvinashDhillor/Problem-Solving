   #include<bits/stdc++.h>

   using namespace std;


   long calodd(long n) {
        return 2*n - 1;
    }

    long caleven(long n)  {
        return 2 * n;
    }


    vector<long> calcXOR(int N, vector<int> A, int Q, vector<vector<int>> queries) {
        vector<long> result(Q);

        long spcxor = 0;
        vector<long> impact(N);

        vector<long> list;
        bool isOdd = N % 2 == 0 ? false : true;

            int ma = N - 1;
            int ab = ma / 2;
            for(int i = ab; i >= 1; i--) {
                list.push_back(isOdd ? calodd(i) : caleven(i));
            }

            if(!isOdd) list.push_back(0);

            for(int i = 1; i <= ab; i++) {
                list.push_back(isOdd ? (-1) * calodd(i) : (-1) * caleven(i));
            }

        impact[0] = N - 1;

        for(int i = 1; i < N; i++) {
            impact[i] = impact[i-1] + list[i-1];
        }


        vector<bool> isinv(N);

        for(int i = 0; i < N; i++) {
            if(impact[i] % 2 != 0) {
                isinv[i] = true;
                spcxor ^= A[i];
            }
        }

        for(int i = 0; i < Q; i++) {
            long index = queries[i][0] - 1;
            long value = queries[i][1];

            if(isinv[index] == false) {
                result[i] = spcxor;
            } else {
                spcxor ^= A[index];
                spcxor ^= value;
                A[index] = value;
                result[i] = spcxor;
            }
        }
        
        return result;
    } 


    int main() {
        vector<long>   ans =  calcXOR(5, {1, 4, 243, 13}, 1, {{1, 3}});
        for(long i : ans) {
            cout << i << endl;
        }
    }