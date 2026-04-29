package basic.Do_it_알고리즘_코딩테스트;

import java.util.Scanner;

public class BOJ1546평균구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int max = 0;

        for (int i = 0 ; i < N ;i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                max = temp;
            }
            sum += temp;
        }

        double avg = sum * 100.0 / max / N;
        System.out.print(avg);
    }
}
