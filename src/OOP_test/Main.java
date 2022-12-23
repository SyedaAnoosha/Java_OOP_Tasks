package OOP_test;/*

 question:"Create a Cricketer class with attributes: name, BMI, matches_won, matches_played, centuris, half_centuries, highest_score, ranking. Create a method win_percentage(). Create a cricketer objects and set necessary values and call win_percentage()."
*/



class Cricket{
    String Cname;
    double BMI;
    int ranking;
    int highest_score;
    int matches_played;
    int centuries;
    int half_centuries;
    int matches_won;

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getHighest_score() {
        return highest_score;
    }

    public void setHighest_score(int highest_score) {
        this.highest_score = highest_score;
    }

    public int getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(int matches_played) {
        this.matches_played = matches_played;
    }

    public int getCenturies() {
        return centuries;
    }

    public void setCenturies(int centuries) {
        this.centuries = centuries;
    }

    public int getHalf_centuries() {
        return half_centuries;
    }

    public void setHalf_centuries(int half_centuries) {
        this.half_centuries = half_centuries;
    }

    public int getMatches_won() {
        return matches_won;
    }

    public void setMatches_won(int matches_won) {
        this.matches_won = matches_won;
    }

    public float win_percentage(){
        float win=((float)matches_won / (float)matches_played)*100;
        return win;
    }
}
public class Main {
    public static void main(String[] args) {
        Cricket crickter1=new Cricket();
        crickter1.setCname("Ali");
        crickter1.setMatches_played(100);
        crickter1.setMatches_won(50);
        System.out.println(crickter1.getCname()+" won "+crickter1.getMatches_won()+" out of "+crickter1.getMatches_played()+" matches. His win percentage is: "+crickter1.win_percentage());

        Cricket crickter2=new Cricket();
        crickter2.setCname("Fahad");
        crickter2.setMatches_played(200);
        crickter2.setMatches_won(50);
        System.out.println(crickter2.getCname()+" won "+crickter2.getMatches_won()+" out of "+crickter2.getMatches_played()+" matches. His win percentage is: "+crickter2.win_percentage());

        Cricket crickter3=new Cricket();
        crickter3.setCname("Alina");
        crickter3.setMatches_played(500);
        crickter3.setMatches_won(100);
        System.out.println(crickter3.getCname()+" won "+crickter3.getMatches_won()+" out of "+crickter3.getMatches_played()+" matches. Her win percentage is: "+crickter3.win_percentage());

    }
}





























