package main;

public class Fibonacci {

        public static int fibRec(int n) {
            if(n == 0)  return 0;
            else if(n == 1)  return 1;
            else return fibRec(n-1) + fibRec(n-2);
        }
        public static int fibTailRec(int n, int last, int curr){
            if(n == 0)  return 0;
            else if(n == 1)  return 1;
            else return fibTailRec(n-1, curr, last+curr);
        }
        public static int fibIterative(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            int first = 0;
            int last = 1;
            int temp;
            for (int i = 0; i < n - 1; i++) {
                temp = first;
                first = last;
                last = last + temp;
            }
            return last;
        }
}
