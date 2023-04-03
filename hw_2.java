// Задача 2.
// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class hw_2 {    
    public static Deque<Object> fillList(){
        Deque<Object> list = new LinkedList<>();
        list.add("Начало");
        list.add("Один");
        list.add(2);
        list.add("Три");
        list.add("Конец");
        return list;
    }
    public static void printList(Deque<Object> list){
        System.out.println();
        for(Object el: list){
            System.out.printf(el + " ");
        }
        System.out.println();
    }
    public static void enqueue(Deque<Object> list){
        System.out.print("\nВведите элемент, который надо добавить: ");
        Scanner sc1 = new Scanner(System.in);
        Object element = sc1.nextLine();
        list.addLast(element);
        //sc1.close();
    }
    public static Object dequeue(Deque<Object> list){
        Object item = list.pollFirst();
        return item;
    }
    public static Object first(Deque<Object> list){
        return list.peekFirst();
    }
    public static void main(String[] args) {
        Deque<Object> que = new LinkedList<>();
        que = fillList();
        printList(que);
        System.out.println("\nВведиет номер операции:\n1 - поместить элемент в конец очереди;\n2 - вернуть первый элемент из очереди и удалить его;\n3 - вернуть первый элемент из очереди, не удаляя;\n4 - завершение работы.\n");
        
        while(true){
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if (cmd == 1){
                enqueue(que);
                printList(que);
                System.out.println();
                continue;
            }
            if (cmd == 2) {
                System.out.println("\nПервый элемент: " + dequeue(que)); 
                printList(que);
                System.out.println();
                continue;
            }
            if (cmd == 3){
                System.out.println("\nПервым элементом был: " + first(que)); 
                System.out.println();
                continue;
            }
            if (cmd == 4) break;
            else {
                System.out.println("\nДля выхода из программы введите 4");
                System.out.println();
            }
            sc.close();
        }
        
    }
}
