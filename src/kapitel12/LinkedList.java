package kapitel12;

public class LinkedList<T> {


    private Node<T> firstNode = null;
    private int size = 0;

    public void add(T data){
        Node<T> newNode = new Node<T>(data);

        if(firstNode == null){
            firstNode = newNode;
            return;
        }

        Node<T> currentNode = firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        size++;
        currentNode.setNextNode(newNode);
    }

    public T remove(T data){
        if(firstNode == null){
            return null;
        }else{
            if(firstNode.getData().equals(data)){
                firstNode = firstNode.getNextNode();
                size--;
                return data;
            }

            Node<T> currentNode = firstNode;
            while(currentNode != null){
                if(currentNode.getNextNode() != null && currentNode.getNextNode().getData().equals(data)){
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    size--;
                    return data;
                }
                currentNode = currentNode.getNextNode();
            }
        }
        return null;
    }

    public int size(){
        return size;
    }

    public void printList(){
        if(firstNode == null){
            System.out.println("Liste ist leer");
            return;
        }

        Node<T> currentNode = firstNode;
        while(currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }


    private class Node<T>{

        private T data;
        private Node<T> nextNode;

        public Node(T data){
            this.data = data;
            this.nextNode = null;
        }

        public T getData(){
            return data;
        }

        public Node<T> getNextNode(){
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode){
            this.nextNode = nextNode;
        }

    }

}
