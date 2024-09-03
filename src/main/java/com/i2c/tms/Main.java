package com.i2c.tms;

import com.prowidesoftware.swift.model.mx.*;
import com.prowidesoftware.swift.model.mx.dic.SupplementaryDataEnvelope1;
import com.prowidesoftware.swift.utils.Lib;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, JAXBException, ExecutionException {
        String resource = Lib.readFile("C:\\Users\\AQIB\\Documents\\GitHub\\FedMessage\\src\\main\\resources\\admi998.xml");

//        JaxbContextLoader.INSTANCE.setCacheImpl(new JaxbContextCacheImpl());
//        JaxbContextLoader.INSTANCE.get(MxAdmi99800102.class, MxAdmi99800102._classes);
//        List<Class> classes = new ArrayList<>(Arrays.stream(MxAdmi99800102._classes).toList());
//        classes.addAll(Arrays.asList(MxInnerDocument.class, Admi998SuplDataV01.class, PtcptFile.class, PtcptPrfl.class));
//
//        // classes list to new array
//        Class[] classesArray = new Class[classes.size()];
//        classesArray = classes.toArray(classesArray);
//
////        JaxbContextLoader.INSTANCE.get(SupplementaryDataEnvelope1.class, classesArray);

        MxAdmi99800102 mx = new MxAdmi99800102(resource);

        List<String> any = SupplementaryDataUtils.extract(resource);

        MxInnerDocument mxInnerDocument = new MxInnerDocument(any.get(0));



        mx.getAdmstnPrtryMsg().getPrtryData().getData().setAny(mxInnerDocument.element(JAXBContext.newInstance(MxInnerDocument._classes)));

//        MxWriteConfiguration mxWriteConfiguration = new MxWriteConfiguration(JAXBContext.newInstance(classesArray));
//        MxReadConfiguration mxReadConfiguration = new MxReadConfiguration();

        System.out.println(mx.message());
    }
}