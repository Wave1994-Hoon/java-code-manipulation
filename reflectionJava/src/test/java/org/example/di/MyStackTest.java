package org.example.di;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MyStackTest {

    @Test
    public void StackTest() {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push("1");

//        assertEquals(stack.pop().getClass(), String.class);
//        assertEquals(stack.pop().getClass(), String.class); // Fail Test
    }
}