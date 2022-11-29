public class Main {
    public static void main(String[] args) {

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + totalWeight + "кг!");

        var weightDifference = boxer2 - boxer1;
        System.out.println("Боксер2 на "+ weightDifference+ " кг больше баксера1");

        var difference = boxer1 - boxer2;
        System.out.println("Боксер1 на " + difference+ " кг меньше боксера2");

        var overload = boxer2 % boxer1;
        System.out.println("боксер1 на " + overload + "кг меньше боксера2");



    }
}