public class Main {
    public static void main(String[] args) {

        // Задача 1
        int a = 843055606;
        byte b = -86;
        short c = 11219;
        long d = -206663817L;
        float e = 3.14f;
        double f = 365.2422;
        System.out.println("Значение переменной a с типом int равно " +a);
        System.out.println("Значение переменной b с типом byte равно " +b);
        System.out.println("Значение переменной c с типом short равно " +c);
        System.out.println("Значение переменной d с типом long равно " +d);
        System.out.println("Значение переменной e с типом float равно " +e);
        System.out.println("Значение переменной f с типом double равно " +f);

        // Задача 2
        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786;
        short j = 569;
        short k = -159;
        int l = 27897;
        byte m = 67;

        // Задача 3
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано "+(paper /(class1 + class2 + class3))+ " листов бумаги");

        // Задача 4
        int bottle = 16;
        int time = 2;
        int min = bottle /time;
        int min20 = min *20;
        System.out.println("За 20 минут машина произвела "+ min20 +" штук бутылок");
        int day = min *60 *24;
        System.out.println("За сутки машина произвела "+ day +" штук бутылок");
        day = day *3;
        System.out.println("За 3 дня машина произвела "+ day +" штук бутылок");
        day = day *30;
        System.out.println("За 1 месяц машина произвела "+ day +" штук бутылок");

        // Задача 5
        int remont = 120;
        int white = 2;
        int brown = 4;
        int classes = remont /(white +brown);
        white = classes *2;
        brown = classes *4;
        System.out.println("В школе, где "+ classes +" классов, нужно "+ white + " банок белой краски и "+ brown +" банок коричневой краски");

        // Задача 6
        int bananas = 5 *80;
        int milks = 200 /100 *105;
        int iceCreams = 2 *100;
        int aggs = 4 *70;
        int breakfast = (bananas +milks +iceCreams +aggs);
        double breakfast1 = breakfast /1000;
        System.out.println("Вес завтрака спортсмена составляет "+ breakfast +" г или "+ breakfast1 +" кг");

        // Задача 7
        double weight = 7 *1000;
        int delta1 = 250;
        int delta2 = 500;
        double days = weight /delta1;
        System.out.println("При похудении по "+ delta1 +" г в день потребуется "+ days +" дней");
        days = weight /delta2;
        System.out.println("При похудении по "+ delta2 +" г в день потребуется "+ days +" дней");
        days = weight /((delta1 +delta2) /2);
        System.out.println("В среднем для похудения может понадобиться "+ days +" дней");

        // Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double s1 = 1.1;
        double s2 = .1 *12;
        double  salary = masha * s1;
        double salary1 = masha * s2;
        System.out.println("Маша теперь получает "+ salary +" рублей. Годовой доход вырос на "+ salary1 +" рублей.");
        salary = denis * s1;
        salary1 = denis * s2;
        System.out.println("Денис теперь получает "+ salary +" рублей. Годовой доход вырос на "+ salary1 +" рублей.");
        salary = kristina * s1;
        salary1 = kristina * s2;
        System.out.println("Кристина теперь получает "+ salary +" рублей. Годовой доход вырос на "+ salary1 +" рублей.");
    }
}