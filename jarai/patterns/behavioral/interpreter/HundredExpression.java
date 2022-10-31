package jarai.patterns.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Hundred checks C, CD, D or CM
/// </remarks>
/// </summary>
public class HundredExpression extends Expression {
    public String One() {
        return "C";
    }

    public String Four() {
        return "CD";
    }

    public String Five() {
        return "D";
    }

    public String Nine() {
        return "CM";
    }

    public int Multiplier() {
        return 100;
    }
}
