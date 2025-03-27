import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListOfDepths{
    public List<LinkedList<Node>> listOfDepths(Node root){
        List<LinkedList<Node>> result =new ArrayList<>();
        LinkedList<Node> current= new LinkedList<>();
        current.add(root);


        while (!current.isEmpty()) {
            result.add(current);
            LinkedList<Node> parents =current;
            current= new LinkedList<>();

            for(Node node : parents){
                if(node.left !=null){
                    current.add(node.left);
                }
                if(node.right !=null){
                    current.add(node.right);
                }
            }
            
        }

        return result;

    }

    
}