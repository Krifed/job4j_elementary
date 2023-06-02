package ru.job4j.calculator;

public class Fit {
        public static double manWeight(short height) {
            double rsl = 84 * 1.15;
            return rsl;
        }

        public static double womanWeight(short height) {
            double rsl = 74 * 1.15;
            return rsl;
        }

        public static void main(String[] args) {
            short height = 184;
            double man = Fit.manWeight(height);
            System.out.println("Man 184 is " + man);
            double woman = Fit.womanWeight(height);
            System.out.println("Woman 184 is " + woman);
        }

    }

