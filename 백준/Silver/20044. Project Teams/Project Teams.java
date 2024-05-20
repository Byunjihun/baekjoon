import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] skills = new int[2 * n];
        
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 2 * n; i++) {
            skills[i] = Integer.parseInt(input[i]);
        }

        br.close();

        Arrays.sort(skills);

        int minTeamSkill = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int teamSkill = skills[i] + skills[2 * n - 1 - i];
            if (teamSkill < minTeamSkill) {
                minTeamSkill = teamSkill;
            }
        }

        System.out.println(minTeamSkill);
    }
}
