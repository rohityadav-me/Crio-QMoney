package com.crio.warmup.stock.dto;

import java.io.IOException;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;

public class AlphavantageKeyDeserializer extends KeyDeserializer{

    @Override
    public LocalDate deserializeKey(String key, DeserializationContext ctxt) throws IOException {
      // TODO Auto-generated method stub
      return LocalDate.parse(key);
    }
    
  }