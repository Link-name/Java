package Leson_2;
import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());// создаем переменную ( и указываем тип класса где мы делаем логирование)
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt"); // тут выводит в вайл все ошибки, ввывод в консоль ConsoleHendelr 
        //logger.addHandler(ch);
        logger.addHandler(fh); // аргумент для логера (что бы было понятно куда отправлять сообщение)
        
        SimpleFormatter sFormat = new SimpleFormatter();// создать или описать формат в котором будет выводиться сообщение
        //XMLFormatter xml = new XMLFormatter(); // xml форма
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml); //
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1"); // показывает уровень сообщения и то сообщение которое нужно показать
        logger.info("Тестовое логирование 2");// запись без флага

    }
}







