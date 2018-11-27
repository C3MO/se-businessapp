package com.businessapp;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Test;

import com.businessapp.pojos.Customer;
import com.businessapp.pojos.Customer.CustomerStatus;
/**
 * Created by home on 06.11.18.
 */
public class CustomerTest {

        final String empty= "";

        final Customer c1 = new Customer("HGGSHJ", "Hailo Mailo");
        final Customer c3 = new Customer("JKZITHL", "Felix Klein");


        @Test
        public void testCustomerConstructor() {
            final Customer c2 = new Customer("KBHJGHJG", "Richard Hardt");
            assertEquals("KBHJGHJG", c2.getId());
            assertEquals("Richard Hardt", c2.getName());
        }

        @Test
        public void testSetGetId() {

            final String test= "WWEEEPOEPE";
            c1.setId(test);

            assertThat(test == c1.getId(), is(true));
            assertEquals(test, c1.getId());

            c1.setId(empty);
            assertEquals(empty, c1.getId());

            	c1.setId(null);
            	assertNull(c1.getId());


        }

        @Test
        public void testSetGetName() {
            final String testName = "Klaus Kleber";
            c1.setName(testName);
            assertEquals(testName, c1.getName());

            assertThat(testName == c1.getName(), is(true));

            c1.setName(empty);
            assertEquals(empty, c1.getName());
            c1.setName(null);
            assertNull(c1.getName());
        }

        @Test
        public void testSetGetStatus() {

            final CustomerStatus status ;
            status= CustomerStatus.ACTIVE;
            c1.setStatus(status);
            assertEquals(status, c1.getStatus());
            c1.setStatus(null);
            assertNull(c1.getStatus());

        }

        @Test
        public void testAddGetContacts(){
            c1.addContact("Lanz");
            assertEquals("Lanz",c1.getContacts().get(0));

            c3.addContact(null);
            assertNull(c3.getContacts().get(0));

            c3.addContact("");
            assertEquals("", c3.getContacts().get(1));
        }
        @Test
        public void testSetGetNotes() {
            	c1.setNotes("notes");
            assertEquals("notes", c1.getNotes().get(1).getLog());



        }

    }

