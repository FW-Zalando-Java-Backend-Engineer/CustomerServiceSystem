package org.example;

/**
 * Represents a customer service ticket.
 */
public class Ticket {
    // Constant Fields: id and description
    private final int id;
    private final String description;

    /**
     * Constructs a Ticket with the given id and description.
     *
     * @param id  the unique identifier of the ticket
     * @param description the description of the issue
     * */
    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    /**
     * Returns the ticket's ID.
     *
     * @return the ticket ID
     * */
    public int getId() {
        return id;
    }


    /**
     * Returns the ticket's description.
     *
     * @return the ticket description
     */
    public String getDescription() {
        return description;
    }
}
