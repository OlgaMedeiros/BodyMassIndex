public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double m = 60; // масса тела в кг
        double h = 1.68; // рост в м

        double ihdex = service.calculate(m , h);

        System.out.println("Масса тела в кг. = 60");
        System.out.println("Рост в м.  1.68");
        System.out.println("Индекс массы тела : " + ihdex);

    }
}