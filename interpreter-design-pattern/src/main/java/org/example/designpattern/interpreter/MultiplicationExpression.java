package org.example.designpattern.interpreter;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class MultiplicationExpression extends BaseExpression {

    public MultiplicationExpression(String formul) {
        int[] ops = parse(formul);
        this.a = ops[0];
        this.b = ops[1];
        this.formul = formul;
    }
    private int[] parse(String formul) {
        String[] ops = formul
                .split(OperationIdentifier.MULTIPLICATION);
        return new int[] { Integer.parseInt(ops[0].trim()),
                Integer.parseInt(ops[1].trim()) };
    }
    @Override
    public void calculate() {
        System.out.println(
                this.formul + " = " + (this.a * this.b));
    }

}
