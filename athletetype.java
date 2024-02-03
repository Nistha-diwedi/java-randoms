abstract class Athlete {
    abstract void run();
    abstract void doTraining();
}
class SoccerPlayer extends Athlete {
    void run() {
        System.out.println("Soccer player running on the field.");
    }
    void doTraining() {
        System.out.println("Soccer player doing specific training drills.");
    }
}
class Runner extends Athlete {
    void run() {
        System.out.println("Runner running on the track.");
    }
    void doTraining() {
        System.out.println("Runner doing general running training.");
    }
}
class TennisPlayer extends Athlete {
    void run() {
        System.out.println("Tennis player running on the court.");
    }
    void doTraining() {
        System.out.println("Tennis player practicing tennis skills.");
    }
}
public class athletetype {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        Runner runner = new Runner();
        TennisPlayer tennisPlayer = new TennisPlayer();

        soccerPlayer.run();
        soccerPlayer.doTraining();
        runner.run();
        runner.doTraining();
        tennisPlayer.run();
        tennisPlayer.doTraining();
    }
}
