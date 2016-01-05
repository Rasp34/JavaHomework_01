package rast347;

/**
 * Created by Art on 05.01.2016.
 */
public class Decompositon {

    final int[] res;
    int N;

    public Decompositon(int N) {

        this.res = new int[N];
        this.N = N;
        rec(N, N, 0);

    }
    /**
    *
    * @param sum осташваяся сумма
    * @param max максимум для слагаемого
    * @param index индекс для следующего слагаемого
    *
    */
    private void rec(int sum, int max, int index) {

        if (sum == 0) {
            System.out.print(N + " = " + res[0]);
            for (int i = 1; i < index; i++) {
                System.out.print(" + " + res[i]);
            }
            System.out.println();
            return;
        }

        for (int x = Math.min(sum, max); x >= 1; x--) {
//            записываем очередное слагаемое
            res[index] = x;
//            вызываем
            rec(sum - x, x, index + 1);

        }

    }

    public static void main(String[] args) {
            Decompositon dec = new Decompositon(10);
    }
}
