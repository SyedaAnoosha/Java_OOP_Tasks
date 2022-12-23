package practice_tasks;

interface Player{
    final int id= 10;
    int play();
    void next();
    void previous();
    void pause();
}
class Winamp implements Player{

    @Override
    public int play() {
        return id;
    }

    @Override
    public void next() {
        System.out.println("Next video");
    }

    @Override
    public void previous() {
        System.out.println("Previous video");
    }

    @Override
    public void pause() {
        System.out.println("Video paused");
    }
}
public class DemoClassWinamp {
    public static void main(String[] args) {
        Winamp W1= new Winamp();
        W1.next();
        W1.pause();
        W1.play();
        W1.previous();

    }
}
