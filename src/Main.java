public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача 2
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //Задача 3
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        //Задача 4
        int age1 = 50;
        boolean kindergarten = age1 >= 2 && age1 <= 6;
        boolean school = age1 >= 7 && age1 <= 17;
        boolean university = age1 >= 18 && age1 <= 24;
        boolean work = age1 > 24;
        if (kindergarten)
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        if (school)
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        if (university)
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        if (work)
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        // Задача 5
        int age2 = 12;
        boolean сanNotRideTheRide = age2 < 5;
        boolean canRideWithAnAdult = age2 > 5 && age2 < 14;
        boolean canRideWithoutAnAdult = age2 > 14;
        if (сanNotRideTheRide)
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        if (canRideWithAnAdult)
            System.out.println("Если возраст ребенка равен " + age2 + ", можно кататься на аттракционе в сопровождении");
        if (canRideWithoutAnAdult)
            System.out.println("Если возраст ребенка равен " + age2 + ", можно кататься на аттракционе без сопровождения взрослого");
        //Задача 6 не доделана пока
        int seats1 = 103;
        int standingPlaces = 42;
        int seatingPositions = 60;
        if (seats1 <= 102) {
            System.out.println("В вагоне есть свободные места");
        } else {
            System.out.println("Вагон полностью забит");
            int seats2 = 103;
            if (seats2 < 60) {
                System.out.println("В вагоне есть свободные сидячие места");
            } else {
                System.out.println("В вагоне нет свободных сидячих мест");
                int seats3 = 41;
                if (seats3 < 42) {
                    System.out.println("В вагоне есть свободные стоячие места");
                } else {
                    System.out.println("В вагоне нет свободных стоячих мест");
                }
                // Задача 7
                int one = 1;
                int two = 2;
                int three = 3;
                if (one > two && one > three) {
                    System.out.println(one);
                } else {
                    System.out.println(three);
                }
                if (two > three) {
                    System.out.println(two);
                } else {
                    System.out.println(three);
                }


                }
        }
    }
}






