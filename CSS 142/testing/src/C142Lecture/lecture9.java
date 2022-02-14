package C142Lecture;

public class lecture9 {
    public static void main(String[] args) {
        int[] in = { 1, 3, 5, 6 };
        addNeighbor(in);
    }

    public static int[] addNeighbor(int[] in) {
        int[] out = new int[in.length - 1];
        for (int i = 0; i < out.length; i++) {
            out[i] = in[i] + in[i + 1];
        }
        System.out.println(in);
        return in;
    }

}

/**
 * 
 */
