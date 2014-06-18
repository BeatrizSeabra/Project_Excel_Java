/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.core.formula.lang;

import csheets.core.IllegalValueTypeException;
import csheets.core.Value;
import csheets.core.formula.BinaryOperator;
import csheets.core.formula.Expression;
import csheets.core.formula.TemporaryVariable;

/**
 * Operador de atribuicao
 *
 * @author Frederico Calor
 */
public class Attribution implements BinaryOperator {

    /**
     * Creates a new Atributtion.
     */
    public Attribution() {
    }

    public Value applyTo(Expression leftOperand, Expression rightOperand) throws IllegalValueTypeException {
        /*O valorDireita do tipo value vai retornar o valor da direita rightOperand*/
        Value valorDireita = rightOperand.evaluate();
        /* o operador da esquerda e uma instancia da cell*/
        if (leftOperand instanceof CellReference) {
            switch (valorDireita.getType()) {
                case NUMERIC:
                    return new Value(valorDireita.toDouble());
                case BOOLEAN:
                    return new Value(valorDireita.toBoolean());
                case DATE:
                    return new Value(valorDireita.toDate());
                case TEXT:
                    return new Value(valorDireita.toText());
                default:
                    throw new IllegalValueTypeException(valorDireita, Value.Type.NUMERIC);
            }
        } else if(leftOperand instanceof TemporaryVariable){
            switch (valorDireita.getType()) {
                case NUMERIC:
                    return new Value(valorDireita.toDouble());
                case BOOLEAN:
                    return new Value(valorDireita.toBoolean());
                case DATE:
                    return new Value(valorDireita.toDate());
                case TEXT:
                    return new Value(valorDireita.toText());
                default:
                    throw new IllegalValueTypeException(valorDireita, Value.Type.NUMERIC);
            }

        }
        throw new IllegalValueTypeException(valorDireita, Value.Type.NUMERIC);
    }

    public String getIdentifier() {
        return ":=";
    }

    public Value.Type getOperandValueType() {
        return Value.Type.NUMERIC;
    }

    public String toString() {
        return getIdentifier();
    }
}
