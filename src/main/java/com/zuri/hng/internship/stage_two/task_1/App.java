package com.zuri.hng.internship.stage_two.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.stream.Collectors;

import org.json.CDL;

public class App 
{
    public static void main( String[] args )
    {
    	InputStream isInputStream = App.class.getResourceAsStream("all-teams.csv");
    	System.out.println(isInputStream);
    	
    	String csv = new BufferedReader(
        		new InputStreamReader(Objects.requireNonNull(isInputStream), StandardCharsets.UTF_8))
        		.lines().collect(Collectors.joining("\n"));
    	
    	String json = CDL.toJSONArray(csv).toString(2);
    	System.out.println(json);
    	
    	try {
			Files.write(Path.of("all-teams.json"), json.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
