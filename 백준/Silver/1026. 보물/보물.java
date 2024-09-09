import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] arr1 = new Integer[N];
        Integer[] arr2 = new Integer[N];

        for (int i=0; i<N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1, Comparator.naturalOrder());
        Arrays.sort(arr2, Comparator.reverseOrder());

        int sum=0;
        for (int i=0; i<N; i++){
            sum += arr1[i] * arr2[i];
        }

        System.out.println(sum);
    }
}