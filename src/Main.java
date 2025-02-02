import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> animals = List.of("Oso", "Jirafa", "Leon", "Oca", "oveja", "Rata", "Serpiente");
        List<String> filteredAnimals = animals.stream()
                .filter(animal -> animal.toLowerCase().contains("o"))
                .collect(Collectors.toList());         // this phrase can be replaced by  .toList();

        System.out.println("New list with animals that contains char O: " + filteredAnimals);
    }
}
