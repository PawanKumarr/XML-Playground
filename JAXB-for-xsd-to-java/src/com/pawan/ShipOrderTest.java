package com.pawan;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.pawan.jaxb.generated.*;

public class ShipOrderTest {

	public static void main(String[] args) throws JAXBException {
		ObjectFactory factory = new ObjectFactory();
		
		Shiporder shiporder = factory.createShiporder();
		shiporder.setOrderid("#123");
		shiporder.setOrderperson("Mr Delivery Man");
		
		// shipto
		Shipto shipto = factory.createShipto();
		shipto.setName("Pawan Kumar");
		shipto.setAddress("Thirupparankundram");
		shipto.setCity("Madurai");
		shipto.setCountry("India");
	    shiporder.setShipto(shipto);
		
		// First Item
		Item item1 = factory.createItem();
		item1.setTitle("Design Patterns");
		item1.setNote("A Head First Book");
		item1.setQuantity(new BigInteger("1"));
		item1.setPrice(new BigDecimal(450.0));
		shiporder.getItem().add(item1);
		
		// Second Item
		Item item2 = factory.createItem();
		item2.setTitle("Umbrella");
		item2.setQuantity(new BigInteger("2"));
		item2.setPrice(new BigDecimal(150.0));
		shiporder.getItem().add(item2);
		
		// Serialize the java object into XML file & Standard Output stream
		JAXBContext context = JAXBContext.newInstance("com.pawan.jaxb.generated");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(shiporder, System.out);
		marshaller.marshal(shiporder, new File("shiporder.xml"));
	}

}
