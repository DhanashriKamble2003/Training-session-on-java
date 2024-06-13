package dk.com;
import java.util.ArrayList;

import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Menu {
    private ArrayList<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName() + ": $" + items.get(i).getPrice());
        }
    }

    public MenuItem getItem(int index) {
        return items.get(index);
    }

    public int getItemCount() {
        return items.size();
    }
}

class Order {
    private ArrayList<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getMenuItem().getPrice() * item.getQuantity();
        }
        return total;
    }

    public void displayOrderSummary() {
        System.out.println("\nOrder Summary:");
        for (OrderItem item : items) {
            System.out.println(item.getMenuItem().getName() + " - Quantity: " + item.getQuantity());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

public class RestaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create menu
        Menu menu = new Menu();
        menu.addItem(new MenuItem("Burger   ", 5.99));
        menu.addItem(new MenuItem("Pizza    ", 8.99));
        menu.addItem(new MenuItem("Fries    ", 2.49));
        menu.addItem(new MenuItem("Soda     ", 1.50));

        // Display menu
        menu.displayMenu();

        // Start order
        Order order = new Order();
        System.out.println("***********************************************************");

        // Take order
        while (true) {
            System.out.print("Enter item number to order (0 to finish ordering): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
                
            }
            if (choice >= 1 && choice <= menu.getItemCount()) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                order.addItem(new OrderItem(menu.getItem(choice - 1), quantity));
            } else {
                System.out.println("Invalid choice. Please choose a valid item number.");
            }
        }
        // Display order summary and total
        order.displayOrderSummary();
    }
}

