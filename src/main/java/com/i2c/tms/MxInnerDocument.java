package com.i2c.tms;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.dic.SupplementaryDataEnvelope1;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
        "admi998SuplDataV01"
})
@XmlRootElement(name = "Document", namespace = "urn:fed:xsd:admi.998.001.02")
public class MxInnerDocument
        extends com.prowidesoftware.swift.model.mx.AbstractMX {

    @XmlElement(name = "admi998SuplDataV01")
    protected Admi998SuplDataV01 admi998SuplDataV01;
    public static final transient String BUSINESS_PROCESS = "admi";
    public static final transient int FUNCTIONALITY = 998;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {SupplementaryDataEnvelope1.class, Admi998SuplDataV01.class, PtcptFile.class, MxInnerDocument.class, PtcptPrfl .class };
    public static final transient String NAMESPACE = "urn:fed:xsd:admi.998.001.02";

    public MxInnerDocument() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     *
     */
    public MxInnerDocument(final String xml) {
        this();
        MxInnerDocument tmp = parse(xml);
        admi998SuplDataV01 = tmp.getAdmi998SuplDataV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     *
     */
    public MxInnerDocument (final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the admi998SuplDataV01 property.
     *
     * @return
     *     possible object is
     *     {@link Admi998SuplDataV01 }
     *
     */
    public Admi998SuplDataV01 getAdmi998SuplDataV01() {
        return admi998SuplDataV01;
    }

    /**
     * Sets the value of the admi998SuplDataV01 property.
     *
     * @param value
     *     allowed object is
     *     {@link Admi998SuplDataV01 }
     *
     */
    public MxInnerDocument seMxInnerDocument(Admi998SuplDataV01 value) {
        this.admi998SuplDataV01 = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     *
     */
    public static MxInnerDocument parse(String xml) {
        return ((MxInnerDocument) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxInnerDocument .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     *
     */
    public static MxInnerDocument parse(String xml, MxReadConfiguration conf) {
        return ((MxInnerDocument) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxInnerDocument .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     *
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxInnerDocument parse(String xml, MxRead parserImpl) {
        return ((MxInnerDocument) parserImpl.read(MxInnerDocument .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxInnerDocument messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     *
     * @since 7.10.2
     *
     * @param json a JSON representation of an MxInnerDocument message
     * @return
     *     a new instance of MxInnerDocument
     */
    public static final MxInnerDocument fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxInnerDocument .class);
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
