package ArrayList;

import java.util.ArrayList;

public class App {
    static ArrayList<String> listNames = new ArrayList<>();
    public static void main (String[] args){

        listNames.add("Alice");
        listNames.add("John");
        listNames.add("Brad");
        listNames.add("Mia");
        listNames.add("Rahul");
        listNames.add("Angel");
        listNames.add("Sophia");
        listNames.add("Peter");
        listNames.add("Allen");
        System.out.println(listNames.get(0));
        System.out.println(listNames);

        /**
         * Alice
         * John
         * Brad
         * Mia
         * Rahul
         * Angel
         * Sophia
         * Peter
         * Allen
         */
        App app = new App();
        app.displayList(listNames);
        System.out.println("********************");
        app.removeNameByIndex(0);
        app.displayList(listNames);
        /**
         * John
         * Brad
         * Mia
         * Rahul
         * Angel
         * Sophia
         * Peter
         * Allen
         */
        System.out.println("********************");
        System.out.println(listNames.get(0));
        /**
         * John
         */
        System.out.println("********************");
        app.removeNameByString("Peter");
        app.displayList(listNames);
        /**
         * John
         * Brad
         * Mia
         * Rahul
         * Angel
         * Sophia
         * Allen
         */
        System.out.println("********************");
        System.out.println(listNames.get(6));
        //output : Allen
        //before removing Peter, index 6 has Peter
        System.out.println("********************");
        app.modifyName(3,"Emma");
        app.displayList(listNames);
        /**
         * John
         * Brad
         * Mia
         * Emma
         * Angel
         * Sophia
         * Allen
         */
        System.out.println("********************");
        int find =app.search("Brad");
        System.out.println("index of Brad : "+ find);
        //output : index of Brad : 1
        System.out.println("********************");
        if (find != -1) {
            app.modifyName(find,"Chales");
        }else{
            System.out.println("Invalid Entry");
        }
        app.displayList(listNames);
        /**
         * John
         * Chales
         * Mia
         * Emma
         * Angel
         * Sophia
         * Allen
         */


    }
    void displayList (ArrayList<String> names){
        for (String name : names){
            System.out.println(name);
        }
    }
    void removeNameByIndex(int index){
        listNames.remove(index);
    }
    void removeNameByString(String name){
        listNames.remove(name);
    }

    void modifyName (int index, String newName){
        listNames.set (index,newName);
    }
    int search (String name){
        return listNames.indexOf(name);
    }
}
