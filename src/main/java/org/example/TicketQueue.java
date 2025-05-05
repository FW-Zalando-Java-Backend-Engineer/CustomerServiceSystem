package org.example;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages a queue of customer service tickets.
 */
public class TicketQueue {
    private final Queue<Ticket> ticketQueue; // final: makes final reference, re-assignment is not allowed!

    public TicketQueue() {
        this.ticketQueue = new LinkedList<>();
    }

    /**
     * Adds a ticket to the queue
     *
     * @param ticket the ticket to add
     * */
    public void addTicket(Ticket ticket){
        this.ticketQueue.offer(ticket);
    }


    /**
     * Processes the next ticket in the queue, then removes it.
     *
     * @return the processed ticket, or null if the queue is empty
     */
    public Ticket processNextTicket(){
        return this.ticketQueue.poll();
    }

    /**
     * Returns the number of tickets in the queue.
     *
     * @return the size of the queue
     */
    public int getQueueSize(){
        return this.ticketQueue.size();
    }
}
