package org.example;


import java.util.Stack;

/**
 * Manages a stack of processed tickets.
 */
public class ProcessedTicketsStack {
    private final Stack<Ticket> processedTickets;

    /**
     * Constructs a new {@code ProcessedTicketsStack} instance.
     * */
    public ProcessedTicketsStack() {
        this.processedTickets = new Stack<>();
    }


    /**
     * Adds a ticket to the stack of processed tickets.
     * {@code ticket} will be pushed on top of the {@code processedTickets} stack.
     * @param ticket the ticket to be pushed onto {@code processedTickets} stack.
     */
    public void addProcessedTicket(Ticket ticket) {
        this.processedTickets.push(ticket);
    }


    /**
     * Returns a copy of the ticket at the top of {@code processedTickets} stack without removing it from the stack.
     *
     * @return the last processed ticket, or null if the stack is empty
     * */
    public Ticket peekLastProcessedTicket(){
        // return this.processedTickets.peek(); // Throws: EmptyStackException – if this stack is empty.
        //        if(this.processedTickets.isEmpty()){
        //            return null;
        //        }else{
        //            return this.processedTickets.peek();
        //        }

        return (this.processedTickets.isEmpty()) ? null : this.processedTickets.peek();

    }
    /**
     * Removes and returns the last processed ticket.
     *
     * @return the last processed ticket, or null if the stack is empty
     */
    public Ticket removeLastProcessedTicket(){
        return (this.processedTickets.isEmpty()) ? null : this.processedTickets.pop();
    }

    /**
     * Returns the number of processed tickets.
     *
     * @return the size of the stack
     */
    public int getProcessedTicketsCount() {
        return this.processedTickets.size();
    }
}
