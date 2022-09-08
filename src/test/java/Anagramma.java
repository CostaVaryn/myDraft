public class Anagramma {
    private static int isRevers(String surce, String revers) {
        if (surce.length() != revers.length())
            return -1;

        char [] tempSourse = surce.toCharArray();
        char [] tempRevers = revers.toCharArray();
        int summ = 0;
        for (int i = 0; i < tempSourse.length; i++) {
            summ += tempSourse[i] - tempRevers[tempSourse.length - 1 - i];
        }
        return summ;
    }

    public static void main(String[] args) {
        String straight = "qwer";
        String inverse = "rewq";
        if(isRevers(straight,inverse) == 0)
            System.out.println("Инверсная пара: " + straight + " <-> " + inverse);
    }
}
