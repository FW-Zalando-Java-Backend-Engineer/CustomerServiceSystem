package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for TicketQueue.
 */
public class TicketQueueTest {
    @Test
    public void testAddAndProcessTicket(){
        TicketQueue queue = new TicketQueue();
        Ticket ticket = new Ticket(1, "Issue with login");
        queue.addTicket(ticket);
        assertEquals(1, queue.getQueueSize());

        Ticket processed = queue.processNextTicket();
        assertEquals(ticket, processed);
        assertEquals(0, queue.getQueueSize());

    }

}
