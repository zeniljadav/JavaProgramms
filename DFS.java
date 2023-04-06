import java.util.Stack;

public class DFS {

    public static void dfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        visited[start] = true;
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.print(node + " ");

            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 0}
        };
        dfs(graph, 0);
    }
}