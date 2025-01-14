
package com.inflectra.spiratest.plugins.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="TestRun_RecordAutomated3Result" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects}ArrayOfRemoteAutomatedTestRun" minOccurs="0"/>
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
    "testRunRecordAutomated3Result"
})
@XmlRootElement(name = "TestRun_RecordAutomated3Response")
public class TestRunRecordAutomated3Response {

    @XmlElementRef(name = "TestRun_RecordAutomated3Result", namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRemoteAutomatedTestRun> testRunRecordAutomated3Result;

    /**
     * Gets the value of the testRunRecordAutomated3Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteAutomatedTestRun> getTestRunRecordAutomated3Result() {
        return testRunRecordAutomated3Result;
    }

    /**
     * Sets the value of the testRunRecordAutomated3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}
     *     
     */
    public void setTestRunRecordAutomated3Result(JAXBElement<ArrayOfRemoteAutomatedTestRun> value) {
        this.testRunRecordAutomated3Result = ((JAXBElement<ArrayOfRemoteAutomatedTestRun> ) value);
    }

}
