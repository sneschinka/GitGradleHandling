package shapes;

public class Square implements Shape{
    @Override
    public int getNumberOfEdges() {
        return 4;
    }

    @Override
    public int getNumberOfVertices() {
        return 4;
    }
}
