package basic;

public class FindMaximum {

    public static void main(String[] args) {
        // 배열 내의 최댓값을 찾는다.
        // 입력: 크기가 N(>1)인 숫자들의 배열 A
        // 출력: 배열 A내의 최댓값

        // [자연어]
        // 1. 배열의 첫 번째 요소를 최댓값으로 정한다.
        // 2. 배열의 다음 요소와 최댓값을 비교한다. 만약 다음 요소가 최댓값보다 크다면 최댓값을 그 요소로 바꾼다.
        // 3. 배열 내에 비교할 요소가 남아있으면 2단계로 가고 아니면 종료한다.

        // [의사 코드(Pseudocode)]
        /*
        max = A[0]

        for (i = 1 ; i < N ; i++)
            if (A[i] > max) max = A[i]

        return max
        */

        // [프로그래밍 언어]
        int[] intArray = {72, 60, 83, 47, 89, 95};
        int maximum;

        maximum = findMaximum(intArray);

        System.out.println("최댓값 = " + maximum);
    }

    public static int findMaximum(int[] A) {
        int max = A[0];

        for (int i = 1 ; i < A.length ; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        return max;
    }
}
