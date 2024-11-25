package singletonDesign;


public class Samosa {
    private static Samosa instance;

    // Private constructor prevents instantiation from other classes
    private Samosa() {
        System.out.println("Samosa instance created!");
    }

    // Public method to provide access to the instance
    public static Samosa getSamosa() {
        if (instance == null) {
            instance = new Samosa();
        }
        return instance;
    }
}

// public class Samosa {

//     private static Samosa samosa;

//     private Samosa(){

//     }

//     public static Samosa getSamosa(){
//         //object of this class
//         if(samosa==null){
//             synchronized(Samosa.class){  //for threading
//                 if(samosa==null){
//                     samosa = new Samosa();
//                 }
//             }
            
//         }
//         return samosa;
//     }
// }

// Constructor should be private
// Object is created with the help of method
// create field to store the object should be private, so that no one can access



//https://github.com/coding-parrot/chess-engine/tree/main/src

//chai piyo biscut khao chai piyo biscut khao