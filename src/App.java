public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Implementación de una lista doblemente enlazada");

        DoublyLinkedList fruits = new DoublyLinkedList();

        fruits.addLast("Manzana");
        fruits.addLast("Pera");
        fruits.addLast("Uva");
        fruits.addLast("Fresa");

        System.out.println("1. Tamaño de la lista: " + fruits.getSize()); // 4
        fruits.getSize(); // 4

        System.out.println("2. Muestra elemento en la posición 2: " + fruits.get(2)); // Uva
        System.out.println("3. Comprobar si la lista contiene la fruta 'Pera': " + fruits.contains("Pera")); // true
        System.out.println("4. Imprimir la lista de frutas: ");
        fruits.displayForward(); // Manzana, Pera, Uva, Fresa
        System.out.println("5. Agregar una fruta a la lista (Piña): ");
        fruits.addLast("Piña");
        fruits.displayForward(); // Manzana, Pera, Uva, Fresa, Piña
        System.out.println("6. Sacar una fruta de la lista (Piña): ");
        fruits.remove("Piña");
        fruits.displayForward(); // Manzana, Pera, Uva, Fresa
        System.out.println("7. Sacar la fruta en la posición 2: ");
        fruits.remove(2);
        fruits.displayForward(); // Manzana, Pera, Fresa

        DoublyLinkedList vegetables = new DoublyLinkedList();
        vegetables.addLast("Zanahoria");
        vegetables.addLast("Brócoli");
        vegetables.addLast("Espinaca");

        System.out.println("Imprimir la lista de verduras: ");
        vegetables.displayForward(); // Zanahoria, Brócoli, Espinaca

        System.out.println("8. Concatenar la lista de frutas con la lista de verduras: ");
        fruits.concatenate(vegetables);
        fruits.displayForward(); // Manzana, Pera, Fresa, Zanahoria, Brócoli, Espinaca

        System.out.println("9. Reemplazar la fruta en la posición 2 con 'Mango': ");
        fruits.set(2, "Mango");
        fruits.displayForward(); // Manzana Pera Mango Zanahoria Brócoli Espinaca 
    }
}
