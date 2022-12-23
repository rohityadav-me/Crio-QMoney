
package com.crio.warmup.stock.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlphavantageDailyResponse {

  @JsonProperty(value = "Time Series (Daily)")
  @JsonDeserialize(keyUsing = AlphavantageKeyDeserializer.class)
  private Map<LocalDate, AlphavantageCandle> candles;

  public Map<LocalDate, AlphavantageCandle> getCandles() {
    return candles;
  }

  public void setCandles(
      Map<LocalDate, AlphavantageCandle> candles) {
    this.candles = candles;
  }
}
