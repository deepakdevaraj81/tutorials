package com.java.test;

import java.io.*;
import org.junit.Test;
import org.junit.*;

public class SerializationExample {
		
	@Test
    public void serializationTest() throws Exception {
        Employee emp = new Employee();
        emp.id = "A-23825";
        emp.name = "Adrian Peterson";
        emp.address = "Regent Street , 2nd cross";
        FileOutputStream fileOut = 
	      new FileOutputStream("src/com/java/test/employee.ser");
	    ObjectOutputStream out = new ObjectOutputStream(fileOut);
	    out.writeObject(emp);   // Serialized data is saved in src/com/java/test/employee.ser
	    out.close();
	    fileOut.close();
	}
}	
