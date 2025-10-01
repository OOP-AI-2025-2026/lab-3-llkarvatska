package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {
        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id)
                .append(" for customer ").append(customer);
        builder.append("\n------------------\n");

        double sum = 0.0;
        for (Item item : cart.getItems()) {
            sum += item.getPrice();

            builder.append("Item id: ").append(item.getId());
            builder.append(" name: ").append(item.getName());
            builder.append(" price: ").append(item.getPrice());
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ").append(sum);

        return builder.toString();
    }
}

