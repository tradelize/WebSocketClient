package com.tradelize.websocket.client;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tradelize.websocket.client.dto.AllMarketsDTO;
import com.tradelize.websocket.client.dto.ArbitrationDTO;
import com.tradelize.websocket.client.dto.OrderBookDTO;
import com.tradelize.websocket.client.dto.RecentTradesDTO;
import com.tradelize.websocket.client.dto.ServerNotificationDTO;
import com.tradelize.websocket.client.dto.TickerInfoDTO;
import org.apache.log4j.Logger;

import javax.websocket.ClientEndpoint;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@ClientEndpoint
public class TradelizeClient extends Endpoint {
    private final Logger logger = Logger.getLogger(this.getClass());
    private final Gson gson = new Gson();
    private final CountDownLatch messageLatch;

    public TradelizeClient(CountDownLatch messageLatch) {
        this.messageLatch = messageLatch;
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        session.addMessageHandler((MessageHandler.Whole<ServerNotificationDTO<String>>) message -> {
            switch (message.getEvent()) {
                case ORDERBOOK:
                    OrderBookDTO orderBook = gson.fromJson(message.getData(), OrderBookDTO.class);
                    logger.info("Event: " + message.getEvent() +
                            ", exchange: " + message.getExchange() +
                            ", market: " + message.getMarket() +
                            ", data: " + orderBook);
                    break;
                case ALLMARKETS:
                    AllMarketsDTO allMarkets = gson.fromJson(message.getData(), AllMarketsDTO.class);
                    logger.info("Event: " + message.getEvent() +
                            ", market: " + message.getMarket() +
                            ", data: " + allMarkets);
                    break;
                case TICKERINFO:
                    TickerInfoDTO tickerInfo = gson.fromJson(message.getData(), TickerInfoDTO.class);
                    logger.info("Event: " + message.getEvent() +
                            ", exchange: " + message.getExchange() +
                            ", market: " + message.getMarket() +
                            ", data: " + tickerInfo);
                    break;
                case ARBITRATION:
                    ArbitrationDTO arbitration = gson.fromJson(message.getData(), ArbitrationDTO.class);
                    logger.info("Event: " + message.getEvent() +
                            ", market: " + message.getMarket() +
                            ", data: " + arbitration);
                    break;
                case RECENTTRADES:
                    Type type = new TypeToken<List<RecentTradesDTO>>() {
                    }.getType();
                    List<RecentTradesDTO> recentTrades = gson.fromJson(message.getData(), type);
                    logger.info("Event: " + message.getEvent() +
                            ", exchange: " + message.getExchange() +
                            ", market: " + message.getMarket() +
                            ", data: " + recentTrades);
                    break;
            }
            messageLatch.countDown();
        });
    }
}
