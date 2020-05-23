package main.generics.wildcard;

import java.util.Arrays;

public class PrintCoords {

    public static void printXY(Coords<?> c) {
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    public static void printXYZ(Coords<? extends ThreeD> c) {
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    public static void printXYZT(Coords<? extends FourD> c) {
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Coords<TwoD> twoDCoords = new Coords<>(new TwoD[]{new TwoD(1, 2), new TwoD(3, 4)});
        Coords<ThreeD> threeDCoords = new Coords<>(new ThreeD[]{new ThreeD(1, 2, 3), new ThreeD( 4,5,6)});
        Coords<FourD> fourDCoords = new Coords<>(new FourD[]{new FourD(1, 2, 3,4), new FourD( 5,6,7,8)});

        printXY(twoDCoords);
        printXY(threeDCoords);
        printXY(fourDCoords);


        printXYZ(threeDCoords);
        printXYZ(fourDCoords);

        printXYZT(fourDCoords);

    }
}
