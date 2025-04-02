import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = StdIn.readString();
        int count = 1;

        while (!StdIn.isEmpty()) {
            count++;
            String currentWord = StdIn.readString();

            if (StdRandom.bernoulli(1.0 / count)) {
                champion = currentWord;
            }
        }
        StdOut.println(champion);
    }
}