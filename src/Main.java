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
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано "+(paper /(class1 + class2 + class3))+ " листов бумаги");

        // Задача 4
        byte bottle = 16;
        byte time = 2;
        System.out.println("За 20 минут машина произвела "+ bottle /time *20 +" штук бутылок");
        System.out.println("За сутки машина произвела "+ bottle /time *24 *60 +" штук бутылок");
        System.out.println("За 3 дня машина произвела "+ bottle /time *3 *24 *60 +" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+ bottle/time *30 *24 *60 +" штук бутылок");

        // Задача 5
        byte remont = 120;
        byte white = 2;
        byte brown = 4;
        int classes = remont /(white +brown);
        System.out.println("В школе, где "+ classes +" классов, нужно "+ classes *2 + " банок белой краски и "+ classes *4 +" банок коричневой краски");

        // Задача 6
        int bananas = 5 *80;
        int milks = 200 /100 *105;
        int iceCreams = 2 *100;
        int aggs = 4 *70;
        float breakfast = (float) (bananas +milks +iceCreams +aggs);
        System.out.println("Вес завтрака спортсмена составляет "+ breakfast +" г или "+ (breakfast /1000) +" кг");

        // Задача 7
        float weight =(float) 7 *1000;
        short delta1 = 250;
        short delta2 = 500;
        System.out.println("При похудении по "+ delta1 +" г в день потребуется "+ (weight /delta1) +" дней");
        System.out.println("При похудении по "+ delta2 +" г в день потребуется "+ (weight /delta2) +" дней");
        System.out.println("В среднем для похудения может понадобиться "+ (weight /((delta1 +delta2) /2) +" дней"));

        // Задача 8
        int M = 67760;
        int D = 83690;
        int K = 76230;
        System.out.println("Маша теперь получает "+ (M *1.1) +" рублей. Годовой доход вырос на "+ (M *.1 *12) +" рублей.");
        System.out.println("Денис теперь получает "+ (D *1.1) +" рублей. Годовой доход вырос на "+ (D *.1 *12) +" рублей.");
        System.out.println("Кристина теперь получает "+ (K *1.1) +" рублей. Годовой доход вырос на "+ (K *.1 *12) +" рублей.");
    }
}