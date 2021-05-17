package nabeatsu;

public class Nabeatsu {

    public static void main(String[] args) {

        String ju = "ｼﾞｭｳ";

        int num = 500;
        int digit = stringSize(num);

        for (int i = 0; i < num; i++) {
            int numPlus = i + 1;

            if (numPlus % 3 == 0 || String.valueOf(numPlus).contains("3")) {
                aho(numPlus, digit);
            } else {
                System.out.println(numPlus);
            }
        }

    }

    public static void aho(int num, int digit) {

        String[] ahos = { "ｾﾞﾛｫ", "ｲｨﾁ", "ﾆｨ", "ｻｧﾝ", "ﾖｫﾝ", "ｺﾞｫ", "ﾛｸｩ", "ﾅﾅｧ", "ﾊﾁｨ", "ｷｭｩｳ" };

        String numText = String.valueOf(num);
        // System.out.println(numText);

        char[] moji = new char[numText.length()];

        // 数字をナベアツに変える式
        for (int i = 0; i < numText.length(); i++) {
            moji[i] = numText.charAt(i);
            int mojiNum = Character.getNumericValue(moji[i]);
            // 数の部分
            if ((digit - i > 1) && mojiNum == 1) {
            } else {
                System.out.print(ahos[mojiNum]);
            }
            // ケタの部分
            if (num >= 1000 && (numText.length() - i == 4)) {
                System.out.print("ｾﾞﾝ");
            }

            if (num >= 100 && (numText.length() - i == 3)) {
                System.out.print("ﾋﾞｬｧｸ");
            }

            if (num >= 10 && (numText.length() - i == 2)) {
                System.out.print("ｼﾞｭｩ");
            }

            // System.out.println(ahos[moji[i]]);
        }
        System.out.println("！！！！！");
    }

// Requires positive x
    static int stringSize(int num) {

        int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE };

        for (int i = 0;; i++)
            if (num <= sizeTable[i])
                return i + 1;
    }

}
