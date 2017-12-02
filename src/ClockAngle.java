/**
 * @author jeavydsouza on 21/11/2017.
 */
public class ClockAngle {
    double DEGREES = 360;
    double MINUTE_DEGREES = DEGREES/60;
    double HOUR_DEGREES = DEGREES/12;
    double MINUTES_IN_HOUR = 60;

    public double run(int hour, int minute){
        ClockAngle ca = new ClockAngle();
        double angle = ca.findAngleAtTime(hour, minute);
        return angle;
    }

    private double findAngleAtTime(int hours, int minutes) {
        double minute_angle = minutes * MINUTE_DEGREES;
        double hour_angle = hours * HOUR_DEGREES + (minutes/MINUTES_IN_HOUR) * HOUR_DEGREES;
        double angle_between = Math.abs(minute_angle - hour_angle);
        if(angle_between > 180)
            angle_between = DEGREES - angle_between;
        return angle_between;
    }


}
