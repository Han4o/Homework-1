package com.company;
public class Main {

    public static void main(String[] args) {
        //Task №1
        Man vova = new Man();
        vova.set_man("Vova", 22);
        vova.setAge(26);
        Man Serghei = new Man ();
        Serghei.set_man("Serghei", 40);
        Man vova1 = new Man();
        vova1.set_man("Vova", 26);
        Man andrei = new Man();
        andrei.set_man("Andrei", 34);
        vova.walk();
        vova.eat();
        Car mercedes = new Car();
        mercedes.set_car(Car.Color.Black, "W221", "Automatic", 5);
        mercedes.accelerate();
        mercedes.accelerate();
        mercedes.stop();
        mercedes.driver.add(vova);
        System.out.println(mercedes.get_Driver());
        //Task №2, toString with StringBuffer and StringBuilder
        String car = mercedes.toString();
        StringBuilder strBuilder = new StringBuilder(car);
        System.out.println("Capacity: " + strBuilder.capacity());
        String man = vova.toString();
        StringBuffer strBuffer = new StringBuffer(man);
        System.out.println("Capacity: " + strBuffer.capacity());

        //Task №2 , hashcode implementation
        System.out.println(vova.hashCode());

        //Task №2, equals implementation
        System.out.println(vova.equals(vova1));
        System.out.println(vova == vova1);

        //Task №5 Exception catching
        /*try {
            mercedes.passengers.add(vova);
            mercedes.passengers.add(vova);
            mercedes.passengers.add(vova);
            mercedes.passengers.add(vova);
            mercedes.passengers.add(vova);
            mercedes.passengers.add(vova);
            mercedes.passengers.add(vova);
            while (mercedes.passengers.size() > mercedes.get_capacity()) {
                mercedes.passengers.remove(mercedes.get_capacity());
                throw new Exception("There cannot be more passengers, than allowed");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());

        }
            System.out.println(mercedes.passengers);
        //Task
*/
        mercedes.addPassenger(vova);
        mercedes.addPassenger(vova);
        mercedes.addPassenger(vova);
        mercedes.addPassenger(vova);
        mercedes.addPassenger(vova);
        mercedes.addPassenger(vova);
        mercedes.addPassenger(vova);
        mercedes.addPassenger(vova);
        mercedes.addPassenger(vova);
        System.out.println("" + mercedes.passengers);

        mercedes.accelerate(5);
        mercedes.accelerate(5);
        mercedes.accelerate(5);
        mercedes.accelerate(5);
        mercedes.accelerate(5);
        mercedes.accelerate(5);


        //Task 12 Interface
        mercedes.printinfo();
    }

}
