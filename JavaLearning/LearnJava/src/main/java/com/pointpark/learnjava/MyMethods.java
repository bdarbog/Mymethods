package com.pointpark.learnjava;

public class MyMethods {
    public static void main(String[] args) {
    String TvShow = "Blue Bloods";

    //Starting point
        GetMapData();

        GetTvShows(TvShow, 9);

        int mynewvalue = getArea( 79,45);

        System.out.println(mynewvalue);
        getArea(79, 45);

    }

        //Create a Method Name
        public static void GetMapData(){
          System.out.println("whats up");
        }

        public static void GetTvShows(String TvShow, int yearsOn){
          System.out.println(TvShow + " Years on TV is " + yearsOn);
    }
    public static int getArea(int length, int width){

        int MyReturnValue = length + width;
        return MyReturnValue;  //ReturnValue
    }
}
