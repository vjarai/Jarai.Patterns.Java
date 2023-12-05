package jarai.patterns.gof.behavioral.templateMethod;

import javax.swing.*;
import java.util.Random;

class ZahlenratenGame extends Game {
    private int _geheimzahl;
    private int _input;

    protected boolean IsFinished() {
        return _input == _geheimzahl;
    }

    protected void EndGame() {
        System.out.println("Spiel beendet");
    }

    protected void ShowOutput() {
        if (_input < _geheimzahl)
            System.out.println("zu klein");
        else if (_input > _geheimzahl)
            System.out.println("Zu Gross");
    }

    protected void GetInput() {
        System.out.println(("tipp eingeben"));
        _input = Integer.parseInt(JOptionPane.showInputDialog("Ihr Tipp?"));
    }

    protected void InitGame() {
        _geheimzahl = new Random().nextInt(100);
    }
}

