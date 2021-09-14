package com.epam.izh.rd.airport.planes;

import com.epam.izh.rd.airport.models.ClassificationLevel;
import com.epam.izh.rd.airport.models.ExperimentalType;

public class ExperimentalPlane extends Plane{

    private ExperimentalType type;
    private final ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalType type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + super.getModel() + '\'' +
                '}';
    }
}
