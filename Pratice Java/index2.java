class myCar{
     String color;
     int year;
     int wheels;
     int engine;

     //method
     void car(int year , int wheels , int engine){
        System.out.println(year + wheels + engine);
     }

     void car(){
      //  
     }
}


class index {
  public static void main(String[] args) {
    myCar car = new myCar();
    car.car(2010 , 4 , 1);

    myCar car2 = new myCar();
    car2.car(2015 , 4 , 2);
  }
    
}