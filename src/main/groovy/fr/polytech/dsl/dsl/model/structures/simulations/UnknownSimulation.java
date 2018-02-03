package fr.polytech.dsl.dsl.model.structures.simulations;

import fr.polytech.dsl.dsl.model.ModelVisitor;
import fr.polytech.dsl.dsl.model.structures.laws.UnknownLaw;

public class UnknownSimulation extends Simulation<UnknownLaw> {

    public UnknownSimulation(UnknownLaw associatedLaw) {
        super(associatedLaw);
    }

    @Override
    public void accept(ModelVisitor visitor) {
        visitor.visit(this);
    }
}
