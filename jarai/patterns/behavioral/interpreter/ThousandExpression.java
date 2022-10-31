package jarai.patterns.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Thousand checks for the Roman Numeral M
/// </remarks>
/// </summary>
public class ThousandExpression extends Expression {
    public String One() {
        return "M";
    }

    public String Four() {
        return " ";
    }

    public String Five() {
        return " ";
    }

    public String Nine() {
        return " ";
    }

    public int Multiplier() {
        return 1000;
    }
}
