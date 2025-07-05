package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTriangle {

    public static void main(String[] args) throws IOException {

        // 1. 3개의 숫자 계속 입력 받기
        // 1-1. 입력받는 도중 0 0 0을 입력받으면 입력받기 종료
        // 2. 직각삼각형이면 right, 아니면 wrong출력
        // 2-1. 직각삼각형 판별법 -> 피타고라스정의
        // 2-2. 입력받은 줄의 가장 큰 수를 지정 후 제곱
        // 2-3. 나머지 두개의 수 제곱 후 더함
        // 2-4. 2-2와 2-3의 값이 값으면 직각삼각형
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String line = br.readLine();

            String[] parts = line.split(" ");

            // 각각 변수에 저장
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a * a == b * b + c * c || a * a + c * c == b * b || a * a + b * b == c * c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }

    }
}
