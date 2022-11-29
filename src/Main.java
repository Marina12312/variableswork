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

        var watch = 640;
        var workingHours = 8;
        var people = watch / workingHours;
        System.out.println("Всего работников в компании- " + people + " человек" );

        var morePeople = people + 94;
        System.out.println("Количество сотрудников " +morePeople + " если бы их было больше на 94");
        var workTime = watch / morePeople;
        System.out.println("Если в компании работает " + morePeople+ " человек, то всего "+ workTime + " часа работы может быть поделено между сотрудниками");






    }
}