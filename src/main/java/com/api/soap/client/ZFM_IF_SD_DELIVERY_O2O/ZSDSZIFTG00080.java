
package com.api.soap.client.ZFM_IF_SD_DELIVERY_O2O;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ZSDS_ZIFTG00080 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ZSDS_ZIFTG00080"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BSTKD" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="KUNNR" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ZZREORDSN" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="AUART" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="AUGRU" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="VKORG" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="VTWEG" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="ERDAT" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="ERZET" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="ZZAGENT" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZLYTYPE" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ZZDEALCODE" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="BSTDK" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="ZZNICKNAME" type="{urn:sap-com:document:sap:rfc:functions}char60"/&gt;
 *         &lt;element name="WERKS" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="LGORT" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ZZPAYNAME" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZPAYCODE" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZRECEIVER" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="ZZCOUNTRY" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZPROVINCE" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZCITY" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZDISTRICT" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZFULLADDR" type="{urn:sap-com:document:sap:rfc:functions}char200"/&gt;
 *         &lt;element name="ZZADDR" type="{urn:sap-com:document:sap:rfc:functions}char200"/&gt;
 *         &lt;element name="ZZPOSTAL" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ZZTEL" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="ZZMOBIEL" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="ZZEMAIL" type="{urn:sap-com:document:sap:rfc:functions}char241"/&gt;
 *         &lt;element name="ZZCARRCODE" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZCARRNAME" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ZZSHIPCOST" type="{urn:sap-com:document:sap:rfc:functions}curr13.2"/&gt;
 *         &lt;element name="ZZCURRENCY" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="ZFLH1" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ZFLH2" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ZFLH3" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ZFLH4" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ZFLH5" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZSDS_ZIFTG00080", propOrder = {
    "bstkd",
    "kunnr",
    "zzreordsn",
    "auart",
    "augru",
    "vkorg",
    "vtweg",
    "erdat",
    "erzet",
    "zzagent",
    "zzlytype",
    "zzdealcode",
    "bstdk",
    "zznickname",
    "werks",
    "lgort",
    "zzpayname",
    "zzpaycode",
    "zzreceiver",
    "zzcountry",
    "zzprovince",
    "zzcity",
    "zzdistrict",
    "zzfulladdr",
    "zzaddr",
    "zzpostal",
    "zztel",
    "zzmobiel",
    "zzemail",
    "zzcarrcode",
    "zzcarrname",
    "zzshipcost",
    "zzcurrency",
    "zflh1",
    "zflh2",
    "zflh3",
    "zflh4",
    "zflh5"
})
public class ZSDSZIFTG00080 {

