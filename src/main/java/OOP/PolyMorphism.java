package OOP;

public class PolyMorphism {

    //Method Overloading
    //Method Overriding
    //Super
    //final

    public static void main(String[] args){
        Bank rate;
        rate = new SBI();
        float sbirate = rate.getInterestRate();
        System.out.println("SBI Intrest Rate    :"+sbirate);

        rate = new ICICI();
        float icicirate = rate.getInterestRate();
        System.out.println("ICICI Intrest Rate  :"+icicirate);

        rate = new AXIS();
        float axisrate = rate.getInterestRate();
        System.out.println("AXIS Intrest Rate   :"+axisrate);


        //Method Overloading
        System.out.println(Adder.add(1,2));
        System.out.println(Adder.add(1,2,3));

        //Method Overriding
        Bank loanrate = new SBI();
        float sbiloanrate = loanrate.getLoanInterestRate();
        System.out.println("Loan interest rate at SBI :"+sbiloanrate+"%");

        //super
        Dog d=new Dog();
        d.printColor();


    }

    static class Bank{
        private float loanInterestRate;
        float getInterestRate(){
            return 0;
        }

        void Bank(){
            this.loanInterestRate = loanInterestRate;
        }

        float getLoanInterestRate(){
            float loanInterestRate = 17.99f;
            System.out.println("This is loan interest minimum for all banks : "+ loanInterestRate+"%");
            return loanInterestRate;
        }
    }

     static class SBI extends Bank {
         void SBI() {
         }

         float getInterestRate() {
             return 7.1f;
         }

         float getLoanInterestRate() {
             float loanInterestRate = 19.99f;
             System.out.println("This is loan interest at any other bank : " + loanInterestRate+"%");
             return loanInterestRate;
         }
     }

    static class ICICI extends Bank{
        float getInterestRate(){
            return 8.1f;
        }
    }

    static class AXIS extends Bank{
        float getInterestRate(){
            return 9.1f;
        }
    }


    //Method Overloading
    static class Adder{
        static int add(int a,int b){return a+b;}
        static int add(int a,int b,int c){return a+b+c;}
    }

//super
    //super is used to invoke parent class constructor.
//    super can be used to invoke parent class method
 static class Animal{
    String color="white";
}
     static class Dog extends Animal{
        String color="black";
        void printColor(){
            System.out.println(color);//prints color of Dog class
            System.out.println(super.color);//prints color of Animal class
        }
    }
}
