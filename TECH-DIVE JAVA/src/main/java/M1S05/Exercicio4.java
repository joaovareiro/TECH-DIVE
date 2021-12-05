package M1S05;

public class Exercicio4 {
    public static void main(String[] args) {
        new FinalAttributes(1);
    }
}

class FinalAttributes {
    private final int FINAL_ATTRIBUTE1;
    private final static int FINAL_ATTRIBUTE2;

    static {
        FINAL_ATTRIBUTE2 = 0;
    }

    FinalAttributes(int fa1) {
        FINAL_ATTRIBUTE1 = fa1;
    }
}

