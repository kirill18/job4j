package ru.job4j.counter;

public class Counter {

      public int add(int start, int finish) {
          for (; finish >= start; start++) {
              if (start % 2 == 1) {
                  continue;
              }
              System.out.println("значение" +start);
          }
          start--;
          // Найдем сумму арифметической прогрессии
          return ((2 + finish) * start / 2)/ 2;
      }
}