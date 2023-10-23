import java.util.Arrays;

public class Application {
    InputDevice inputDevice;
    OutputDevice outputDevice;

    public Application(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }
    public void playGame(int number_of_games) {
        int Firstpts = 0;
        int Secondpts = 0;
        for (int i = 0; i < number_of_games; i++) {
            int First = inputDevice.nextInt();
            int Second = inputDevice.nextInt();
            outputDevice.writeMessage(First + " " + Second);
            if (First > Second && First % Second == 0 && Second >= 10)
                Secondpts++;
            else if (First == Second) {
                Firstpts += 2;
                Secondpts += 2;
            } else Firstpts++;
        }
        if (Firstpts > Secondpts)
            outputDevice.writeMessage("First wins, winner winner chicken dinner");
        else if (Firstpts < Secondpts)
            outputDevice.writeMessage("Second wins, winner winner chicken dinner");
        else
            outputDevice.writeMessage("TIE :D");
    }
/*    public void run() {
        outputDevice.writeMessage("Application started");
        outputDevice.writeMessage("Today's lucky numbers are:");
        int randomNumber1 = inputDevice.nextInt();
        int randomNumber2 = inputDevice.nextInt();
        outputDevice.writeMessage(randomNumber1 + " " + randomNumber2);
        playGame();
        }
 */

    public int[] sortNumbers(int[] N){
        Arrays.sort(N);
        return N;
    }
    public void randomArraySort(int N){
        int[] randomNumbers = inputDevice.getNumbers(N);
        outputDevice.writeMessage("generated numbers are: " + Arrays.toString(randomNumbers));
        sortNumbers(randomNumbers);
        outputDevice.writeMessage("sorted numbers are: " + Arrays.toString(randomNumbers));

    }
    public int[] wordSizeHistogram(String sentence){
        int[] histogram = new int[6];

        String[] words = sentence.split(" ");
        for(String word: words){
           while(word.length() >= histogram.length){
               histogram = Arrays.copyOf(histogram, histogram.length + 1);
           }
           histogram[word.length()] += 1;
        }
        return histogram;
    }
    public void exampleHistogram(){
        String sentence = inputDevice.getLine();
        outputDevice.writeMessage("the generated sentence is: " + sentence);
        int[] histogram = wordSizeHistogram(sentence);
        outputDevice.writeMessage("the histogram is " + Arrays.toString((histogram)));
    }

}


