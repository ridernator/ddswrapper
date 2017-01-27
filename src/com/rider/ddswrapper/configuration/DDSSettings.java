//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.27 at 08:06:25 PM GMT 
//


package com.rider.ddswrapper.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoggerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberOfThreads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThreadPoolLogger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QoSFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DomainParticipant" type="{}DomainParticipant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loggerName",
    "numberOfThreads",
    "threadPoolLogger",
    "qoSFile",
    "domainParticipant"
})
@XmlRootElement(name = "DDSSettings")
public class DDSSettings {

    @XmlElement(name = "LoggerName", required = true)
    protected String loggerName;
    @XmlElement(name = "NumberOfThreads")
    protected Integer numberOfThreads;
    @XmlElement(name = "ThreadPoolLogger")
    protected String threadPoolLogger;
    @XmlElement(name = "QoSFile")
    protected List<String> qoSFile;
    @XmlElement(name = "DomainParticipant")
    protected List<DomainParticipant> domainParticipant;

    /**
     * Gets the value of the loggerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggerName() {
        return loggerName;
    }

    /**
     * Sets the value of the loggerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggerName(String value) {
        this.loggerName = value;
    }

    /**
     * Gets the value of the numberOfThreads property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfThreads() {
        return numberOfThreads;
    }

    /**
     * Sets the value of the numberOfThreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfThreads(Integer value) {
        this.numberOfThreads = value;
    }

    /**
     * Gets the value of the threadPoolLogger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadPoolLogger() {
        return threadPoolLogger;
    }

    /**
     * Sets the value of the threadPoolLogger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadPoolLogger(String value) {
        this.threadPoolLogger = value;
    }

    /**
     * Gets the value of the qoSFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qoSFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQoSFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQoSFile() {
        if (qoSFile == null) {
            qoSFile = new ArrayList<String>();
        }
        return this.qoSFile;
    }

    /**
     * Gets the value of the domainParticipant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainParticipant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainParticipant }
     * 
     * 
     */
    public List<DomainParticipant> getDomainParticipant() {
        if (domainParticipant == null) {
            domainParticipant = new ArrayList<DomainParticipant>();
        }
        return this.domainParticipant;
    }

}