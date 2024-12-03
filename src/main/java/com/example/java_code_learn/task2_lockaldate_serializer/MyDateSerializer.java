package com.example.java_code_learn.task2_lockaldate_serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Сделал сериалайзер, но с ни тоже не работает
public class MyDateSerializer extends JsonSerializer<LocalDateTime> {
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy:MM:dd##:HH:mm:ss:SSS");

    @Override
    public void serialize(LocalDateTime date, JsonGenerator gen, SerializerProvider serializerProvider)
            throws IOException {
        gen.writeString(FORMATTER.format(date));
    }
}