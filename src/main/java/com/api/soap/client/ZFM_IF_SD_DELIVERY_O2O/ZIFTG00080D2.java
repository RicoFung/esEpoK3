
package com.api.soap.client.ZFM_IF_SD_DELIVERY_O2O;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ZIFTG00080_D2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ZIFTG00080_D2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MANDT" type="{urn:sap-com:document:sap:rfc:functions}clnt3"/&gt;
 *         &lt;element name="BSTKD" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="KSCHL" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="KBETR" type="{urn:sap-com:document:sap:rfc:functions}curr11.2"/&gt;
 *         &lt;element name="WAERS" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZIFTG00080_D2", propOrder = {
    "mandt",
    "bstkd",
    "kschl",
    "kbetr",
    "waers"
})
public class ZIFTG00080D2 {

    @XmlElement(name = "MANDT", required = true)
    protected String mandt;
    @XmlElement(name = "BSTKD", required = true)
    protected String bstkd;
    @XmlElement(name = "KSCHL", required = true)
    protected String kschl;
    @XmlElement(name = "KBETR", required = true)
    protected BigDecimal kbetr;
    @XmlElement(name = "WAERS", required = true)
    protected String waers;

    /**
     * 获取mandt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDT() {
        return mandt;
    }

    /**
     * 设置mandt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDT(String value) {
        this.mandt = value;
    }

    /**
     * 获取bstkd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSTKD() {
        return bstkd;
    }

    /**
     * 设置bstkd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSTKD(String value) {
        this.bstkd = value;
    }

    /**
     * 获取kschl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKSCHL() {
        return kschl;
    }

    /**
     * 设置kschl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKSCHL(String value) {
        this.kschl = value;
    }

    /**
     * 获取kbetr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKBETR() {
        return kbetr;
    }

    /**
     * 设置kbetr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKBETR(BigDecimal value) {
        this.kbetr = value;
    }

    /**
     * 获取waers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS() {
        return waers;
    }

    /**
     * 设置waers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS(String value) {
        this.waers = value;
    }

}
