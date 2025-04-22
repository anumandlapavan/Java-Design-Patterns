package _02_StructuralDesignPatterns._7_FlyWeightPattern;

class HumanoidRobot implements IRobot {
    String type;
    Sprites body;

    public HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public void display(int x, int y) {
        System.out.print("HumanoidRobot - ");
        body.render(x, y);
    }
}