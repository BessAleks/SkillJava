package core;

public class Camera
{
    public static Car getNextCar()
    {
        String randomNumber = Double.toString(Math.random()).substring(2, 5);// создает переменную типа String
        int randomHeight = (int) (1000 + 3500. * Math.random());// создает переменную типа int
        double randomWeight = 600 + 10000 * Math.random();// создает переменную типа double

        Car car = new Car(); //создает переменную, которая является экземпляром класса Car
        car.number = randomNumber;
        car.height = randomHeight;
        car.weight = randomWeight;
        car.hasVehicle = Math.random() > 0.5;
        car.isSpecial = Math.random() < 0.15;

        return car;
    }
}