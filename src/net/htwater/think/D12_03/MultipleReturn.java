package net.htwater.think.D12_03;

/**
 * Created by 96955 on 2019/4/30.
 */
public class MultipleReturn {

    public static void f(int i){
        System.out.println("Initialzation the requires cleanup");
        try {
            System.out.println("Point 1");
            if (i==1){
                return;
            }
            System.out.println("Point 2");
            if (i==2){
                return;
            }
            System.out.println("Point 3");
            if (i==3){
                return;
            }
            System.out.println("Point End");
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            f(i);
        }
    }
}
