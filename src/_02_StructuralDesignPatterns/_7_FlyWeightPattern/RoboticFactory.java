package _02_StructuralDesignPatterns._7_FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

class RoboticFactory {
    static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    static IRobot createRobot(String robotType) {
        if (roboticObjectCache.containsKey(robotType)) {
            return roboticObjectCache.get(robotType);
        }

        if (robotType.equals("HUMANOID")) {
            Sprites humanoidSprite = new Sprites("humanoid.png");
            IRobot humanRobotObj = new HumanoidRobot(robotType, humanoidSprite);
            roboticObjectCache.put(robotType, humanRobotObj);
            return humanRobotObj;
        } else if (robotType.equals("ROBOTICDOG")) {
            Sprites roboticDogSprite = new Sprites("robotic_dog.png");
            IRobot roboticDogObj = new RoboticDog(robotType, roboticDogSprite);
            roboticObjectCache.put(robotType, roboticDogObj);
            return roboticDogObj;
        }

        return null;
    }
}