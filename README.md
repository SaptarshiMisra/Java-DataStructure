## Java-DataStructure for codegigs.app DataStructure course
### Roadmap
![Roadmap](src/roadmap.html.png)  
# Binary Search 
- [binary search problems](src/binary_search/neetcode_roadmap.md)

# Linked List
- [LinkedList Solid implementation notes](src/linkedlist/notes.md)

- [LinkedList problems ](src/linkedlist/problems.md)

# Dijkstra Algorithm 

  **Try implementing Dijkstra's Algorithm online:** [Replit](https://replit.com/~) | [OnlineGDB](https://www.onlinegdb.com/) | [JDoodle](https://www.jdoodle.com/)

  
  
  ## Theory
  
  ### Dijkstra's Algorithm Explanation
  Dijkstra's Algorithm is used to find the shortest paths from a source vertex to all other vertices in a weighted graph with non-negative edge weights. It uses a priority queue (min-heap) to always expand the shortest known distance first.
  
  ### Steps:
  1. **Initialize** the distance array with `Infinity`, except for the source node which is set to `0`.
  2. **Use a priority queue (min-heap)** to process nodes with the shortest known distance first.
  3. **Relaxation**: For each neighbor of the current node, update the distance if a shorter path is found.
  4. **Continue until all reachable nodes are processed**.
  5. **Return the shortest distances** from the source to all nodes.
  
  ### Java Implementation
  ```java
  import java.util.*;
  
  class Dijkstra {
      static class Pair {
          int node, distance;
          Pair(int node, int distance) {
              this.node = node;
              this.distance = distance;
          }
      }
      
      public static int[] dijkstra(int n, List<List<Pair>> graph, int src) {
          int[] dist = new int[n];
          Arrays.fill(dist, Integer.MAX_VALUE);
          dist[src] = 0;
          
          PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
          pq.add(new Pair(src, 0));
          
          while (!pq.isEmpty()) {
              Pair current = pq.poll();
              int u = current.node;
              
              for (Pair neighbor : graph.get(u)) {
                  int v = neighbor.node;
                  int weight = neighbor.distance;
                  
                  if (dist[u] + weight < dist[v]) {
                      dist[v] = dist[u] + weight;
                      pq.add(new Pair(v, dist[v]));
                  }
              }
          }
          return dist;
      }
      
      public static void main(String[] args) {
          int n = 5;
          List<List<Pair>> graph = new ArrayList<>();
          for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
          
          graph.get(0).add(new Pair(1, 10));
          graph.get(0).add(new Pair(3, 5));
          graph.get(1).add(new Pair(2, 1));
          graph.get(1).add(new Pair(3, 2));
          graph.get(2).add(new Pair(4, 4));
          graph.get(3).add(new Pair(1, 3));
          graph.get(3).add(new Pair(2, 9));
          graph.get(3).add(new Pair(4, 2));
          graph.get(4).add(new Pair(2, 6));
          
          int src = 0;
          int[] shortestDistances = dijkstra(n, graph, src);
          System.out.println("Shortest distances from source: " + Arrays.toString(shortestDistances));
      }
  }
  ```
  
  ---
  
  ## LeetCode Problems
  
  This table lists LeetCode problems related to Dijkstra's Algorithm along with solution links.
  
  | #  | Problem Name | Difficulty | LeetCode Link | GitHub Solution |
  |----|-------------|------------|---------------|----------------|
  | 1  | Dijkstra's Algorithm Implementation | N/A | [Implementation](https://github.com/yourusername/dijkstra-implementation) | [Solution](https://github.com/yourusername/dijkstra-implementation) |
  | 2  | Network Delay Time | Medium | [Problem](https://leetcode.com/problems/network-delay-time/) | [Solution](https://github.com/yourusername/network-delay-time) |
  | 3  | Path With Minimum Effort | Medium | [Problem](https://leetcode.com/problems/path-with-minimum-effort/) | [Solution](https://github.com/yourusername/path-with-minimum-effort) |
  | 4  | Cheapest Flights Within K Stops | Medium | [Problem](https://leetcode.com/problems/cheapest-flights-within-k-stops/) | [Solution](https://github.com/yourusername/cheapest-flights-k-stops) |
  | 5  | The Maze II | Medium | [Problem](https://leetcode.com/problems/the-maze-ii/) | [Solution](https://github.com/yourusername/the-maze-ii) |
  | 6  | Swim in Rising Water | Hard | [Problem](https://leetcode.com/problems/swim-in-rising-water/) | [Solution](https://github.com/yourusername/swim-in-rising-water) |
  | 7  | Minimum Cost to Reach Destination in Time | Hard | [Problem](https://leetcode.com/problems/minimum-cost-to-reach-destination-in-time/) | [Solution](https://github.com/yourusername/minimum-cost-reach-destination) |
  | 8  | Find the City With the Smallest Number of Neighbors at a Threshold Distance | Medium | [Problem](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) | [Solution](https://github.com/yourusername/find-the-city-smallest-neighbors) |
  | 9  | Minimum Effort Path | Medium | [Problem](https://leetcode.com/problems/minimum-effort-path/) | [Solution](https://github.com/yourusername/minimum-effort-path) |
  | 10 | Design Graph With Shortest Path Calculator | Hard | [Problem](https://leetcode.com/problems/design-graph-with-shortest-path-calculator/) | [Solution](https://github.com/yourusername/design-graph-shortest-path) |
