public class FirstCommonAncestor{

    class AncestorNode{
        boolean nodeFound;
        Node ancestor;
    }
    
    public Node firstCommonAncestor(Node root, Node firstNode, Node secondNode){
            return posrOrderSearch(root, firstNode, secondNode).ancestor;

    }

    private AncestorNode posrOrderSearch(Node root, Node firstNode, Node secondNode){
        if(root==null){
            return new AncestorNode();
        }


        AncestorNode leftResult= posrOrderSearch(root.left, firstNode, secondNode);
        if(leftResult.ancestor !=null)return leftResult;

        AncestorNode rightResult= posrOrderSearch(root.right, firstNode, secondNode);
        if(rightResult.ancestor !=null)return rightResult;

        AncestorNode result =new AncestorNode();

        if (leftResult.nodeFound && rightResult.nodeFound) {
            result.ancestor=root;
            return result;
        }

        result.nodeFound=root==firstNode|| root==secondNode|| leftResult.nodeFound || rightResult.nodeFound;
        return result;
    }

}