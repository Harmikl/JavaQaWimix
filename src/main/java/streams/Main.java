package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created by maksimkharmak , 5.08.21
 */
public class Main {
    public static void main(String[] args) {
        List<Staff> staff = getStaff();
//        staff.forEach(System.out::println);

        // todo Filter
       List<Staff> qa = staff.stream().filter(staff1 -> staff1.getPosition().equals(Positions.QA))
                .collect(Collectors.toList());
//       qa.forEach(System.out::println);
//        System.out.println();

        List<Staff> nameDasha = staff.stream().filter(staff1 -> staff1.getName().equals("Dasha"))
                .collect(Collectors.toList());
//        nameDasha.forEach(System.out::println);

        // todo Sort
        List<Staff> sortByNames = staff.stream().sorted(Comparator.comparing(Staff::getName))
                .collect(Collectors.toList());
//        sortByNames.forEach(System.out::println);

        List<Staff> sortByExperienceReversed = staff.stream().sorted(Comparator.comparing(Staff::getExperience)
                .reversed()).collect(Collectors.toList());
//        sortByExperienceReversed.forEach(System.out::println);

        //todo All match
//         возвращает булеву переменную если совпадение по всему листу
        boolean allMatch = staff.stream().allMatch(staff1 -> staff1.getExperience() > 1.5);
//        System.out.println(allMatch);

        // todo Any match
        //  возвращает булеву переменную если совпадение хотя бы по одному полю
        boolean anyMatch = staff.stream().anyMatch(staff1 -> staff1.getName()=="Artur");
//        System.out.println(anyMatch);

        //todo None match
        boolean noneMatch = staff.stream().noneMatch(staff1 -> staff1.getExperience() == 55);
//        System.out.println(noneMatch);

        //todo Max
//        staff.stream().max(Comparator.comparing(Staff::getExperience))
//                .ifPresent(System.out::println);

        //todo Min
        staff.stream().min(Comparator.comparing(Staff::getExperience))
                .ifPresent(System.out::println);

        //
    }
    private static List<Staff> getStaff(){
        return  List.of(
                new Staff("Lera",3,Positions.HR),
                new Staff("Andrey",6,Positions.QA),
                new Staff("Dasha",3,Positions.QA),
                new Staff("Anastasiya",2,Positions.QA),
                new Staff("Artur",2,Positions.QA),
                new Staff("Evheny",2,Positions.IOS_DEV),
                new Staff("Ivan",5,Positions.ANDROID_DEV),
                new Staff("Olya",2,Positions.QA),
                new Staff("Nikita",4,Positions.ANDROID_DEV)
        );
    }
}
