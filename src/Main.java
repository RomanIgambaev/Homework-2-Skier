public class Main {
    public static void main(String[] args) {
        double firstDayKm = 10;
        int countDay = 1;
        double sumKm = 0;
        while (countDay <= 9) {
            firstDayKm = firstDayKm + firstDayKm/100*10;
            System.out.println("Пробег лыжиника на каждый день " + firstDayKm);
            sumKm += firstDayKm;
            countDay++;
        }
        System.out.println("В сумме лыжник пробежал за 10 дней:" + (int)sumKm );
    }
}