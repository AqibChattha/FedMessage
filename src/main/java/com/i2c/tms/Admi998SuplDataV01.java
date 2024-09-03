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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Admi998SuplDataV01", propOrder = {
        "msgId",
        "rltd",
        "prvs",
        "othr",
        "ptcptFile"
})
public class Admi998SuplDataV01 {

    @XmlElement(name = "MsgId")
    protected MessageReference msgId;
    @XmlElement(name = "Rltd")
    protected MessageReference rltd;
    @XmlElement(name = "Prvs")
    protected MessageReference prvs;
    @XmlElement(name = "Othr")
    protected MessageReference othr;
    @XmlElement(name = "PtcptFile", required = true)
    protected PtcptFile ptcptFile;

    /**
     * Gets the value of the msgId property.
     *
     * @return possible object is
     * {@link MessageReference }
     */
    public MessageReference getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     *
     * @param value allowed object is
     *              {@link MessageReference }
     */
    public Admi998SuplDataV01 setMsgId(MessageReference value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rltd property.
     *
     * @return possible object is
     * {@link MessageReference }
     */
    public MessageReference getRltd() {
        return rltd;
    }

    /**
     * Sets the value of the rltd property.
     *
     * @param value allowed object is
     *              {@link MessageReference }
     */
    public Admi998SuplDataV01 setRltd(MessageReference value) {
        this.rltd = value;
        return this;
    }

    /**
     * Gets the value of the prvs property.
     *
     * @return possible object is
     * {@link MessageReference }
     */
    public MessageReference getPrvs() {
        return prvs;
    }

    /**
     * Sets the value of the prvs property.
     *
     * @param value allowed object is
     *              {@link MessageReference }
     */
    public Admi998SuplDataV01 setPrvs(MessageReference value) {
        this.prvs = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     *
     * @return possible object is
     * {@link MessageReference }
     */
    public MessageReference getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     *
     * @param value allowed object is
     *              {@link MessageReference }
     */
    public Admi998SuplDataV01 setOthr(MessageReference value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the ptcptFile property.
     *
     * @return possible object is
     * {@link PtcptFile }
     */
    public PtcptFile getPtcptFile() {
        return ptcptFile;
    }

    /**
     * Sets the value of the ptcptFile property.
     *
     * @param value allowed object is
     *              {@link PtcptFile }
     */
    public Admi998SuplDataV01 setPrtryData(PtcptFile value) {
        this.ptcptFile = value;
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
