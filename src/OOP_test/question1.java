package OOP_test;


/*question:"Create a Youtube class with necessary attributes: title,upload_date,duration,likes,dislikes,views,comments(ArrayList) and methods play(),forward_10_secs(),rewind_10_secs(),display(),addComments. Create video objects of this class and add necessary values."*/

import java.util.ArrayList;
class Youtube{
    String title;
    String upload_date;
    int views;
    int likes;
    int dislikes;
    String duration;

    ArrayList<String>comments=new ArrayList<>();

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpload_date() {
        return upload_date;
    }

    public void setUpload_date(String upload_date) {
        this.upload_date = upload_date;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void display(){
        System.out.println("The video title is "+this.title+" with likes: "+this.likes+" and dislikes: "+this.dislikes+"." );
        System.out.println("Its uplaod date is: "+this.upload_date+" and duration: "+this.duration);
    }
    public void forward_10_Secs(){
        System.out.println(this.title+" is forward by 10 Secs");
    }
    public void rewind_10_Secs(){
        System.out.println(this.title+" is rewinded by 10 Secs");
    }
    public void addComments(String com){
        comments.add(com);
    }
    public void play(){
        System.out.println(this.title+" is playing");
    }
}
public class question1 {
    public static void main(String[] args) {
        Youtube video = new Youtube();
        video.setTitle("How to cook vegetable rice");
        video.setViews(123965432);
        video.setLikes(123456);
        video.setDislikes(234);
        video.setUpload_date("24-4-22");
        video.setDuration("3 mins");
        video.play();
        video.display();
        video.forward_10_Secs();
        video.rewind_10_Secs();
        video.addComments("yummy recipe");
        for (int i = 0; i < video.comments.size(); i++) {
            System.out.println(video.comments.get(i));
        }
    }
}
