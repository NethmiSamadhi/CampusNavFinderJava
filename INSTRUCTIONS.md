# Your Part: Core Graph & Dijkstra's Algorithm

## What you own
- src/graph/ (Node.java, Edge.java, Graph.java)
- src/algorithms/Dijkstra.java
- src/core/ (RoutePlanner.java, RouteResult.java, CampusMapData.java)
- test/tests/ (TestGraph.java, TestDijkstra.java)
- test/testutil/TestRunner.java

## What this does
Builds the campus map as a Graph (adjacency list) and finds the shortest
path between two locations using Dijkstra's Algorithm with a priority queue.

## How to add this to the shared repo
1. Clone the shared repo: git clone https://github.com/NethmiSamadhi/CampusNavFinderJava.git
2. Copy these folders into the cloned repo, matching the same paths shown above.
3. Set your own git identity:
   git config user.name "Your Name"
   git config user.email "your-email@gmail.com"
4. Commit and push:
   git add src/graph src/algorithms/Dijkstra.java src/core test/tests/TestGraph.java test/tests/TestDijkstra.java test/testutil
   git commit -m "Add core Graph and Dijkstra implementation"
   git push
