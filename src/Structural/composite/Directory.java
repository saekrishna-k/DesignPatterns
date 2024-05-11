package Structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    List<FileSystem> fileSystems = new ArrayList<>();

    void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        for (FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }
}
