package interfaces;

/**
 * created by maksimkharmak , 3.08.21
 */
@FunctionalInterface
public interface Info { // решили что у класса person and animals есть общее поведение
    public void showInfo(); // в интерфейсе не может быть тела метода, поэтому фигурных скобок нету
}
