package kadai_015;

public class Car_Chapter15 {
    private int gear = 1;
    private int speed = 10;

    public void gearChange(int afterGear) {
        int previousGear = this.gear;

        if(afterGear > 0 && afterGear < 6) {
            this.gear = afterGear;
        } else {
            this.gear = 1;
        }

        this.speed = this.gear * 10;

        if(previousGear == this.gear) {
            System.out.println("ギアは" + previousGear + "のままです");
        } else {
            System.out.println("ギア" + previousGear + "からギア" + this.gear + "に切り替えました");

        }
    }

    public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}
