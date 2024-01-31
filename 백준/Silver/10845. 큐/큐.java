import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
            } else if (str.equals("pop")) {
                if (list.size() == 0) {
                    bw.append(-1 + "\n");
                } else {
                    int pop = list.remove(0);
                    bw.append(pop + "\n");
                }
            } else if (str.equals("size")) {
                bw.append(list.size() + "\n");
            } else if (str.equals("empty")) {
                if (list.size() == 0) {
                    bw.append(1 + "\n");
                } else {
                    bw.append(0 + "\n");
                }
            } else if (str.equals("front")) {
                if (list.size() == 0) {
                    bw.append(-1 + "\n");
                } else {
                    bw.append(list.get(0) + "\n");
                }
            } else if (str.equals("back")) {
                if (list.size() == 0) {
                    bw.append(-1 + "\n");
                } else {
                    bw.append(list.get(list.size() - 1) + "\n");
                }
            }

            bw.flush();
        }
    }
}
