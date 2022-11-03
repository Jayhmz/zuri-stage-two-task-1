package com.zuri.hng.internship.stage_two.task_1;

import java.io.InputStream;

public class App 
{
    public static void main( String[] args )
    {
    	InputStream isInputStream = App.class.getResourceAsStream("all-teams.csv");
    	System.out.println(isInputStream);
    	
    }
}
