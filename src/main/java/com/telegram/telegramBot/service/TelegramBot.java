package com.telegram.telegramBot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "tumamamesminovia_bot";
    }

    @Override
    public String getBotToken() {
        return "5425472497:AAFQdL0k6bZaRix1AYTeEZMxf-0eq0EEFVQ";
    }

    @Override
    public void onUpdateReceived(Update update) {
    final Message messageTextRecived = update.getMessage();
        System.out.println("Escribieron en el bot: "+ messageTextRecived.getText());

        final long chatId = update.getMessage().getChatId();

        // se obtiene el id del usuario de telegram
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("si funciona el chat!");
    }
}
