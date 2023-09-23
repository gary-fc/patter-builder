package com.examengrado.patternbuilder;

import com.examengrado.patternbuilder.builders.ComputerBuilderImpl;
import com.examengrado.patternbuilder.computers.Computer;
import com.examengrado.patternbuilder.director.CatalogueDirector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

    public static void main(String[] args) {
        CatalogueDirector catalogueDirector = new CatalogueDirector();

        ComputerBuilderImpl computerBuilder = new ComputerBuilderImpl();
        catalogueDirector.constructorNormalComputer(computerBuilder);

        Computer computer = computerBuilder.getResult();
        System.out.println(computer.getBrand().getName());
    }

}
