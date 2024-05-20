import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int S = Integer.parseInt(firstLine[1]);
        int R = Integer.parseInt(firstLine[2]);

        Set<Integer> damaged = new HashSet<>();
        Set<Integer> reserve = new HashSet<>();

        String[] damagedTeams = br.readLine().split(" ");
        for (int i = 0; i < S; i++) {
            damaged.add(Integer.parseInt(damagedTeams[i]));
        }

        String[] reserveTeams = br.readLine().split(" ");
        for (int i = 0; i < R; i++) {
            reserve.add(Integer.parseInt(reserveTeams[i]));
        }

        Set<Integer> used = new HashSet<>();
        for (int team : damaged) {
            if (reserve.contains(team)) {
                reserve.remove(team);
                used.add(team);
            }
        }

        damaged.removeAll(used);

        for (int team : reserve) {
            if (damaged.contains(team - 1)) {
                damaged.remove(team - 1);
            } else if (damaged.contains(team + 1)) {
                damaged.remove(team + 1);
            }
        }

        System.out.println(damaged.size());
    }
}
