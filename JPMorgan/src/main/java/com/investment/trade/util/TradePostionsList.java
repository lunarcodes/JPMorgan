package com.investment.trade.util;

import java.util.List;
import java.util.Map;

import com.investment.trade.model.TradePosition;
import com.investment.trade.model.TradePositionIdentifier;
import com.investment.trade.model.Trade;

public interface TradePostionsList {
	public Map<Integer, Trade> getAllTrades();

	public Trade getTradeById(Integer tradeId);

	public void addTrade(Trade trade);

	public void addPosition(TradePosition position);

	public TradePosition getPositionById(TradePositionIdentifier id);

	public Map<TradePositionIdentifier, TradePosition> getAllPositions();

	public List<TradePosition> getPositionsList();

	public TradePosition getPositionByTrade(Trade trade);

	public TradePosition getPositionByTradeNewIfNotExists(Trade trade);
}