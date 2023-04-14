package _22_advanced_topic;

public class Enum {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myLevel = Level.HIGH;

        switch (myLevel) {
            case LOW -> System.out.println("Low level");
            case HIGH -> System.out.println("High level");
            case MEDIUM -> System.out.println("Medium level");
        }
        for (Level myLevelChild:Level.values()) {
            System.out.println(myLevelChild);
        }

    }
}
