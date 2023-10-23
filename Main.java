import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();
        Application app = new Application(inputDevice, outputDevice);

        if(args.length == 0){
            System.out.println("Give me an argument (\"play\", \"words\", \"numbers\")");
        }
        else{
            if((args[0].toLowerCase().equals("play")))
                if(args.length < 2)
                    System.out.println("How many games?");
                else
                    app.playGame(Integer.parseInt(args[1]));
            else if((args[0].toLowerCase().equals("numbers")))
                app.randomArraySort(10);
            else if((args[0].toLowerCase().equals("words")))
                app.exampleHistogram();
        }
        ///    app.playGame();
        ///    app.randomArraySort(10);
        ///    app.exampleHistogram();
    }
}
