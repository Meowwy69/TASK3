package lt.vcd;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner in=new Scanner(System.in);

                System.out.print("x1: ");
                int x1=in.nextInt();

                System.out.print("y1: ");
                int y1=in.nextInt();

                System.out.print("x2: ");
                int x2=in.nextInt();

                System.out.print("y2: ");
                int y2=in.nextInt();

                int length=Math.abs(x2 - x1);
                int width=Math.abs(y1 - y2);

                int s=length*width;
                int p= 2*(length+width);

                System.out.println("s=" +s);
                System.out.println("p=" +p);

                in.close();









    }
}
