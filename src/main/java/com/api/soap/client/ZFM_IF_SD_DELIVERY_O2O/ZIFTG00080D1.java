
package com.api.soap.client.ZFM_IF_SD_DELIVERY_O2O;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ZIFTG00080_D1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ZIFTG00080_D1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MANDT" type="{urn:sap-com:document:sap:rfc:functions}clnt3"/&gt;
 *         &lt;element name="BSTKD" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="POSNR" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="MATNR" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="KWMENG" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="VRKME" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="ZZPRICE" type="{urn:sap-com:document:sap:rfc:functions}curr11.2"/&gt;
 *         &lt;element name="ZZDISPRICE" type="{urn:sap-com:document:sap:rfc:functions}curr11.2"/&gt;
 *         &lt;element name="ZZCURRENCY" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="ZFLD1" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ZFLD2" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ZFLD3" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ZFLD4" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ZFLD5" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZIFTG00080_D1", propOrder = {
    "mandt",
    "bstkd",
    "posnr",
    "matnr",
    "kwmeng",
    "vrkme",
    "zzprice",
    "zzdisprice",
    "zzcurrency",
    "zfld1",
    "zfld2",
    "zfld3",
    "zfld4",
    "zfld5"
})
public class ZIFTG00080D1 {

    @XmlElement(name = "MANDT", required = true)
    protected String mandt;
    @XmlElement(name = "BSTKD", required = true)
    protected String bstkd;
    @XmlElement(name = "POSNR", required = true)
    protected String posnr;
    @XmlElement(name = "MATNR", required = true)
    protected String matnr;
    @XmlElement(name = "KWMENG", required = true)
    protected BigDecimal kwmeng;
    @XmlElement(name = "VRKME", required = true)
    protected String vrkme;
    @XmlElement(name = "ZZPRICE", required = true)
    protected BigDecimal zzprice;
    @XmlElement(name = "ZZDISPRICE", required = true)
    protected BigDecimal zzdisprice;
    @XmlElement(name = "ZZCURRENCY", required = true)
    protected String zzcurrency;
    @XmlElement(name = "ZFLD1", required = true)
    protected String zfld1;
    @XmlElement(name = "ZFLD2", required = true)
    protected String zfld2;
    @XmlElement(name = "ZFLD3", required = true)
    protected String zfld3;
    @XmlElement(name = "ZFLD4", required = true)
    protected String zfld4;
    @XmlElement(name = "ZFLD5", required = true)
    protected String zfld5;

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
     * 获取posnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSNR() {
        return posnr;
    }

    /**
     * 设置posnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSNR(String value) {
        this.posnr = value;
    }

    /**
     * 获取matnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * 设置matnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
    }

    /**
     * 获取kwmeng属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKWMENG() {
        return kwmeng;
    }

    /**
     * 设置kwmeng属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKWMENG(BigDecimal value) {
        this.kwmeng = value;
    }

    /**
     * 获取vrkme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRKME() {
        return vrkme;
    }

    /**
     * 设置vrkme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRKME(String value) {
        this.vrkme = value;
    }

    /**
     * 获取zzprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZZPRICE() {
        return zzprice;
    }

    /**
     * 设置zzprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZZPRICE(BigDecimal value) {
        this.zzprice = value;
    }

    /**
     * 获取zzdisprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZZDISPRICE() {
        return zzdisprice;
    }

    /**
     * 设置zzdisprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZZDISPRICE(BigDecimal value) {
        this.zzdisprice = value;
    }

    /**
     * 获取zzcurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZCURRENCY() {
        return zzcurrency;
    }

    /**
     * 设置zzcurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZCURRENCY(String value) {
        this.zzcurrency = value;
    }

    /**
     * 获取zfld1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLD1() {
        return zfld1;
    }

    /**
     * 设置zfld1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLD1(String value) {
        this.zfld1 = value;
    }

    /**
     * 获取zfld2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLD2() {
        return zfld2;
    }

    /**
     * 设置zfld2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLD2(String value) {
        this.zfld2 = value;
    }

    /**
     * 获取zfld3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLD3() {
        return zfld3;
    }

    /**
     * 设置zfld3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLD3(String value) {
        this.zfld3 = value;
    }

    /**
     * 获取zfld4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLD4() {
        return zfld4;
    }

    /**
     * 设置zfld4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLD4(String value) {
        this.zfld4 = value;
    }

    /**
     * 获取zfld5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLD5() {
        return zfld5;
    }

    /**
     * 设置zfld5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLD5(String value) {
        this.zfld5 = value;
    }

}
