
public class App {
    public static void main(String[] args) throws Exception {
        int MIN = 0;
        int MAX = 100;
        Exercise07 exercise07 = new Exercise07();
        int numberRandom = exercise07.generateNumberRandom(MIN, MAX); // 0 <= randoms <= MAX
        int attempts = 0;
        int numberUser = -1;

        do {
            numberUser = exercise07.enterNumber();
            System.out.println("Numero de usuario: " + numberUser);
            attempts++;
        } while (numberUser != numberRandom);

        System.out.println("Lo adivino en " + attempts + " intenos ");
    }
}
