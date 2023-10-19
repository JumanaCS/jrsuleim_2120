public class LinkedList<T>  {


    Node itsFirstNode;
    Node itsLastNode;
    private int size;


    public LinkedList() {
        itsFirstNode = null;
        itsLastNode = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }
    
    public Iterator<T> getIterator() {
        return new Iterator<T>(this);
    }

    // THIS WILL NEED TO BE MODIFIED FOR DOUBLY LINKED LIST
    public void add(T element) {
        
        Node node = new Node(element);

        if (itsFirstNode == null) {
            itsFirstNode = node;
            itsLastNode = node;
        }
        else {
            node.setPriorNode(itsLastNode); // modified
            itsLastNode.setNextNode(node);
            itsLastNode = node;
        }
        size++;
    }

    // THIS WILL NEED TO BE MODIFIED FOR DOUBLY LINKED LIST
    public void add(T element, int index) {
        //modified
        if(index == 0){
            Node newNode = new Node(element);
            newNode.setNextNode(itsFirstNode);
            itsFirstNode.setPriorNode(newNode);
            itsFirstNode = newNode;
            if(itsLastNode == null)
                itsLastNode = itsFirstNode;
            size++;
        }

        else if(index == size)
            add(element);
        else {
            Node newNode = new Node(element);
            Node current = itsFirstNode;

            while(index > 0) {
                current = current.getNextNode();
                index--;
            }

            newNode.setNextNode(current);
            newNode.setPriorNode(current.getPriorNode());
            current.getPriorNode().setNextNode(newNode);
            current.setPriorNode(newNode);
            size++;
        }
        /*
        * Singly-linked list
        int counter = 0;
        Node newNode = new Node(element);
        Node current = itsFirstNode;
        while (current != null ) {
            if (counter == index - 1)
                break;
            current = current.getNextNode();
            counter++;
        }
        newNode.setNextNode(current.getNextNode());
        current.setNextNode(newNode);
        size++;
        */
    }

    public T get(int index) {
        if(index >= 0 && index < size){ // modified if statment checking if the index is within the size
            int counter = 0;
            Node current = itsFirstNode;
            while (current != null ) {
                if (counter == index)
                    break;
                current = current.getNextNode();
                counter++;
            }
            return current.getData();
        }
        else // modified - invaid index will return null
            return null;
    }



    // TO BE IMPLEMENTED
    /*
    // returns true if element is in the list, false if not
    */
    public boolean contains(T element) {
        Node current = itsFirstNode;
        while(current != null){
            if(current.getData().equals(element))
                return true;
            current = current.getNextNode();
        }
        return false;
    }

    // returns the index of the element if it is in the list, -1 if not found
    public int indexOf(T element) {
        int index = 0;
        Node current = itsFirstNode;
        while(current != null){
            if(current.getData().equals(element))
                return index;
            index++;
            current = current.getNextNode();
        }
        return -1;
    }

    // returns an Iterator at the location of the element if it is in the list
    // returns the null reference if the element is not found
    public Iterator<T> iteratorAt(T element) {
        if(contains(element)){
            Iterator<T> iter = this.getIterator();

            while(iter.hasNext()){
                if(iter.next().equals(element)){
                    iter.prior();
                    return iter;
                }
            }
        }
        return null;
    }

    public String toString() {
        String returnVal = "";
        Node current = itsFirstNode;
        if (size != 0 ) {
            while (current != null ) {
                returnVal += current.toString();
                returnVal += "\n";
                current = current.getNextNode();
            }
        }
        return returnVal;
    }  // end toString

    class Node {
    
        private T data;
        private Node itsNext;
        private Node itsPrior;
    
        public Node(T data) {
            itsNext = null;
            itsPrior = null;
            this.data = data;
        }
    
    
        public T getData() {
            return this.data;
        }
    
        public Node getNextNode() {
            return itsNext;
        }

        // TO BE IMPLEMENTED
        public Node getPriorNode() {
            return itsPrior;
        }
        
        public void setNextNode(Node next) {
            itsNext = next;
        }

        // TO BE IMPLEMENTED
        public void setPriorNode(Node prior) {
            itsPrior = prior;
        }
    
        public String toString() {
            return data.toString();
        }
    
    }  // end of Node
}
