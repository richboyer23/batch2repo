import classes.*;



import java.util.Random;



public class Main {

    public static void main(String[] args) {
/*
        byte byteNumber = -127; // -127 to 127
        int intNumber = 5; //Integers
        long longNumber = 232L; // Can cater more byte than integers
        float floatNumber = 1312.2322f;
        double doubleNumber = 12322.23242352345253245345d;
        char charType = '\u1233';
        boolean isBoolean = false;

        String stringType = "This is a string";

        int intArray[] = new int[5];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        String addAll = "";
        long longNum = 54;
/*
        System.out.println("Byte: " + byteNumber);
        System.out.println("Integers: " + intNumber);
        System.out.println("Long Integers: " + longNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Character: " + charType);
        System.out.println("Boolean " + isBoolean);

        //Print in array

        System.out.println("Arrays: " + intArray[0] + "\nArrays: " + intArray[1] + "\nArrays: " + intArray[2] + "\nArrays: " + intArray[3] + "\nArrays: " + intArray[4]);
        System.out.println("Arr: " + intArray[1]);


        Person person = new Person();

        person.setName("Richie");


        //person.getName();
        System.out.println("Name of person: " + person.getName());

        person.setAge(23);

        System.out.println("Age: " + person.getAge());

        Employee employee = new Employee();//instantiation of Class Employee

        employee.setName("Tabads");

        System.out.println("Employee's name: " + employee.getName());

        employee.setAge(12);

        System.out.println("Age of employee: " + employee.getAge());
1
        Costumer costumer = new Costumer();

        costumer.setName("Wayne");

        System.out.print("Costumers name: " +costumer.getName());

        costumer.setAge(45);

        System.out.print("Costumer age: " + costumer.getAge());
*/
//
//        System.out.println("Sum : " + MyMethods.whileLoop());
     /*   doWhileLoop();

        String myFriends[] = new String[4];

        myFriends[0] = "\nLambojon";
        myFriends[1] = "Richie";
        myFriends[2] = "Amille";
        myFriends[3] = "Berto";

        for(int i=0; i<myFriends.length;i++) {


            System.out.println(myFriends[i]);


        }
        array *//*
     for group selection*/
     /*   String myMego[] = {"richard", "Ricardo", "Bongz"};

        for(int x=0; x<myMego.length; x++){
            System.out.println(myMego[x]);
        }*/
/*
        Person personName = new Person();

        personName.setName("Richard");
        personName.setAge(23);

        System.out.println(personName.getName());
        System.out.println(personName.getAge());

        //
        Employee employeeName = new Employee();

        employeeName.setName("Troy");
        employeeName.setAge(33);
        employeeName.setOccupation("Businessman");

        System.out.println(employeeName.getName());
        System.out.println(employeeName.getAge());
        System.out.println(employeeName.getOccupation());

        //
        Costumer costumerName = new Costumer();

        costumerName.setName("Lloyde");
        costumerName.setAge(27);
        costumerName.setCostumerName("John");

        System.out.println(costumerName.getName());
        System.out.println(costumerName.getAge());
        System.out.println(costumerName.getCostumerName());

        */

        //Random randi = new Random();
        //int x = randi.nextInt(2);
      //  MyMethods listArray = new MyMethods();
        //System.out.print((x==1?MyMethods.getMyBoyFriends():MyMethods.getMyGirlFriends())+" "+ MyMethods.getFeelings()+" "+(x==1?MyMethods.getMyGirlFriends():MyMethods.getMyBoyFriends()));



       // System.out.println(MyMethods.getMyBoyFriends() + " " + MyMethods.getFeelings() + " " + MyMethods.getMyGirlFriends());

        //System.out.println(MyMethods.getFeelings());
        //System.out.println(MyMethods.getMyGirlFriends());


        Random switchFriends = new Random();
        int intSwitch = switchFriends.nextInt(2);
        String allFriends="";

        System.out.println(allFriends);

        if(intSwitch == 1){
            allFriends = MyMethods.getBoyFriends() + " " + MyMethods.getFeelings() + " " + MyMethods.getGirlFriends() ;
        }else{
            allFriends = MyMethods.getGirlFriends() + " " + MyMethods.getFeelings() + " " + MyMethods.getBoyFriends() ;
        }



        System.out.println(allFriends);







    }
}