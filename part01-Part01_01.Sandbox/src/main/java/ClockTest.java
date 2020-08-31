
public class ClockTest {

    static void clockExample1() {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while (true) {
            // 1. printing the time
            if (hours < 10) {
                System.out.print("0");
            }
            System.out.print(hours);

            System.out.print(":");

            if (minutes < 10) {
                System.out.print("0");
            }
            System.out.print(minutes);

            System.out.print(":");

            if (seconds < 10) {
                System.out.print("0");
            }
            System.out.print(seconds);
            System.out.println();

            // 2. The second hand's progress
            seconds = seconds + 1;

            // 3. The other hand's progress when necessary.
            if (seconds > 59) {
                minutes = minutes + 1;
                seconds = 0;

                if (minutes > 59) {
                    hours = hours + 1;
                    minutes = 0;

                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
        }
    }

    static void clockExample2() {
        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);

        while (true) {
            // Printing the time
            System.out.println(hours + ":" + minutes + ":" + seconds);

            // Advancing the second hand
            seconds.advance();

            // 3. advancing the other hands when required
            if (seconds.value() == 0) {
                minutes.advance();

                if (minutes.value() == 0) {
                    hours.advance();
                }
            }
        }
    }

    static void clockExample3() {
        Clock clock = new Clock();

        while (true) {
            System.out.println(clock);
            clock.advance();
        }
    }

    public static void main(String[] args) {
        //clockExample1();
        //clockExample2();
        clockExample3();
    }
}
