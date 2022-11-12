package precourse.week_02.dfs;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class dfsRecursion {

    static boolean[] visited = new boolean[8];     // 방문 처리를 해줄 boolean 배열

    static int[][] graph = {{1, 2}, {0, 3, 4}, {0, 5, 6}, {1, 7}, {1, 5}, {2, 4}, {2}, {3}};
    //                         0        1          2         3       4       5     6    7

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dfs(0);     // 0부터 탐색 시작
    }

    public static void dfs(int nodeIdx) {

        visited[nodeIdx] = true;      // 방문 처리

        System.out.print(nodeIdx + " -> ");

//        for (int i = 0; i < graph[nodeIdx].length; i++) {
//            if(visited[graph[nodeIdx][i]]==false) {
//                dfs(graph[nodeIdx][i]);
//            }
//        }

        for (int node : graph[nodeIdx]) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }
}
