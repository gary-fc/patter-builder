package com.examengrado.patternbuilder.director;

import com.examengrado.patternbuilder.builders.ComputerBuilder;
import com.examengrado.patternbuilder.components.Brand;
import com.examengrado.patternbuilder.components.Processor;

public class CatalogueDirector {
    public void constructorNormalComputer(ComputerBuilder computerBuilder){
        computerBuilder.setBrand(new Brand("HP"));
        computerBuilder.setProcessor(new Processor("i3"));
        computerBuilder.setRamGB(8);
        computerBuilder.hasGraphicsCard(false);
        computerBuilder.hasSSD(false);
    }

    public void constructorProComputer(ComputerBuilder computerBuilder){
        computerBuilder.setBrand(new Brand("Lenovo"));
        computerBuilder.setProcessor(new Processor("i7"));
        computerBuilder.setRamGB(16);
        computerBuilder.hasGraphicsCard(true);
        computerBuilder.hasSSD(true);
    }

    public void constructorGamerComputer(ComputerBuilder computerBuilder){
        computerBuilder.setBrand(new Brand("Asus"));
        computerBuilder.setProcessor(new Processor("i9"));
        computerBuilder.setRamGB(32);
        computerBuilder.hasGraphicsCard(true);
        computerBuilder.hasSSD(true);
    }
}
