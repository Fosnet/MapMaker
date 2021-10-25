package com.company;
import java.io.IOException;

public class Main {
    public static void main ( String[] args ) throws IOException {
        Map map = new Map();
        map.setNumberOfHouses(5);
        map.setNumberOfTrees(10);

        map.setHouseSize(300);
        map.setTreeSize(100);
        map.setFilename("map.png");

        map.generateMap();
    }
}
