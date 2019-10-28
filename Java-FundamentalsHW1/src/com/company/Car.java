package com.company;
import java.util.ArrayList;

   public class Car extends CarAbstract implements Tesla{
        private Color color;
        private String model;
        private String TypeofBox;
        private int speed_number = 0;
        private int channels;
        private int capacity;
        private int speed = 0;
        public ArrayList<Man> passengers = new ArrayList<Man>(capacity);
        public ArrayList<Man> driver = new ArrayList<Man>(1);


        //Task 9
        enum Color{
            Black,
            Blue,
            White,
            Green,
            Brown
        }

        protected void set_car(Color color, String model, String TypeofBox, int capacity){
            this.color = color;
            this.model = model;
            this.TypeofBox = TypeofBox;
            this.capacity = capacity;
            this.passengers.ensureCapacity(this.capacity-1);
        }
        public int get_capacity(){
            return this.capacity;
        }

        protected ArrayList<Man> get_Driver(){
            return this.driver;
       }



        protected void accelerate(){
            if (this.speed < 200) {
                this.speed = this.speed + 20;
                System.out.printf("%s accelerated, speed is %d\n", this.model, this.speed);
            }
            else{
                System.out.printf("It is maximum speed!!!");
            }
        }
        // Task №7
        protected void accelerate(int channels) {
            if (this.speed_number < channels)
            {
                this.speed = this.speed + 40;
                this.speed_number = this.speed_number + 1;
                System.out.println(this.speed_number);
                System.out.printf("%s accelerated, speed is %d, speed number is %d\n", this.model, this.speed, this.speed_number);

            }
            else
            {
                System.out.printf("It is maximum speed!!!");
            }
        }

        protected void stop(){
            speed = 0;
            System.out.printf("%s stopped\n", model);
        }

        public void printinfo(){
            System.out.printf("" + this.color + " " + this.model + "\n");
        }

        public String toString(){
            return "Car " + model + " " + capacity;
        }
        public void addPassenger(Man m) {
            if(passengers.size() >= get_capacity()) {
                try {
                    passengers.remove(m);
                    throw new Exception("Too much passengers");
                }
                catch (Exception e) {
                    System.out.println("There cannot be more passengers than allowed");
                }
            }
            passengers.add(m);
        }
        }

