class Demo {
    int a = 20 ;
    String b  = "ibrahim";

    void show(){
        System.out.println(b + " " + a );
    }
}

class Test {

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
    
}


// class Cars {

//         String carName;
//         int carSpeed;
//         int carPrice;
//         String carColor;
//         String carType;

//         Cars( String carName ,int carSpeed,int carPrice,String carColor,String carType){
//             this.carName = carName;
//             this.carSpeed = carSpeed;
//             this.carPrice = carPrice;
//             this.carColor = carColor;
//             this.carType = carType;

//         }

//         void show(){
//             System.out.println(carName + " " + carSpeed + " " + carPrice + " " + carColor + " " + carType );
//         } 
// }

// class config {

//         Car myCar = new Cars()
// }