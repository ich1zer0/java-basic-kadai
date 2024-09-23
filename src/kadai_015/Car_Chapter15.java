package kadai_015;

public class Car_Chapter15 {
    private int gear = 1;
    private int speed = 10;

    public void gearChange(int afterGear) {
        if(afterGear > 0 && afterGear < 6) {
            this.gear = afterGear;
            this.speed = this.gear * 10;

            return;
        }

        this.gear = 1;
        this.speed = 10;
    }

    public void run() {
        System.out.println("時速" + this.speed + "km");
    }
}