    @XmlElement(name = "BSTKD", required = true)
    protected String bstkd;
    @XmlElement(name = "KUNNR", required = true)
    protected String kunnr;
    @XmlElement(name = "ZZREORDSN", required = true)
    protected String zzreordsn;
    @XmlElement(name = "AUART", required = true)
    protected String auart;
    @XmlElement(name = "AUGRU", required = true)
    protected String augru;
    @XmlElement(name = "VKORG", required = true)
    protected String vkorg;
    @XmlElement(name = "VTWEG", required = true)
    protected String vtweg;
    @XmlElement(name = "ERDAT", required = true)
    protected String erdat;
    @XmlElement(name = "ERZET", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar erzet;
    @XmlElement(name = "ZZAGENT", required = true)
    protected String zzagent;
    @XmlElement(name = "ZZLYTYPE", required = true)
    protected String zzlytype;
    @XmlElement(name = "ZZDEALCODE", required = true)
    protected String zzdealcode;
    @XmlElement(name = "BSTDK", required = true)
    protected String bstdk;
    @XmlElement(name = "ZZNICKNAME", required = true)
    protected String zznickname;
    @XmlElement(name = "WERKS", required = true)
    protected String werks;
    @XmlElement(name = "LGORT", required = true)
    protected String lgort;
    @XmlElement(name = "ZZPAYNAME", required = true)
    protected String zzpayname;
    @XmlElement(name = "ZZPAYCODE", required = true)
    protected String zzpaycode;
    @XmlElement(name = "ZZRECEIVER", required = true)
    protected String zzreceiver;
    @XmlElement(name = "ZZCOUNTRY", required = true)
    protected String zzcountry;
    @XmlElement(name = "ZZPROVINCE", required = true)
    protected String zzprovince;
    @XmlElement(name = "ZZCITY", required = true)
    protected String zzcity;
    @XmlElement(name = "ZZDISTRICT", required = true)
    protected String zzdistrict;
    @XmlElement(name = "ZZFULLADDR", required = true)
    protected String zzfulladdr;
    @XmlElement(name = "ZZADDR", required = true)
    protected String zzaddr;
    @XmlElement(name = "ZZPOSTAL", required = true)
    protected String zzpostal;
    @XmlElement(name = "ZZTEL", required = true)
    protected String zztel;
    @XmlElement(name = "ZZMOBIEL", required = true)
    protected String zzmobiel;
    @XmlElement(name = "ZZEMAIL", required = true)
    protected String zzemail;
    @XmlElement(name = "ZZCARRCODE", required = true)
    protected String zzcarrcode;
    @XmlElement(name = "ZZCARRNAME", required = true)
    protected String zzcarrname;
    @XmlElement(name = "ZZSHIPCOST", required = true)
    protected BigDecimal zzshipcost;
    @XmlElement(name = "ZZCURRENCY", required = true)
    protected String zzcurrency;
    @XmlElement(name = "ZFLH1", required = true)
    protected String zflh1;
    @XmlElement(name = "ZFLH2", required = true)
    protected String zflh2;
    @XmlElement(name = "ZFLH3", required = true)
    protected String zflh3;
    @XmlElement(name = "ZFLH4", required = true)
    protected String zflh4;
    @XmlElement(name = "ZFLH5", required = true)
    protected String zflh5;

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
     * 获取kunnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUNNR() {
        return kunnr;
    }

    /**
     * 设置kunnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUNNR(String value) {
        this.kunnr = value;
    }

    /**
     * 获取zzreordsn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZREORDSN() {
        return zzreordsn;
    }

    /**
     * 设置zzreordsn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZREORDSN(String value) {
        this.zzreordsn = value;
    }

    /**
     * 获取auart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUART() {
        return auart;
    }

    /**
     * 设置auart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUART(String value) {
        this.auart = value;
    }

    /**
     * 获取augru属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUGRU() {
        return augru;
    }

    /**
     * 设置augru属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUGRU(String value) {
        this.augru = value;
    }

    /**
     * 获取vkorg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKORG() {
        return vkorg;
    }

    /**
     * 设置vkorg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKORG(String value) {
        this.vkorg = value;
    }

    /**
     * 获取vtweg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTWEG() {
        return vtweg;
    }

    /**
     * 设置vtweg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTWEG(String value) {
        this.vtweg = value;
    }

    /**
     * 获取erdat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERDAT() {
        return erdat;
    }

    /**
     * 设置erdat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERDAT(String value) {
        this.erdat = value;
    }

    /**
     * 获取erzet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getERZET() {
        return erzet;
    }

    /**
     * 设置erzet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setERZET(XMLGregorianCalendar value) {
        this.erzet = value;
    }

    /**
     * 获取zzagent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZAGENT() {
        return zzagent;
    }

    /**
     * 设置zzagent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZAGENT(String value) {
        this.zzagent = value;
    }

    /**
     * 获取zzlytype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZLYTYPE() {
        return zzlytype;
    }

    /**
     * 设置zzlytype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZLYTYPE(String value) {
        this.zzlytype = value;
    }

    /**
     * 获取zzdealcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDEALCODE() {
        return zzdealcode;
    }

    /**
     * 设置zzdealcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDEALCODE(String value) {
        this.zzdealcode = value;
    }

    /**
     * 获取bstdk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSTDK() {
        return bstdk;
    }

    /**
     * 设置bstdk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSTDK(String value) {
        this.bstdk = value;
    }

    /**
     * 获取zznickname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZNICKNAME() {
        return zznickname;
    }

    /**
     * 设置zznickname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZNICKNAME(String value) {
        this.zznickname = value;
    }

    /**
     * 获取werks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKS() {
        return werks;
    }

    /**
     * 设置werks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKS(String value) {
        this.werks = value;
    }

    /**
     * 获取lgort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGORT() {
        return lgort;
    }

    /**
     * 设置lgort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGORT(String value) {
        this.lgort = value;
    }

    /**
     * 获取zzpayname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPAYNAME() {
        return zzpayname;
    }

    /**
     * 设置zzpayname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPAYNAME(String value) {
        this.zzpayname = value;
    }

    /**
     * 获取zzpaycode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPAYCODE() {
        return zzpaycode;
    }

    /**
     * 设置zzpaycode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPAYCODE(String value) {
        this.zzpaycode = value;
    }

    /**
     * 获取zzreceiver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZRECEIVER() {
        return zzreceiver;
    }

    /**
     * 设置zzreceiver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZRECEIVER(String value) {
        this.zzreceiver = value;
    }

    /**
     * 获取zzcountry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZCOUNTRY() {
        return zzcountry;
    }

    /**
     * 设置zzcountry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZCOUNTRY(String value) {
        this.zzcountry = value;
    }

    /**
     * 获取zzprovince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPROVINCE() {
        return zzprovince;
    }

    /**
     * 设置zzprovince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPROVINCE(String value) {
        this.zzprovince = value;
    }

    /**
     * 获取zzcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZCITY() {
        return zzcity;
    }

    /**
     * 设置zzcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZCITY(String value) {
        this.zzcity = value;
    }

    /**
     * 获取zzdistrict属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDISTRICT() {
        return zzdistrict;
    }

    /**
     * 设置zzdistrict属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDISTRICT(String value) {
        this.zzdistrict = value;
    }

    /**
     * 获取zzfulladdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZFULLADDR() {
        return zzfulladdr;
    }

    /**
     * 设置zzfulladdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZFULLADDR(String value) {
        this.zzfulladdr = value;
    }

    /**
     * 获取zzaddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZADDR() {
        return zzaddr;
    }

    /**
     * 设置zzaddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZADDR(String value) {
        this.zzaddr = value;
    }

    /**
     * 获取zzpostal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPOSTAL() {
        return zzpostal;
    }

    /**
     * 设置zzpostal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPOSTAL(String value) {
        this.zzpostal = value;
    }

    /**
     * 获取zztel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZTEL() {
        return zztel;
    }

    /**
     * 设置zztel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZTEL(String value) {
        this.zztel = value;
    }

    /**
     * 获取zzmobiel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZMOBIEL() {
        return zzmobiel;
    }

    /**
     * 设置zzmobiel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZMOBIEL(String value) {
        this.zzmobiel = value;
    }

    /**
     * 获取zzemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZEMAIL() {
        return zzemail;
    }

    /**
     * 设置zzemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZEMAIL(String value) {
        this.zzemail = value;
    }

    /**
     * 获取zzcarrcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZCARRCODE() {
        return zzcarrcode;
    }

    /**
     * 设置zzcarrcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZCARRCODE(String value) {
        this.zzcarrcode = value;
    }

    /**
     * 获取zzcarrname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZCARRNAME() {
        return zzcarrname;
    }

    /**
     * 设置zzcarrname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZCARRNAME(String value) {
        this.zzcarrname = value;
    }

    /**
     * 获取zzshipcost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZZSHIPCOST() {
        return zzshipcost;
    }

    /**
     * 设置zzshipcost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZZSHIPCOST(BigDecimal value) {
        this.zzshipcost = value;
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
     * 获取zflh1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLH1() {
        return zflh1;
    }

    /**
     * 设置zflh1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLH1(String value) {
        this.zflh1 = value;
    }

    /**
     * 获取zflh2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLH2() {
        return zflh2;
    }

    /**
     * 设置zflh2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLH2(String value) {
        this.zflh2 = value;
    }

    /**
     * 获取zflh3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLH3() {
        return zflh3;
    }

    /**
     * 设置zflh3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLH3(String value) {
        this.zflh3 = value;
    }

    /**
     * 获取zflh4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLH4() {
        return zflh4;
    }

    /**
     * 设置zflh4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLH4(String value) {
        this.zflh4 = value;
    }

    /**
     * 获取zflh5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZFLH5() {
        return zflh5;
    }

    /**
     * 设置zflh5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZFLH5(String value) {
        this.zflh5 = value;
    }

}
