package InnerClass;

public class Door {

    private Lock lock;
    //LocalInnerClass.Door.java constructor
    public Door(){
        lock = new Lock(true);
    }
    public void shopStatus(){
        if (lock.isLock()){
            System.out.println("Shop is closed, please visit later");
        }else {
            System.out.println("Welcome,we are open");
        }
    }

    //getter for Class type of Lock
    public Lock getLock() {
        return lock;
    }

    public class Lock{
        private boolean lock;

        public Lock(boolean lock) {
            this.lock = lock;
        }

        //getter for boolean type of lock
        public boolean isLock() {
            return lock;
        }

        //setter
        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }
}
