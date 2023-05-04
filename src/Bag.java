import java.util.ArrayList;
import java.util.List;

public class Bag {
    List<Ball> bag = new ArrayList<>(12);
    int redBallCount = 0;
    int greenBallCount = 0;
    int yellowBallCount = 0;

    void addToBag(Ball ball) {

        int totalCount = redBallCount + greenBallCount + yellowBallCount;
        double yellowBallCapacity = 0.4 * totalCount;

        if (totalCount != 12) {

            if (ball.colour.equals("red")) {

                bag.add(ball);
                redBallCount++;
                System.out.println("red ball added");
            } else if (ball.colour.equals("green")) {

                if (greenBallCount < redBallCount) {
                    bag.add(ball);
                    greenBallCount++;
                    System.out.println("green ball added");
                } else {
                    System.out.println("Green colour ball can not be more than red colour ball");
                }

            } else if (ball.colour.equals("yellow")) {

                if (yellowBallCount < yellowBallCapacity) {
                    bag.add(ball);
                    yellowBallCount++;
                    System.out.println("yellow ball added");
                } else {
                    System.out.println("yellow colour ball can not be more than 40% than others");
                }

            }

        } else {
            System.out.println("Bag is full ..");
        }

    }
}
