package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();

        /* Cast 1.2.
        nakresliRovnostrannyTrojuhelnik(100.0, Color.PINK);
        zofka.setLocation(100, 100);
        nakresliCtverec(50.0, Color.GREEN);
        zofka.setLocation(500, 150);
        nakresliObdelnik(60, 90, Color.BLUE);
        zofka.setLocation(30, 460);
        nakresliKolecko(120, Color.RED);
        zofka.setLocation(700, 330);
        nakresliRovnoramennyPravouhlyTrojuhelnik(90.0, Color.ORANGE);
         */

        nakresliMasinku();

        nakresliSnehulaka();

        nakresliZmrzlinu();
    }

    private void nakresliMasinku() {
        zofka.setLocation(700, 400);
        nakresliObdelnik(150, 100, Color.RED);
        zofka.setLocation(600, 320);
        zofka.turnLeft(180);
        nakresliObdelnik(160, 80, Color.RED);
        zofka.setLocation(440, 370);
        zofka.turnLeft(180);
        nakresliRovnoramennyPravouhlyTrojuhelnik(50, Color.GRAY);
        zofka.setLocation(510, 440);
        nakresliKolecko(25, Color.GRAY);
        zofka.setLocation(590, 440);
        nakresliKolecko(25, Color.GRAY);
        zofka.setLocation(690, 440);
        nakresliKolecko(50, Color.GRAY);
    }

    private void nakresliSnehulaka() {
        zofka.setLocation(160, 120);
        nakresliKolecko(40, Color.CYAN);
        zofka.setLocation(180, 220);
        nakresliKolecko(60, Color.CYAN);
        zofka.setLocation(200, 120);
        nakresliKolecko(20, Color.CYAN);
        zofka.setLocation(80, 120);
        nakresliKolecko(20, Color.CYAN);
        zofka.setLocation(150, 55);
        nakresliKolecko(30, Color.CYAN);
    }

    private void nakresliZmrzlinu() {
        zofka.setLocation(1040, 100);
        nakresliKolecko(75, Color.PINK);
        zofka.setLocation(1050, 90);
        zofka.turnLeft(135);
        nakresliRovnostrannyTrojuhelnik(150, Color.ORANGE);
    }

    private void nakresliRovnoramennyPravouhlyTrojuhelnik(double velikostStrany, Color barvaCary) {
        double velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(135);
        zofka.move(velikostPrepony);
    }

    private void nakresliKolecko(double polomer, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        double d = (2*3.14*polomer)/20;
        for (int i = 0; i < 20 ; i++) {
            zofka.turnLeft(18);
            zofka.move(d);
        }
    }

    private void nakresliObdelnik(double velikostStranyA, double velikostStranyB, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStranyA);
        zofka.turnLeft(90);
        zofka.move(velikostStranyB);
        zofka.turnLeft(90);
        zofka.move(velikostStranyA);
        zofka.turnLeft(90);
        zofka.move(velikostStranyB);
    }

    private void nakresliCtverec(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 1; i <= 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(90);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
    }
}
