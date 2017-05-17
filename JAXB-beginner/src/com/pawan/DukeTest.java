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
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(new Duke("java", 7), new File("duke.xml"));
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object unmarshalled = unmarshaller.unmarshal(new File("duke.xml"));
		System.out.println(unmarshalled);

	}

}
