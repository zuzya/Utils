
package ru.hostco.sumz.save;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number_stack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Number_melt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Control_mode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Repeat_mode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Weigth" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberStack",
    "numberMelt",
    "count",
    "controlMode",
    "repeatMode",
    "team",
    "weigth",
    "user",
    "dateTime"
})
@XmlRootElement(name = "SavePlatform_R")
public class SavePlatformR {

    @XmlElement(name = "Number_stack", required = true)
    protected String numberStack;
    @XmlElement(name = "Number_melt", required = true)
    protected String numberMelt;
    @XmlElement(name = "Count", required = true)
    protected BigInteger count;
    @XmlElement(name = "Control_mode", required = true)
    protected BigInteger controlMode;
    @XmlElement(name = "Repeat_mode", required = true)
    protected BigInteger repeatMode;
    @XmlElement(name = "Team", required = true)
    protected String team;
    @XmlElement(name = "Weigth", required = true)
    protected BigDecimal weigth;
    @XmlElement(name = "User", required = true)
    protected String user;
    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    /**
     * Gets the value of the numberStack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberStack() {
        return numberStack;
    }

    /**
     * Sets the value of the numberStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberStack(String value) {
        this.numberStack = value;
    }

    /**
     * Gets the value of the numberMelt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberMelt() {
        return numberMelt;
    }

    /**
     * Sets the value of the numberMelt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberMelt(String value) {
        this.numberMelt = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the controlMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getControlMode() {
        return controlMode;
    }

    /**
     * Sets the value of the controlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setControlMode(BigInteger value) {
        this.controlMode = value;
    }

    /**
     * Gets the value of the repeatMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepeatMode() {
        return repeatMode;
    }

    /**
     * Sets the value of the repeatMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepeatMode(BigInteger value) {
        this.repeatMode = value;
    }

    /**
     * Gets the value of the team property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam(String value) {
        this.team = value;
    }

    /**
     * Gets the value of the weigth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeigth() {
        return weigth;
    }

    /**
     * Sets the value of the weigth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeigth(BigDecimal value) {
        this.weigth = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

}
