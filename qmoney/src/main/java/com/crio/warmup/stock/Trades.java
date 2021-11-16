package com.crio.warmup.stock;

public class Trades {
    public String symbol;
    public int quantity;
    public String tradeType;
    public String purchaseDate;

    public Trades(){
    }

    public Trades(String symbol, int quantity, String tradeType, String purchaseDate){
        this.symbol = symbol;
        this.quantity = quantity;
        this.tradeType = tradeType;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString(){
        return "symbol : "+this.symbol + " quantity : "+this.quantity+" tradeType : "+this.tradeType+" purchase date : "+purchaseDate;
    }
}