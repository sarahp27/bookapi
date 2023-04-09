package com.glc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void EmptyList()
    {
        //setup
        int list=0;
        //execute
        ReadList read= new ReadList("January 1, 2020,",5);
        int result=read.getBook();
        //assert
        assertEquals(list, result);
    }
}
