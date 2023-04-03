// Задача 1.
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.LinkedList;

public class hw_1 {
    public static LinkedList<Object> fillList(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Начало");
        list.add("Один");
        list.add("Два");
        list.add(3);
        list.add("Четыре");
        list.add("Пять");
        list.add("Конец");
        return list;
    }
    public static void printList(LinkedList<Object> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
    }
    public static void replaceList(LinkedList<Object> list){
        int n = list.size()/2;
        int m = list.size();
        for(int i = 0; i < n; i++){
            Object temp = list.get(i);
            list.set(i, list.get(m-i-1));
            list.set(m-i-1, temp);
        }
    }
    public static void main(String[] args) {
        LinkedList<Object> listFirst = fillList();
        System.out.println();
        printList(listFirst);
        replaceList(listFirst);
        System.out.println();
        printList(listFirst);
        System.out.println("\n");
    }
}
