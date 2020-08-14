package com.library.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonDateSerializer extends JsonSerializer<Date> {

    private SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override

    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)

            throws IOException, JsonProcessingException {

        String value = "";

        if(null !=date){

            value = dateFormat.format(date);

        }

        gen.writeString(value);

    }
}
