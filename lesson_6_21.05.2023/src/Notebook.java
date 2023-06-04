import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Notebook(String brand, String model, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Dell", "Inspiron", 8, 512, "Windows 10", "Black"));
        notebooks.add(new Notebook("Apple", "MacBook Pro", 16, 512, "macOS", "Silver"));
        notebooks.add(new Notebook("HP", "Pavilion", 12, 256, "Windows 10", "Blue"));
        notebooks.add(new Notebook("Lenovo", "ThinkPad", 16, 1_024, "Windows 10", "Black"));
        notebooks.add(new Notebook("Asus", "ZenBook", 8, 256, "Windows 10", "Gray"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criteria = scanner.nextInt();
        System.out.println("Введите минимальное значение для выбранного критерия:");
        int min = scanner.nextInt();

        for (Notebook notebook : notebooks) {
            switch (criteria) {
                case 1:
                    if (notebook.getRam() >= min) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel());
                    }
                    break;
                case 2:
                    if (notebook.getStorage() >= min) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel());
                    }
                    break;
                case 3:
                    if (notebook.getOs().equals(String.valueOf(min))) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel());
                    }
                    break;
                case 4:
                    if (notebook.getColor().equals(String.valueOf(min))) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel());
                    }
                    break;
                default:
                    System.out.println("Некорректный критерий.");
            }
        }
    }
}