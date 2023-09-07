package secondtask;

public class RunTrack implements Obstacle {

    private double length;
    private final String name = "БІГОВА ДОРІЖКА";

    public RunTrack(double length) {
        this.length = length;
    }


    @Override
    public boolean overcome(Member member) {
        member.run();
        double maxDistance = member.getMaxDistance();
        boolean result = (length <= maxDistance) ? true : false;
        if (result)
            System.out.println("Участник " + member.getName() + " пройшов перешкоду " + name + " на дистанції " + length);
        else {
            System.out.println("Участник " + member.getName() + " не пройшов перешкоду " + name + " на дистанції " + length + ". Пройдено " + maxDistance);
            result = false;
        }
        return result;
    }
}
