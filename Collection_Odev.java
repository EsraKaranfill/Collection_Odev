package com.bilgeadam.lesson025;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Collection_Odev {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int sayi = random.nextInt(100) + 1;
            sayilar.add(sayi);
        }
        Map<Integer, Integer> kacSayiVar = new HashMap<>();
        for (int sayi : sayilar) {
            kacSayiVar.put(sayi, kacSayiVar.getOrDefault(sayi, 0) + 1);
        }
        List<Integer> sayiListesi = new ArrayList<>(kacSayiVar.keySet());

        Collections.shuffle(sayiListesi);

        List<Integer> sansliNumaralar = sayiListesi.subList(0, 10);

        System.out.println("Her sayıya karşılık gelen frekanslar:");
        System.out.println(kacSayiVar);
        System.out.println("Karıştırılmış 10 farklı sayı:");
        System.out.println(sansliNumaralar);
    }
    }

