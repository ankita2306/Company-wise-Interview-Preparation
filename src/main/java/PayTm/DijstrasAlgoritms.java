package PayTm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijstrasAlgoritms {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> cost
                = new ArrayList<>();
        cost.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        cost.add(new ArrayList<>(Arrays.asList(4, 8, 2)));
        cost.add(new ArrayList<>(Arrays.asList(1, 5, 3)));

        System.out.println(minCost(cost));
    }

    static int minCost(ArrayList<ArrayList<Integer> > cost) {
        int m = cost.size();
        int n = cost.get(0).size();

        // Directions for moving up, down, left, right,
        // diagonal
        int[][] directions
                = { { -1, 0 }, { 1, 0 },   { 0, -1 },
                { 0, 1 },  { -1, -1 }, { 1, 1 } };

        // Min-heap (priority queue) for Dijkstra's
        // algorithm
        PriorityQueue<Cell> pq = new PriorityQueue<>(
                Comparator.comparingInt(a -> a.cost));

        // Distance matrix to store the minimum cost to
        // reach each cell
        int[][] dist = new int[m][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = cost.get(0).get(0);

        pq.offer(new Cell(0, 0, cost.get(0).get(0)));

        // Dijkstra's algorithm
        while (!pq.isEmpty()) {
            Cell curr = pq.poll();
            int x = curr.x;
            int y = curr.y;

            // If we reached the bottom-right corner, return
            // the cost
            if (x == m - 1 && y == n - 1) {
                return dist[x][y];
            }

            // Explore the neighbors
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                // Ensure the new cell is within bounds
                if (newX >= 0 && newX < m && newY >= 0
                        && newY < n) {

                    // Relaxation step
                    if (dist[newX][newY]
                            > dist[x][y]
                            + cost.get(newX).get(newY)) {
                        dist[newX][newY]
                                = dist[x][y]
                                + cost.get(newX).get(newY);
                        pq.offer(new Cell(
                                newX, newY, dist[newX][newY]));
                    }
                }
            }
        }

        return dist[m - 1][n - 1];
    }

}

class Cell {
    int x, y, cost;

    Cell(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
}

