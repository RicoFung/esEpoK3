
package com.api.soap.client.ZFM_IF_SD_DELIVERY_O2O;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E_RETURN_DESC" type="{urn:sap-com:document:sap:rfc:functions}string"/&gt;
 *         &lt;element name="E_RETURN_FLAG" type="{urn:sap-com:document:sap:rfc:functions}string"/&gt;
 *         &lt;element name="IT_ZIFTG00080_D1" type="{urn:sap-com:document:sap:rfc:functions}TABLE_OF_ZIFTG00080_D1"/&gt;
 *         &lt;element name="IT_ZIFTG00080_D2" type="{urn:sap-com:document:sap:rfc:functions}TABLE_OF_ZIFTG00080_D2"/&gt;
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
    "ereturndesc",
    "ereturnflag",
    "itziftg00080D1",
    "itziftg00080D2"
})
@XmlRootElement(name = "ZFM_IF_SD_DELIVERY_O2OResponse")
public class ZFMIFSDDELIVERYO2OResponse {

    @XmlElement(name = "E_RETURN_DESC", required = true)
    protected String ereturndesc;
    @XmlElement(name = "E_RETURN_FLAG", required = true)
    protected String ereturnflag;
    @XmlElement(name = "IT_ZIFTG00080_D1", required = true)
    protected TABLEOFZIFTG00080D1 itziftg00080D1;
    @XmlElement(name = "IT_ZIFTG00080_D2", required = true)
    protected TABLEOFZIFTG00080D2 itziftg00080D2;

    /**
     * 获取ereturndesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERETURNDESC() {
        return ereturndesc;
    }

    /**
     * 设置ereturndesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERETURNDESC(String value) {
        this.ereturndesc = value;
    }

    /**
     * 获取ereturnflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERETURNFLAG() {
        return ereturnflag;
    }

    /**
     * 设置ereturnflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERETURNFLAG(String value) {
        this.ereturnflag = value;
    }

    /**
     * 获取itziftg00080D1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TABLEOFZIFTG00080D1 }
     *     
     */
    public TABLEOFZIFTG00080D1 getITZIFTG00080D1() {
        return itziftg00080D1;
    }

    /**
     * 设置itziftg00080D1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TABLEOFZIFTG00080D1 }
     *     
     */
    public void setITZIFTG00080D1(TABLEOFZIFTG00080D1 value) {
        this.itziftg00080D1 = value;
    }

    /**
     * 获取itziftg00080D2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TABLEOFZIFTG00080D2 }
     *     
     */
    public TABLEOFZIFTG00080D2 getITZIFTG00080D2() {
        return itziftg00080D2;
    }

    /**
     * 设置itziftg00080D2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TABLEOFZIFTG00080D2 }
     *     
     */
    public void setITZIFTG00080D2(TABLEOFZIFTG00080D2 value) {
        this.itziftg00080D2 = value;
    }

}
