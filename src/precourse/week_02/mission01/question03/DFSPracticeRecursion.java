package precourse.week_02.mission01.question03;

public class DFSPracticeRecursion {

    // 방문 처리에 사용할 배열 선언
    static boolean[] visited = new boolean[9];

    // 그림에서 그래프의 연결 상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드 번호가 될 수 있게 0번 인덱스는 아무것도 없는 상태로 가정
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    public static void main(String[] args) {
        dfs(1);
    }

    static void dfs(int nodeIdx) {
        // 방문 처리
        visited[nodeIdx] = true;

        // 방문 노드 출력
        System.out.println(nodeIdx + " -> ");

        // 방문한 노드에 인접한 노드 찾기
        for(int i=0; i<graph.length; i++) {

        }
    }
}
