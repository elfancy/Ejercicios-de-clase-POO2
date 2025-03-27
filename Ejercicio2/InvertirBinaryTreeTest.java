import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InvertirBinaryTreeTest{
    
    @Test
    public void invertBinaryTreeTest(){
        InvertirBinaryTree invertirBinaryTree= new InvertirBinaryTree();
        Node root=new Node(4);
        root.left=new Node(2); 
        root.right=new Node(7); 
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(9);

        Node newRoot = invertirBinaryTree.invertTree(root);
        assertEquals(4, newRoot.value);
        assertEquals(7, newRoot.left.value);
        assertEquals(2, newRoot.right.value);
        assertEquals(9, newRoot.left.left.value);
        assertEquals(6, newRoot.left.right.value);
        assertEquals(3, newRoot.right.left.value);
        assertEquals(1, newRoot.right.right.value);
        System.out.println("prueba de que se ejecuto");
        
    }
}