package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class San {
    static ArrayList<Integer> stairs = new ArrayList<>();
    static int[] scores;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int top = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < top; i++) stairs.add(Integer.parseInt(bufferedReader.readLine()));
        scores = new int[top];
        scores[0] = stairs.get(0);
        if(stairs.size()>=2)
        scores[1] = stairs.get(0)+stairs.get(1);

        System.out.println(upstair(top-1));

    }
    static int upstair(int top) {
        if(top < 0) return 0;

        int topIndex = top-1;
        if(scores[top] == 0)
            scores[top] = Math.max(upstair(top-3) + stairs.get(top-1), upstair(top-2)) + stairs.get(top);

        return scores[top];
    }
}