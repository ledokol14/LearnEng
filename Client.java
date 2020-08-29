package sample;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> checkForMatches = new HashMap<>();

        checkForMatches.put("Молоко","Milk");
        checkForMatches.put("Окно","Window");
        checkForMatches.put("Деньги","Money");
        checkForMatches.put("Дом","House");
        checkForMatches.put("Холодильник","Refrigerator");
        checkForMatches.put("Стол","Table");
        checkForMatches.put("Лошадь","Horse");
        checkForMatches.put("Кот","Cat");
        checkForMatches.put("Стена","Wall");
        checkForMatches.put("Диван","Sofa");
        checkForMatches.put("Учитель","Teacher");
        checkForMatches.put("Брюки","Pants");
        checkForMatches.put("Розетка","Power socket");
        checkForMatches.put("Пылесос","Vacuum cleaner");
        checkForMatches.put("Куртка","Jacket");
        checkForMatches.put("Орех","Nut");
        checkForMatches.put("Вода","Water");
        checkForMatches.put("Человек","People");
        checkForMatches.put("Ночь","Night");
        checkForMatches.put("Бруноям","Brunoyam");
        
        int min = 0;
        int max = 19;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        System.out.println("Напиши перевод слова "+ checkForMatches.values().toArray()[i]+"");

        String word =scanner.next();


        int points = 0;
        int a = 0;

        if (word.equals(checkForMatches.keySet().toArray()[i]))
        {
            a++;
            points = points + a;
            System.out.println("Верно! Количество очков: "+points+". Слов переведенных подряд: "+a+"");
        }
        else{
            a=0;
            System.out.println("Не правильно=( Количество очков: "+points+"");
        }

    }

    }

