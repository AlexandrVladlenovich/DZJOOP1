package HumanAnimal;

public class HumanAnimal {

    public static void main(String[] args) {
    
    MyLog log = new MyLog();
    Human man = new Human();
    Cat cat = new Cat("Barsik");
    log.appendToLog(man.callCat("kis-kis"));
    log.appendToLog(cat.listenHuman(man.callCat("kis-kis")));
    log.appendToLog(man.callCat("Hello, Barsik!"));
    log.appendToLog(cat.listenHuman(man.callCat("Hello, Barsik!")));
    log.appendToLog(man.touchCat());
    log.appendToLog(cat.sayMur());
    
    log.viewEvents();
}

}