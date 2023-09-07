package secondtask;

public class Main {

    public static void main(String[] args) {

        Member[] members = {new Human(1.5, 500.0, "Max"),
                new Cat(2.0, 500.0, "Kitty"),
                new Robot(0.6, 500.0, "Bumblebee")};

        Obstacle[] obstacles = {new RunTrack(100.0), new RunTrack(500.0), new Wall(1.5),  new Wall(2.0) };

        for (Member member: members) {
            for (Obstacle obstacle: obstacles) {
                if (!obstacle.overcome(member))
                    break;
            }
        }
    }
}
