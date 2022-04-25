package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();
        nakresliRovnostrannyTrojuhelnik(100.0, Color.PINK);

        zofka.setLocation(100, 100);

        nakresliCtverec(50.0, Color.GREEN);

        zofka.setLocation(500, 150);

        nakresliObdelnik(60, 90, Color.BLUE);

        zofka.setLocation(30, 460);

        nakresliKolecko(120, Color.RED);

        zofka.setLocation(700, 330);
        nakresliRovnoramennyPravouhlyTrojuhelnik(90.0, Color.ORANGE);


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
