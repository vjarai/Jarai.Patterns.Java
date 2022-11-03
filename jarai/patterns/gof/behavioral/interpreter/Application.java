package jarai.patterns.gof.behavioral.interpreter;

import java.util.ArrayList;

public class Application {
    public static void Main() {
        String roman = "MCMXXVIII";
        var context = new Context(roman);

        // Build the 'parse tree'
        var tree = new ArrayList<Expression>();

        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());


        // Interpret
        for (Expression exp : tree) {
            exp.Interpret(context);
        }

        System.out.printf("%s = %s%n", roman, context.Output);


    }
}

