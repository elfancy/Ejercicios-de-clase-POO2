import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MaximumDepthTest{
    
    @Test
    public void maxDepthTest(){
    MaximumDepth maxDepth= new MaximumDepth();
    Node root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);

    assertEquals(3, maxDepth.maxDepth(root));
    root.left.left.left =new Node(8);
    assertEquals(4, maxDepth.maxDepth(root));
    System.out.println("prueba de ejecución");
    }
}