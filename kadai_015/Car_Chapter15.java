package kadai_015;

public class Car_Chapter15 {

    private int gear = 1;
    private int speed = 10;

    public void gearChange(int afterGear) {
    	int beforeGear = this.gear; // 切り替え前のギアを保持
        this.gear = afterGear;

        // ギアに応じた速度を設定
        switch (afterGear) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10; // ギアが1〜5以外の場合は10km
        }

        System.out.println("ギアを" + beforeGear + "から" + this.gear + "に切り替えました");
    }

    public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}
