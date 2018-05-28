//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }

int[] traverseTree(Tree<Integer> t) {
    if(t == null)
        return new int[0];
    
    List<Integer> res = new ArrayList<Integer>();
    Queue<Tree<Integer>> node = new LinkedList<Tree<Integer>>();
    Tree<Integer> temp = null;
    
    node.add(t);
    
    while(node.size() > 0){
        temp = node.poll();
        res.add(temp.value);
        
        if(temp.left != null)
            node.add(temp.left);
        
        if(temp.right != null)
            node.add(temp.right);
    }
    
    int[] res_a = new int[res.size()];
    
    for(int i = 0; i < res.size(); i++)
    {
        res_a[i] = res.get(i);
    }
    
    return res_a;
}
