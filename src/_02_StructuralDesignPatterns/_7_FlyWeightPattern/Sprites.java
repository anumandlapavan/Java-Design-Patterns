package _02_StructuralDesignPatterns._7_FlyWeightPattern;

class Sprites {
    private String spriteName;

    public Sprites(String spriteName) {
        this.spriteName = spriteName;
        System.out.println("Loading sprite: " + spriteName);
    }

    public void render(int x, int y) {
        System.out.println("Rendering '" + spriteName + "' at position (" + x + ", " + y + ")");
    }
}
