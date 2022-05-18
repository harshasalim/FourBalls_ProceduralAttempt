import processing.core.PApplet;

public class FourBalls extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;

    private int ball1start, ball2start, ball3start, ball4start = 0;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall1() {
        ellipse(ball1start, HEIGHT/5, RADIUS, RADIUS);
        ball1start++;
    }

    private void drawBall2() {
        ellipse(ball2start, 2*HEIGHT/5, RADIUS, RADIUS);
        ball2start+=2;
    }


    private void drawBall3() {
        ellipse(ball3start, 3*HEIGHT/5, RADIUS, RADIUS);
        ball3start+=3;
    }

    private void drawBall4() {
        ellipse(ball4start, 4*HEIGHT/5, RADIUS, RADIUS);
        ball4start+=4;
    }

}
