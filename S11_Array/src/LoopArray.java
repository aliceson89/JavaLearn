public class LoopArray {
    public static void main (String[] args){

        String[] names ={"John", "Paul", "Amy" ,"Mia"};

        /**
         * Way 1 : using index
         */
        for (int i =0; i< names.length;i++){
            System.out.println(names[i]);
        }
        /**
         * output:
         * John
         * Paul
         * Amy
         * Mia
         */


        /**
         * Way 2 : String : Array
         */
        for (String name : names){
            System.out.println(name);
        }

        /**
         * output:
         * John
         * Paul
         * Amy
         * Mia
         */
     }

}
