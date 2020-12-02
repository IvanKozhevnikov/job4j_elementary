package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                String name = input.askStr("=== Create a new Item ====" + System.lineSeparator() +
                        "Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("Весь список заявок");
                Item[] allListTracker = tracker.findByAll();
                for (Item item : allListTracker) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                int id = input.askInt("Введите номер Id: ");
                String name = input.askStr("Введите новое имя заявки: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена успешно");
                } else {
                    System.out.println("Чтото пошло не так");
                }
            } else if (select == 3) {
                int id = input.askInt("Введите номер Id, номер заявки которую хотите удалить: ");
                if (tracker.delete(id)) {
                    System.out.println("Заявка удалена успешно");
                } else {
                    System.out.println("Заявка с таким номером Id не найдена");
                }
            } else if (select == 4) {
                int id = input.askInt("Введите номер вашего Id: ");
                Item findItem = tracker.findById(id);
                if (findItem != null) {
                    System.out.println("Искомая заявка: " + findItem.toString());
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                String name = input.askStr("Введите имя заявки: ");
                Item[] findItem = tracker.findByName(name);
                if (findItem.length > 0) {
                    for (Item item : findItem) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
