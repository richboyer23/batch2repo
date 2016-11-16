package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B214 on 11/14/2016.
 */
public class MyMethods {
/*
    public static int whileLoop(){

        int n=1;
        int sum =0;

        while(n<=6){
            sum += n; //sum=n+sum;
            n++;
        }
        return sum;
    }

    public  static void doWhileLoop(){
        int ret = 1;
        do{
            System.out.print("[" + ret + "]");
            ret++;
        }
        while(ret<=9);

    }
*/
    public static String getBoyFriends() {

        List<String> myBoyFriends = new ArrayList<String>();

        myBoyFriends.add(0, "Richie");
        myBoyFriends.add(1, "Ricardo");
        myBoyFriends.add(2, "Cardo");
        myBoyFriends.add(3, "Bongz");

        Random randomBoyName = new Random();
        int randomBoyList = randomBoyName.nextInt(myBoyFriends.size());

        return myBoyFriends.get(randomBoyList);
    }

    public static String getGirlFriends() {
        ///
        List<String> myGirlFriends = new ArrayList<String>();

        myGirlFriends.add(0, "Enilyn");
        myGirlFriends.add(1, "Thea");
        myGirlFriends.add(2, "Shaira");
        myGirlFriends.add(3, "Lyn2x");

        Random randomGirlName = new Random();
        int randomGirlList = randomGirlName.nextInt(myGirlFriends.size());

        return myGirlFriends.get(randomGirlList);
    }

    public static String getFeelings() {
        List<String> feeling = new ArrayList<String>();

        feeling.add(0, "Love");
        feeling.add(1, "Sad");
        feeling.add(2, "Happy");
        feeling.add(3, "Complicaed");

        Random randomFeelingName = new Random();
        int randomFeelingList = randomFeelingName.nextInt(feeling.size());

        return feeling.get(randomFeelingList);
    }






    }
