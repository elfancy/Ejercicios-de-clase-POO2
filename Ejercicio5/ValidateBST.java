public class ValidateBST{

    public boolean isValidBST(Node root){
return isValidBST(root, null, null);
    }

    public boolean isValidBST(Node root, Integer min, Integer max){
        if(root ==null) return true;
        if((min != null && root.value<= min || (max !=null && root.value >max)))return false;
        
        return isValidBST(root.left, min, root.value) && isValidBST(root.right, root.value, max);
    }
}