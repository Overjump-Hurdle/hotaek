package 백준.java.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2579 {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1][3];
        // dp 그래프
        for (int i = 1; i <= n; i++) {
            dp[i][0] = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i <= n; i++) {
            // 1번 인덱스
            if (i == 1) {
                dp[1][1] = dp[1][0];
            }
            // 2번 인덱스
            if (i == 2) {
                dp[2][1] = dp[1][0] + dp[2][0];
                dp[2][2] = dp[2][0];
            }
            if (i >= 3) {

            }

        }

    }
}
