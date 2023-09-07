package secondtask;

public class Cat implements Member{

    private double maxJump;
    private double maxDistance;
    private final String name;

    public Cat(double maxJump, double maxDistance, String name) {
        this.maxJump = maxJump;
        this.maxDistance = maxDistance;
        this.name = name;
    }

    public double getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(double maxJump) {
        this.maxJump = maxJump;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
        //return (length <= maxDistance) ? true : false;
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping");
        //return (height <= maxDistance) ? true : false;
    }
}
