/**
 * Representa un nodo en una lista doblemente enlazada.
 * Cada nodo contiene un dato de tipo String y dos referencias a nodos, una para el siguiente nodo y otra para el nodo anterior.
 */

class Node {
    String data;
    Node next;
    Node prev;

    /**
     * Constructor de la clase Node.
     * las referencias next y prev se inicializan en null.
     * @param data Dato que se almacenará en el nodo.
     */
    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

/**
 * Representa una lista doblemente enlazada, puede almacenar datos de tipo String.
 */

public class DoublyLinkedList {
    private Node head; // Referencia al primer nodo de la lista.
    private Node tail; // Referencia al último nodo de la lista.
    private int size; // Tamaño de la lista.

    /**
     * Constructor de la clase DoublyLinkedList.
     * Inicializa las referencias head y tail en null y el tamaño en 0.
     */
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Devuelve el número de elementos en la lista.
     *
     * @return El tamaño de la lista.
     */
    public int getSize() {
        return size;
    }

    /**
     * Agrega un nuevo elemento al final de la lista.
     *
     * @param value El elemento a agregar.
     */
    public void addLast(String value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    /**
     * Agrega un nuevo elemento al inicio de la lista.
     *
     * @param value El elemento a agregar.
     */
    public void addFirst(String value) {
        Node newNode = new Node(value);
        if (size == 0) {
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst() {
        if (size == 0) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
    }

    /**
     * Elimina el primer nodo de la lista que contiene un valor específico.
     * @param value El valor a eliminar.
     * @return true si el valor se elimina correctamente, de lo contrario false.
     */

    public boolean remove(String value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                if (current == head) {
                    removeFirst();
                } else if (current == tail) {
                    removeLast();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    size--;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Elimina el nodo en un índice específico.
     * @param index El índice del nodo a eliminar.
     * @return true si el nodo se elimina correctamente, de lo contrario false.
     */

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
        return true;
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void removeLast() {

        if (size == 0) { // caso en el que la lista esta vacia
            return;
        }
        tail = tail.prev;

        if (tail == null) { // Caso en el que solo hay un elemento
            head = null;
        } else { // El penultimo nodo se convierte en el ultimo
            tail.next = null;
        }
        size--;
    }

    /**
     * Devuelve una representación en cadena de la lista.
     *
     * @return Una cadena que representa la lista.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            sb.append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    /**
     * Muestra los elementos de la lista en orden.
     */

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Muestra los elementos de la lista en orden inverso.
     */
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    /**
     * Devuelve el índice de la primera aparición de un elemento en la lista.
     *
     * @param value El elemento a buscar.
     * @return El índice del elemento en la lista, o -1 si no se encuentra.
     */

    public int indexOf(String value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    /**
     * Devuelve el índice de la última aparición de un elemento en la lista.
     *
     * @param value El elemento a buscar.
     * @return El índice del elemento en la lista, o -1 si no se encuentra.
     */

    public boolean contains(String value) {
        return indexOf(value) != -1;
    }

    /**
     * Devuelve el elemento en un índice específico.
     *
     * @param index El índice del elemento a devolver.
     * @return El elemento en el índice especificado, o null si el índice está fuera de rango.
     */
    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Reemplaza el elemento en un índice específico con un nuevo elemento.
     *
     * @param index El índice del elemento a reemplazar.
     * @param value El nuevo elemento.
     */
    public void set(int index, String value) {
        if (index < 0 || index >= size) {
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = value;
    }

    /**
     * Concatena dos listas.
     * @param list La lista a concatenar.
     * @return Una nueva lista que contiene los elementos de las dos listas.
     */

    public DoublyLinkedList concatenate(DoublyLinkedList otherList) {
        if (size == 0) {
            return otherList;
        }
        if (otherList.size == 0) {
            return this;
        }
        tail.next = otherList.head;
        otherList.head.prev = tail;
        tail = otherList.tail;
        size += otherList.size;
        return this;
    }

    /**
     * Inserta un nuevo elemento en un índice específico.
     * @param index El índice donde se insertará el elemento.
     * @param value El elemento a insertar.
     */
    public boolean insert(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node newNode = new Node(value);
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
        return true;
    }
}
