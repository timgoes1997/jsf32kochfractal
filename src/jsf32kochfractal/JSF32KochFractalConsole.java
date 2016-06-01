/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf32kochfractal;

import calculate.Edge;
import calculate.KochManager;
import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 *
 * @author Tim
 */
public class JSF32KochFractalConsole {

    private KochManager km;

    public JSF32KochFractalConsole() {
        km = new KochManager();
        menu();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSF32KochFractalConsole application = new JSF32KochFractalConsole();
    }

    private void menu() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Voer het level in waarvan je de edges wilt genereren (1-12) of 0 om de applicatie te verlaten");
        try {
            int input = 13;
            if (reader.hasNextInt()) {
                input = reader.nextInt();
            }

            switch (input) {
                case 0:
                    System.out.println("Exiting application");
                    break;
                case 1:
                    System.out.println("Generating level1");
                    km.changeLevel(input);
                    menu();
                    break;
                case 2:
                    System.out.println("Generating level2");
                    km.changeLevel(input);
                    menu();
                    break;
                case 3:
                    System.out.println("Generating level3");
                    menu();
                    km.changeLevel(input);
                    break;
                case 4:
                    System.out.println("Generating level4");
                    km.changeLevel(input);
                    menu();
                    break;
                case 5:
                    System.out.println("Generating level5");
                    km.changeLevel(input);
                    menu();
                    break;
                case 6:
                    System.out.println("Generating level6");
                    km.changeLevel(input);
                    menu();
                    break;
                case 7:
                    System.out.println("Generating level7");
                    km.changeLevel(input);
                    menu();
                    break;
                case 8:
                    System.out.println("Generating level8");
                    km.changeLevel(input);
                    menu();
                    break;
                case 9:
                    System.out.println("Generating level9");
                    km.changeLevel(input);
                    menu();
                    break;
                case 10:
                    System.out.println("Generating level10");
                    km.changeLevel(input);
                    menu();
                    break;
                case 11:
                    System.out.println("Generating level11");
                    km.changeLevel(input);
                    menu();
                    break;
                case 12:
                    System.out.println("Generating level12");
                    km.changeLevel(input);
                    menu();
                    break;
                case 13:
                    km.writeEdge(new Edge(1.0d, 1.0d, 0.5d, 0.5d, Color.BLUE.toString()));
                    menu();
                case 14:
                    km.readEdges();
                    menu();
                default:
                    System.out.println("U heeft een ongeldig getal ingevult");
                    menu();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            menu();
        }
    }
}
