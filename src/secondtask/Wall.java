package secondtask;

public class Wall implements Obstacle {

    private final double height;
    private final String name = "СТІНА";

    public Wall(double height) {
        this.height = height;
    }


    @Override
    public boolean overcome(Member member) {
        member.jump();
        double maxJump = member.getMaxJump();
        boolean result = (height <= maxJump) ? true : false;
        if (result)
            System.out.println("Участник " + member.getName() + " пройшов перешкоду " + name + " на дистанції " + height);
        else {
            System.out.println("Участник " + member.getName() + " не пройшов перешкоду " + name + " на дистанції " + height + ". Пройдено " + maxJump);
            result = false;
        }
        return result;
    }
}
