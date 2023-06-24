import Database.CarOperations;
import Database.FinanceOperations;
import GUI.MainMenu;

public class Main {
    public static void main(String[] args) {
        Database.CarOperations carUpd = new CarOperations();
        Database.FinanceOperations finUpd = new FinanceOperations();
        carUpd.updateCars();
        finUpd.updateStatus();
        GUI.MainMenu mm = new MainMenu();

    }
}