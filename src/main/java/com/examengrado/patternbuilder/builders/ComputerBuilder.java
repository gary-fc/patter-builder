package com.examengrado.patternbuilder.builders;

import com.examengrado.patternbuilder.components.Brand;
import com.examengrado.patternbuilder.components.Processor;

public interface ComputerBuilder {
    void setBrand(Brand brand);
    void setProcessor(Processor processor);
    void setRamGB(int ramGB);
    void hasGraphicsCard(boolean hasGraphics);
    void hasSSD(boolean hasSSD);

}
