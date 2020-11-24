package Tutorial20;

/* 1)Interface */
    public interface Tutorial20_Dog {

        abstract void crying();
        public void show();
        //cannot add the code inside the method
        //public void show(){
        //    System.out.println("Hello World");
        //}
        public void one();

    }

/* 2) abstract class
abstract class Tutorial20_Dog {
    abstract void crying();

    //abstract에서 method 를 public으로 정의하려면 꼭 몸체를 적어줘야함
    /*public void show(){
        System.out.println("Hi");
    }
}
 */


