package experiment3_2;

public class Client {
    public static void main(String[] args) {
        Component building1 = new Building("building1");
        Component cube1 = new Cube("cube1");
        Component cylinder1 = new Cylinder("cylinder1");
        Component pyramid1 = new Pyramid("pyramid1");

        building1.add(cube1);
        building1.add(cylinder1);
        building1.add(pyramid1);

        building1.color();
    }
}