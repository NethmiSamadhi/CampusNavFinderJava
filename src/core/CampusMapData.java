package core;

import graph.Graph;
import graph.Node;

/**
 * Sample campus map data.
 * Owned by: Member A (data setup for the routing engine)
 *
 * Note: kept as plain Java (no external JSON library) to keep the project
 * dependency-free and easy to compile with just javac. If your team prefers
 * loading from a JSON file instead, this is the only class that needs to
 * change — everything else consumes the Graph object, not the data source.
 */
public class CampusMapData {

    public static Graph buildSampleCampus() {
        Graph graph = new Graph();

        graph.addNode(new Node("GATE", "Main Gate", true));
        graph.addNode(new Node("ADMIN", "Admin Block", true));
        graph.addNode(new Node("LIB", "Library", true));
        graph.addNode(new Node("CAF", "Cafeteria", true));
        graph.addNode(new Node("LAB1", "Computer Lab 1", false));
        graph.addNode(new Node("LH1", "Lecture Hall 1", true));
        graph.addNode(new Node("LH2", "Lecture Hall 2", true));
        graph.addNode(new Node("SPORT", "Sports Complex", true));
        graph.addNode(new Node("PARK", "Parking Area", true));

        graph.addEdge("GATE", "ADMIN", 3, false);
        graph.addEdge("GATE", "PARK", 2, false);
        graph.addEdge("ADMIN", "LIB", 4, false);
        graph.addEdge("ADMIN", "CAF", 5, true);
        graph.addEdge("LIB", "LAB1", 3, true);
        graph.addEdge("LIB", "LH1", 6, false);
        graph.addEdge("CAF", "LH1", 4, false);
        graph.addEdge("CAF", "LH2", 3, false);
        graph.addEdge("LAB1", "LH2", 2, false);
        graph.addEdge("LH1", "SPORT", 7, false);
        graph.addEdge("LH2", "SPORT", 5, true);
        graph.addEdge("PARK", "CAF", 6, false);

        return graph;
    }
}
