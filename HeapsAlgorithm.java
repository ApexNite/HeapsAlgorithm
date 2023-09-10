import java.util.Arrays;

public class HeapsAlgorithm {
    private int[][] Permutations;
    private int[] Elements;
    private int Index;

    public HeapsAlgorithm(int[] ElementsToPermutate) {
        Elements = Arrays.copyOf(ElementsToPermutate, ElementsToPermutate.length);
        Permutations = new int[Factorial(Elements.length)][Elements.length];
        Index = 0;

        RecursiveHeapsAlgorithm(Elements, Elements.length);
    }

    public int[][] GetPermutations() {
        return Permutations;
    }

    private void RecursiveHeapsAlgorithm(int[] ElementsToPermutate, int LengthOfArray) {
        if (LengthOfArray == 1) {
            Permutations[Index] = Arrays.copyOf(ElementsToPermutate, ElementsToPermutate.length);
            Index++;
        } else {
            RecursiveHeapsAlgorithm(ElementsToPermutate, LengthOfArray - 1);
            for (int i = 0; i < LengthOfArray - 1; i++) {
                Swap(LengthOfArray % 2 == 0 ? i : 0, LengthOfArray - 1, ElementsToPermutate);
                RecursiveHeapsAlgorithm(ElementsToPermutate, LengthOfArray - 1);
            }
        }
    }

    private void Swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // https://stackoverflow.com/a/7879559
    private int Factorial(int number) {
        int result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
