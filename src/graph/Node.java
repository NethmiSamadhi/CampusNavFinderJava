package graph;

/**
 * Represents a single location (building, junction, or gate) on the campus.
 * Owned by: Member A (Graph & Core Routing Engine)
 */
public class Node {
    private final String id;
    private final String name;
    private final boolean hasRamp; // false if only reachable via stairs

    public Node(String id, String name, boolean hasRamp) {
        this.id = id;
        this.name = name;
        this.hasRamp = hasRamp;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean hasRamp() {
        return hasRamp;
    }

    @Override
    public String toString() {
        return "Node(" + id + ", " + name + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Node)) return false;
        return this.id.equals(((Node) obj).id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
