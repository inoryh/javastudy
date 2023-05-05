package TEST1_1;

/**
 * @author xhy
 */
public class Test {
    public static void main(String[] args) {
        //获取购买的注数
        lot.buy();
        //输出数组
        lot.outArr();

    }
    static lottery lot = new lottery() {
        @Override
        void getArr(int totalNum) {
            super.getArr(totalNum);
        }

        @Override
        int contains(int[] arr, int a) {
            return super.contains(arr, a);
        }

        @Override
        void getNoteNum(int n) {
            super.getNoteNum(n);
        }

        @Override
        void buy() {
            super.buy();
        }

        @Override
        void outArr() {
            super.outArr();
        }
    };
}
