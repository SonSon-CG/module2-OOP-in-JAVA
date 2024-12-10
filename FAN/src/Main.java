

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan(Fan.FAST ,true, "yellow", 10);
        Fan fan2 = new Fan();
        fan2.speed = Fan.MEDIUM;
        System.out.println(fan2.toString());

    }

    static class Fan {
        static final int SLOW = 1;
        static final int MEDIUM = 2;
        static final int FAST = 3;
        int speed;
        boolean status;
        String color;
        int radius;

        public Fan() {
            this.speed = Fan.SLOW;
            this.status = false;
            this.color = "blue";
            this.radius = 5;
        }

        public Fan(int speed, boolean status, String color, int radius) {
            this.speed = speed;
            this.radius = radius;
            this.color = color;
            this.status = status;
        }

        @Override
        public String toString() {
            return "Fan{" +
                    "speed=" + speed +
                    ", status=" + status +
                    ", color='" + color + '\'' +
                    ", radius=" + radius +
                    '}';
        }
    }
}