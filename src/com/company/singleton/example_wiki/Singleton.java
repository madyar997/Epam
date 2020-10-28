package com.company.singleton.example_wiki;

public class Singleton {
  // Приватное статическое поле самого себя
  // static приналежит классу и существует в ед экзамеляре
  // private нельзя сов-ть доступ снаружи

  private static Singleton instance;
  //приватный конс-ор доступ снаружи невозможен. Вызвать конструктор можно только измнутри
  private Singleton () {};

  public static Singleton getInstance() {
    //Если объект не проинициалзирован инициализиурем его
    if (instance == null) {
      // Память выделиться только один раз, только в том случае если обьект до этого не ыл инициализрваон
      instance = new Singleton();
    }
    //а если уже проиници-ан то выдаем ссылку на имеющиейся объект
    return instance;
  }
}