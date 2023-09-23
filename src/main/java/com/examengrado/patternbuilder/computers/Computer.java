package com.examengrado.patternbuilder.computers;

import com.examengrado.patternbuilder.components.Brand;
import com.examengrado.patternbuilder.components.Processor;

public class Computer {
    private Brand brand;
    private Processor processor;
    private int ramGB;
    private boolean hasGraphics;
    private boolean hasSSD;

    public Computer(Brand brand, Processor processor, int ramGB, boolean hasGraphics, boolean hasSSD) {
        this.brand = brand;
        this.processor = processor;
        this.ramGB = ramGB;
        this.hasGraphics = hasGraphics;
        this.hasSSD = hasSSD;
    }

    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public int getRamGB() {
        return ramGB;
    }

    public boolean isHasGraphics() {
        return hasGraphics;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }
}
