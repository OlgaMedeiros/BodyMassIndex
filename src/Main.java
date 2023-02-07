public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 60; // масса тела в кг
        double height = 1.68; // рост в м

        double ihdex = service.calculate(weight, height);

        System.out.println("Масса тела в кг. = 60");
        System.out.println("Рост в м.  1.68");
        System.out.println("Индекс массы тела : " + ihdex);

    }
}