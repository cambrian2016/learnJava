package net.htwater.think.P.P146;

/**
 * Created by 96955 on 2019/1/5.
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k=" + k);
        System.out.println("j=" + j);
    }

    private static int x2 = printInit("static Insect.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle beetle = new Beetle();
    }


}

class Insect {
    private int i =printInit("static Insect.x1 initialized22");
    protected int j;

    Insect() {
        System.out.println("i=" + i + ", j=" + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int  printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
