package kapitel12;

public class BinaryTree<T> {

    private Node<T> root = null;
    private int size = 0;

    public void insert(T data){
        if(root == null){
            size++;
            root = new Node<T>(data);
            return;
        }

        insert(root, data);
    }

    private void insert(Node<T> currentNode, T data){
        int compareToResult = ((Comparable)currentNode.getData()).compareTo(data);
        if(compareToResult > 0){
            if(currentNode.getLeftNode() != null){
                insert(currentNode.getLeftNode(), data);
            }else{
                size++;
                currentNode.setLeftNode(new Node<T>(data));
            }
        }else if(compareToResult < 0){
            if(currentNode.getRightNode() != null){
                insert(currentNode.getRightNode(), data);
            }else{
                size++;
                currentNode.setRightNode(new Node<T>(data));
            }
        }
    }

    public void print(){
        if(root != null){
            print(root);
        }else{
            System.out.println("Keine Elemente vorhanden");
        }
    }

    public void print(Node<T> currentNode){
        if(currentNode.getLeftNode() != null){
            print(currentNode.getLeftNode());
        }

        System.out.println(currentNode.getData());

        if(currentNode.getRightNode() != null){
            print(currentNode.getRightNode());
        }
    }

    public int size(){
        return size;
    }


    private class Node<T>{
        private Node<T> leftNode;
        private Node<T> rightNode;
        private T data;

        public Node(T data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

        public Node<T> getLeftNode(){
            return leftNode;
        }

        public void setLeftNode(Node<T> leftNode){
            this.leftNode = leftNode;
        }

        public Node<T> getRightNode(){
            return rightNode;
        }

        public void setRightNode(Node<T> rightNode){
            this.rightNode = rightNode;
        }

        public T getData(){
            return data;
        }
    }
}
