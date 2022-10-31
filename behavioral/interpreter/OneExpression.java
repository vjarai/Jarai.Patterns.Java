package behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// One checks for I, II, III, IV, V, VI, VI, VII, VIII, IX
/// </remarks>
/// </summary>
public class OneExpression extends Expression {
    public String One() {
        return "I";
    }

    public String Four() {
        return "IV";
    }

    public String Five() {
        return "V";
    }

    public String Nine() {
        return "IX";
    }

    public int Multiplier() {
        return 1;
    }
}
