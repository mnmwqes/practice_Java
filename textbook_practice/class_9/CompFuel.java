package class_9;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Для поездки на расстояние " + dist +
                " миль минивэну требуется " + gallons + " галлонов топлива.");
        gallons = sportscar.fuelNeeded(dist);
        System.out.println("Для поездки на расстояние " + dist +
                " миль спортивному автомобилю требуется " + gallons + " галлонов топлива.");
    }
}
