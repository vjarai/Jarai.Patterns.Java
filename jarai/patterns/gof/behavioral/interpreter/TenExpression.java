package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Ten checks for X, XL, L and XC
/// </remarks>
/// </summary>
public class TenExpression extends Expression {
    public String One() {
        return "X";
    }

    public String Four() {
        return "XL";
    }

    public String Five() {
        return "L";
    }

    public String Nine() {
        return "XC";
    }

    public int Multiplier() {
        return 10;
    }
}
