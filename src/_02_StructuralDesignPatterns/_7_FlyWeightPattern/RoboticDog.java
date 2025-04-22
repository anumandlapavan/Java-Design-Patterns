package _02_StructuralDesignPatterns._7_FlyWeightPattern;

class RoboticDog implements IRobot {
    String type;
    Sprites body;

    public RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public void display(int x, int y) {
        System.out.print("RoboticDog - ");
        body.render(x, y);
    }
}
