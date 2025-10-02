package class_6;

class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }
}

class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Минивэн может перевести " + minivan.passengers +
                " пассажиров на расстояние " + minivan.range() + " миль.");
        System.out.println("Спортивный автомобиль может перевести " + sportscar.passengers +
                " пассажиров на расстояние " + sportscar.range() + " миль.");

        if(minivan.range() > sportscar.range())
            System.out.println("v1 имеет большую дальность поездки.");
    }
}