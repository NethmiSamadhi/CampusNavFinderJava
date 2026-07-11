# Campus Navigation — Core Graph & Dijkstra's Algorithm

**Individual contribution by COHNDSE252.F-006** for the group coursework
project *Smart Campus Navigation & Shortest Path Finder*.

This repository contains the **core routing engine**: the Graph data
structure and Dijkstra's shortest path algorithm that the full group
application is built on top of.

## Problem Statement
Large campuses have multiple buildings and pathways, making it hard for new
students and visitors to find the fastest route between locations. This
module solves the core computational problem: given a start and destination,
what is the shortest path through the campus?

## Data Structure Used
**Graph** (adjacency list — `HashMap<String, List<Edge>>`). Chosen over an
adjacency matrix because campus graphs are sparse (each location only
connects to a handful of nearby paths, not every other location):
- O(V + E) space instead of O(V²)
- O(1) average node lookup
- Efficient edge iteration, which Dijkstra relies on

## Core Algorithm
**Dijkstra's Algorithm**, implemented with a `PriorityQueue` (binary
min-heap) for efficient "closest unvisited node" selection.
- **Time complexity:** O((V + E) log V)
- **Space complexity:** O(V)

The algorithm accepts an optional `weightFn` callback, so features like
time-aware congestion routing can change how "cost" is calculated without
modifying the core algorithm itself — keeping this engine reusable.

## Files in This Repository
```
src/
├── graph/
│   ├── Node.java        # Represents a location (building/junction)
│   ├── Edge.java         # Represents a weighted path between two locations
│   └── Graph.java        # Core adjacency list data structure
│
├── algorithms/
│   └── Dijkstra.java     # Shortest path algorithm
│
└── core/
    ├── RoutePlanner.java   # Orchestration layer
    ├── RouteResult.java     # Simple result wrapper (path, cost, message)
    └── CampusMapData.java    # Sample campus data (9 locations, 12 paths)

test/
├── tests/
│   ├── TestGraph.java      # Unit tests for Graph
│   └── TestDijkstra.java    # Unit tests for Dijkstra
└── testutil/
    └── TestRunner.java       # Lightweight dependency-free test runner
```

## How to Compile and Test
```bash
javac -d out src/graph/*.java src/algorithms/*.java src/core/*.java test/testutil/*.java test/tests/TestGraph.java test/tests/TestDijkstra.java

java -cp out tests.TestGraph
java -cp out tests.TestDijkstra
```

## Complexity Analysis
| Operation | Complexity |
|---|---|
| Add node | O(1) |
| Add edge | O(1) |
| Dijkstra shortest path | O((V + E) log V) |
| Space | O(V + E) |

## Design Decisions
- **Adjacency list over adjacency matrix:** campus graphs are sparse, so
  this keeps space at O(V + E) instead of O(V²).
- **Priority queue over a plain list for Dijkstra:** extracting the closest
  unvisited node is O(log V) with a heap, versus O(V) with a plain list scan.
- **`weightFn` callback parameter:** allows other novel features (congestion
  routing, accessibility filtering) to change routing behaviour without
  touching this core algorithm.

## Note on the Full Project
This is one module of a larger group coursework tool. The complete working
application (including congestion-aware routing, multi-stop optimization,
and accessibility filtering built by other team members) integrates with
this engine through `RoutePlanner.java`.

## License
Educational coursework project — NIBM Higher National Diploma in Software Engineering.
