import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HeapsAlgorithm heapsAlgorithm = new HeapsAlgorithm(new int[]{1, 2, 3, 4, 5, 6});
        int[][] permutations = heapsAlgorithm.GetPermutations();

        for (int i = 0; i < permutations.length; i++) {
            System.out.println(Arrays.toString(permutations[i]));
        }

        System.out.println("Permutations: " + permutations.length);
    }
}