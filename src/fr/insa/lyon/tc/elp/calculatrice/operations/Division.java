package fr.insa.lyon.tc.elp.calculatrice.operations;

import fr.insa.lyon.tc.elp.calculatrice.Operation;

public class Division extends Operation {

    @Override
    public float compute(float left, float right) {
        return left/right;
    }
}
