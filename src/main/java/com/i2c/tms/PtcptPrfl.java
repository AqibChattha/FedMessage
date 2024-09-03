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
@XmlType(name = "PtcptPrfl", propOrder = {
        "id",
        "nm",
        "svcs"
})
public class PtcptPrfl {

    @XmlElement(name = "Id")
    private String id;

    @XmlElement(name = "Nm")
    private String nm;

    @XmlElement(name = "Svcs")
    private List<String> svcs;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public PtcptPrfl setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public PtcptPrfl setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the svcs property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */

    public List<String> getSvcs() {
        return svcs;
    }

    public PtcptPrfl setSvcs(List<String> svcs) {
        this.svcs = svcs;
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