//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.01 at 02:33:19 PM MSK 
//


package org.whissper.livinghouse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.whissper.livinghouse package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Houses_QNAME = new QName("", "houses");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.whissper.livinghouse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HousesLivingHouseType }
     * 
     */
    public HousesLivingHouseType createHousesLivingHouseType() {
        return new HousesLivingHouseType();
    }

    /**
     * Create an instance of {@link LivingHousesType }
     * 
     */
    public LivingHousesType createLivingHousesType() {
        return new LivingHousesType();
    }

    /**
     * Create an instance of {@link CadastralInfoType }
     * 
     */
    public CadastralInfoType createCadastralInfoType() {
        return new CadastralInfoType();
    }

    /**
     * Create an instance of {@link LivingHouseType }
     * 
     */
    public LivingHouseType createLivingHouseType() {
        return new LivingHouseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HousesLivingHouseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "houses")
    public JAXBElement<HousesLivingHouseType> createHouses(HousesLivingHouseType value) {
        return new JAXBElement<HousesLivingHouseType>(_Houses_QNAME, HousesLivingHouseType.class, null, value);
    }

}