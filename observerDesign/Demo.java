package observerDesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws NumberFormatException, IOException {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        Subscriber aman = new Subscriber("Aman");
        youtubeChannel.subscribe(aman);
        youtubeChannel.notifyChanges("Learn Design Patterns");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to add subscriber");
            System.out.println("Press 3 to exit");

            int c = Integer.parseInt(br.readLine());

            if(c==1){
                System.out.println("Enter title for new video");
                String title = br.readLine();
                youtubeChannel.notifyChanges(title);
            }else if(c==2){
                System.out.println("Enter subscriber name");
                String name1 = br.readLine();
                Subscriber subName = new Subscriber(name1);
                youtubeChannel.subscribe(subName);
            }else if(c==3){
                System.out.println("Thank you for using app");
                break;
            }else{
                System.out.println("Wrong Input Try again");
            }

        }
    
    }
}
