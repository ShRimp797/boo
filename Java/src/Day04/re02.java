package Day04;
import java.util.Scanner;

public class re02 {
    public static void main(String[] args) {
        // 첫 번째 줄에 입력할 개수 n을 입력받고
        // 둘째 줄에 n개의 정수를 공백으로 입력받아서
        // n개의 정수 중 최대값을 출력하시오

        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력: ");

        // n개의 정수를 입력받기
        int n = sc.nextInt();
               // 배열 생성
        int arr[] = new int[n];
        
        // 배열에 n개의 정수 입력받기
        System.out.println("값을 입력하기: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 최댓값을 찾는 변수 (음수값도 잘 처리하려면 Integer.MIN_VALUE 사용)
        int max = Integer.MIN_VALUE;

        // 배열을 반복하며 최댓값 찾기
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // 최댓값 출력		
        System.out.println("최댓값: " + max);

        // Scanner 객체 닫기
        sc.close();
    }
}
