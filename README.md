# Objetivos

### 1. Contar el número de elementos que tiene la lista.

- **Método:** `getSize()`
- **Descripción:** Este método retorna el atributo `size`, que es una variable privada de la clase `DoublyLinkedList` y representa el número de elementos actualmente almacenados en la lista.

### 2. Mostrar el elemento que hay en una posición concreta de la lista.

- **Método:** `get(int position)`
- **Descripción:** Este método permite obtener el elemento que se encuentra en una posición específica de la lista. Primero, verifica si la posición es válida (es decir, dentro del rango de la lista). Luego, recorre la lista desde la cabeza hasta la posición deseada y devuelve el dato almacenado en el nodo correspondiente.

### 3. Comprobar si un elemento está en la lista.

- **Método:** `contains(String value)`
- **Descripción:** Este método verifica si un elemento específico existe en la lista. Utiliza el método `indexOf(String value)` internamente, que recorre la lista y devuelve el índice de la primera aparición del elemento. Si el índice es diferente de `-1`, significa que el elemento está presente en la lista.

### 4. Imprimir los elementos que contiene la lista.

- **Método:** `displayForward()`
- **Descripción:** Este método recorre la lista desde la cabeza (`head`) hasta la cola (`tail`) e imprime cada elemento en orden.

### 5. Insertar un elemento nuevo.

- **Método:** `addLast(String value)`
- **Descripción:** Este método agrega un nuevo elemento al final de la lista. Crea un nuevo nodo con el valor proporcionado y ajusta las referencias `next` y `prev` de los nodos correspondientes para mantener la estructura de la lista doblemente enlazada.

### 6. Sacar un elemento concreto de la lista.

- **Método:** `remove(String value)`
- **Descripción:** Este método elimina el primer nodo que contiene el valor especificado. Recorre la lista hasta encontrar el nodo con el valor deseado y ajusta las referencias de los nodos adyacentes para eliminarlo de la lista. Devuelve `true` si el nodo se eliminó con éxito, o `false` si no se encontró el valor.

### 7. Sacar el elemento que ocupa una posición en la lista.

- **Método:** `remove(int position)`
- **Descripción:** Este método elimina el nodo en una posición específica de la lista. Primero, verifica que la posición esté dentro del rango de la lista. Luego, recorre la lista hasta llegar al nodo deseado y ajusta las referencias de los nodos adyacentes para eliminarlo.

### 8. Concatenar dos listas.

- **Método:** `concatenate(DoublyLinkedList otherList)`
- **Descripción:** Este método permite unir dos listas doblemente enlazadas en una sola. Si la lista actual está vacía, simplemente devuelve la lista proporcionada como argumento. Si la otra lista está vacía, devuelve la lista actual. De lo contrario, ajusta las referencias de los nodos `tail` y `head` de ambas listas para combinarlas, y actualiza el tamaño de la lista resultante.

### 9. Reemplazar un elemento de la lista.

- **Método:** `set(int position, String value)`
- **Descripción:** Este método reemplaza el dato almacenado en un nodo en una posición específica con un nuevo valor. Primero, verifica que la posición sea válida. Luego, recorre la lista hasta llegar al nodo deseado y actualiza el valor del nodo con el nuevo dato proporcionado.

## Ejemplo de Uso

```java
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

```

## Output:

```bash
Implementación de una lista doblemente enlazada
1. Tamaño de la lista: 4
2. Muestra elemento en la posición 2: Uva
3. Comprobar si la lista contiene la fruta 'Pera': true
4. Imprimir la lista de frutas: 
Manzana Pera Uva Fresa 
5. Agregar una fruta a la lista (Piña): 
Manzana Pera Uva Fresa Piña 
6. Sacar una fruta de la lista (Piña): 
Manzana Pera Uva Fresa 
7. Sacar la fruta en la posición 2: 
Manzana Pera Fresa 
Imprimir la lista de verduras: 
Zanahoria Brócoli Espinaca 
8. Concatenar la lista de frutas con la lista de verduras: 
Manzana Pera Fresa Zanahoria Brócoli Espinaca 
9. Reemplazar la fruta en la posición 2 con 'Mango': 
Manzana Pera Mango Zanahoria Brócoli Espinaca 
```

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).