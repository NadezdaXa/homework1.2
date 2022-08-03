public class Main {
    public static void main(String[] args) {System.out.println("Hello world!");

        //задание1
        byte dog = 127;
        short cat = 32767;
        int mous = 214;
        long tiger = 50L;
        double sugarWeight = 2.5;
        float saltWeight = 1.7f;
        boolean bool = true;


        //задание2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weidghtDifferenceBoxers = boxer2 - boxer1;
        System.out.println("Общий вес боксеров" + weightOfAllBoxers);
        System.out.println("разница в весе боксеров" + weidghtDifferenceBoxers);

        //задание3
        int banana = 5;
        int bananaWeight = 80;
        int milk = 200/100;
        int milkWeight = 105;
        int iceСream = 2;
        int iceCremWeight = 100;
        int eggs = 4;
        int eggsWeight = 70;
        int weightOfallproducts = (banana * bananaWeight) + (milk * milkWeight) + (iceСream * iceCremWeight) + (eggs* eggsWeight);
        int gramsInKg =1000;
        double totalKg = weightOfallproducts / (gramsInKg * 1.0);
        System.out.println("вес завтрака" + totalKg + "кг");

        // задание 4
        int weightKg = 7;
        int GramsInKg = 1000;
        int weighIngrams = weightKg * GramsInKg;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int minDays = weighIngrams / maxGramsPerDay;
        int maxDays = weighIngrams / minGramsPerDay;
        double avgDay = (minDays + maxDays) /(2 * 1.0);
        System.out.println ("Минимум  на похудение" + minDays);
        System.out.println("Максимум на похудение" + maxDays);
        System.out.println("В среднем на похудение" + avgDay);

        //задание 5

        int percent = 10;
        double multiplier = percent / (100*1.0);
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        int mashaNewSalare = (int) (mashaSalary + (mashaSalary * multiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * multiplier));
        int mashaDifference = (mashaNewSalare - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int kristinaDifference = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("Маша теперь получает" + mashaNewSalare + "рублей.Годовой доход вырос на" + mashaDifference +"рублей");
        System.out.println("Денис теперь получает" + denisNewSalary + "рублей.Годовой доход вырос на" + denisDifference +"рублей");
        System.out.println("Кристина теперь получает" + kristinaNewSalary + "рублей.Годовой доход вырос на" + kristinaDifference +"рублей");





    }
}

