package com.pawan;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class DukeTest {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(Duke.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(new Duke("java", 2), new File("duke2.xml"));
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object unmarshalled = unmarshaller.unmarshal(new File("duke.xml"));
		System.out.println(unmarshalled);

	}

}
