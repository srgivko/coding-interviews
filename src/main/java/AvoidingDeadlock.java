public class AvoidingDeadlock {


    public static class TestThread extends Thread{

        private Object lockObject1;
        private Object lockObject2;

        public TestThread(Object lockObject1, Object lockObject2) {
            this.lockObject1 = lockObject1;
            this.lockObject2 = lockObject2;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "run");
            synchronized (lockObject1){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockObject2){
                    System.out.println(Thread.currentThread().getName() + "completed");
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lockObject1 = new Object();
        Object lockObject2 = new Object();
        TestThread testTheard1 = new TestThread(lockObject1, lockObject2);
        TestThread testTheard2 = new TestThread(lockObject2, lockObject1);
        testTheard1.start();
        testTheard2.start();
    }
}
