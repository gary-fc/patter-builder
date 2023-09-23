package com.examengrado.patternbuilder.builders;

import com.examengrado.patternbuilder.components.Brand;
import com.examengrado.patternbuilder.components.Processor;
import com.examengrado.patternbuilder.computers.Computer;

public class ComputerBuilderImpl implements ComputerBuilder {
    private Brand brand;
    private Processor processor;
    private int ramGB;
    private boolean hasGraphics;
    private boolean hasSSD;

    @Override
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    @Override
    public void hasGraphicsCard(boolean hasGraphics) {
        this.hasGraphics = hasGraphics;
    }

    @Override
    public void hasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    public Computer getResult() {
        return new Computer(brand, processor, ramGB, hasGraphics, hasSSD);
    }
}
