package AnonymousInnerClass;

abstract class Lock {
    public abstract boolean isUnlocked(String keyCode);

    public void test(){
        System.out.println("test");
    }
}
public class Door {

    //error :cannot call abstract class Lock
    //Lock lock = new Lock();
    //lock.test();

    //solution : use Anonymous Class

    Lock lock = new Lock() {
        @Override
        public boolean isUnlocked(String keyCode) {
            if(keyCode.equals("qwerty")){
                return true;
            }else{
                return false;
            }
        }
    };

    public Lock getLock() {
        return lock;
    }
}
