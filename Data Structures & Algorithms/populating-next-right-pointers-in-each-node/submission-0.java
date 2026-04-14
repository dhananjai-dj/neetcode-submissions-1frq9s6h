class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Node newRoot = root;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(newRoot);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0; i < len; i++){
                Node node = queue.poll();
                if(i == len-1){
                    node.next = null;
                }else{
                    node.next = queue.peek();
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }

        return root;
    }
}