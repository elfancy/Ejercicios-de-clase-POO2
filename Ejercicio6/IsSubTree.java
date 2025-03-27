public class IsSubTree{

    public boolean isSubtree(Node first, Node second){

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        
        preOrder(first, sb1);
        preOrder(second, sb2);


        return sb1.toString().contains(sb2.toString());
    }
    
    private void preOrder(Node node, StringBuilder sb){
        if(node==null){
            sb.append("X");
            return;
        }
        sb.append(node.value);
        preOrder(node.left, sb);
        preOrder(node.right, sb);
    }
}