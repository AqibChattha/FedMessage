package com.i2c.tms;
import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtcptFile", propOrder = {
        "bizDay",
        "ptcptPrfl"
})
public class PtcptFile {

    @XmlElement(name = "BizDay", required = true)
    private String bizDay;
    @XmlElement(name = "PtcptPrfl", required = true)
    private List<PtcptPrfl> ptcptPrfl;



    /**
     * Gets the value of the bizDay property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBizDay() {
        return bizDay;
    }

    /**
     * Sets the value of the bizDay property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public PtcptFile setBizDay(String value) {
        this.bizDay = value;
        return this;
    }

    /**
     * Gets the value of the ptcptPrfl property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcptPrfl property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtcptPrfl().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtcptPrfl }
     *
     *
     */
    public List<PtcptPrfl> getPtcptPrfl() {
        return ptcptPrfl;
    }

    public PtcptFile setPtcptPrfl(List<PtcptPrfl> ptcptPrfl) {
        this.ptcptPrfl = ptcptPrfl;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}