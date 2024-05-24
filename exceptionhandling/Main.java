package exceptionhandling;

class Customer {
    int id;
    String name;
    double walletBalance;
    String address;

    public Customer(int id, String name, double walletBalance, String address) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.address = address;
    }
}

class Item {
    int id;
    String name;
    String companyName;
    double price;
    boolean isInStock;

    public Item(int id, String name, String companyName, double price, boolean isInStock) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
        this.isInStock = isInStock;
    }
}

class ShoppingWebsite {
    public String purchaseItem(Item item, Customer customer) throws ItemOutOfStockException, InsufficientBalanceException {
        if (!item.isInStock) {
            throw new ItemOutOfStockException("Item is out of stock");
        }

        if (customer.walletBalance < item.price) {
            throw new InsufficientBalanceException("Customer wallet balance is not sufficient");
        }

        // Deduct item price from customer's wallet balance
        customer.walletBalance -= item.price;
        return "Order Successful";
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ItemOutOfStockException extends Exception {
    public ItemOutOfStockException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Sample Testcase
        Customer cusDet = new Customer(927, "Steve", 5000.0, "USA");
        Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
        ShoppingWebsite obj = new ShoppingWebsite();

        try {
            String out = obj.purchaseItem(itemDet, cusDet);
            System.out.println("Output: " + out);
        } catch (ItemOutOfStockException | InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
