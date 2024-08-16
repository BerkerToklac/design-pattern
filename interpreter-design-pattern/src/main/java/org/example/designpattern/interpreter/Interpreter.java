package org.example.designpattern.interpreter;


/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Interpreter {

    public void interpret(String formul) {
        Expression expression = parse(formul);
    }

    private Expression parse(String formul) {
        if (formul.contains(
                OperationIdentifier.MULTIPLICATION)) {
            return (Expression) new MultiplicationExpression(formul);
        }
        return null;
    }

}
