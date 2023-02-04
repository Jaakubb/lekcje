package threat;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try{
                download();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();

        Thread t2 = new Thread(() -> {
            try{
                progress();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t2.start();

    }

    private static String download() throws InterruptedException {
        //do pobierania

        Thread.sleep(3000);

        System.out.println("Pobrałem");

        return "plik";

    }

    private static String progress() throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            System.out.println("Progres");
        }
    }
}
