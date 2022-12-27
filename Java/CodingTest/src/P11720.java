import java.util.Scanner;

public class P11720 {

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();

        //N값 입력받기
        Scanner sc = new Scanner(System.in);
        //길이 N의 숫자를 입력 -> String 변수 sNum에 저장
        int N = sc.nextInt();
        //sNum을 char[]형 변수 cNum에 변환하여 저장
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        //int형 변수 sum선언하기
        int sum = 0;
        //cNum 길이만큼 반복: 배열의 각 자릿값을 정수형으로 변환하여 sum에 더하여 누적하기
        for(int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';//cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
        }
        //sum 출력하기
        System.out.println("sum = " + sum);

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("Runtime(m) : "+secDiffTime);
    }
}
