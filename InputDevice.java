import java.util.Random;

public class InputDevice {
    public String getType() {
        return "random";
    }

    public int nextInt() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return randomNumber;

    }

    public int[] getNumbers(int N){
        int[] numbers = new int[N];
        Random random = new Random();

        for(int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        return numbers;
    }

    public String getLine(){
        return "The quick brown fox jumps over the lazy dog.";
    }




}


