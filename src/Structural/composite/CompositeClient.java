package Structural.composite;

/*
 *   COMPOSITE DESIGN PATTERN:
 *   =========================
 *   This pattern helps in scenarios where we have object inside object(Tree like structure).
 *
 * */

public class CompositeClient {
    public static void main(String[] args) {
        Directory parentDirectory = new Directory();
        FileSystem fileObj1 = new File();
        parentDirectory.add(fileObj1);
        Directory childDirectory = new Directory();
        FileSystem fileObj2 = new File();
        childDirectory.add(fileObj2);
        parentDirectory.add(childDirectory);
    }
}
