package com.codecool.singleton;

/**
 * (Lazy) Singleton implementation.
 */
public class Singleton {
    private static Singleton instance;

    /**
     * Can't instantiate Singleton class outside the class because we set constructor private.
     */
    private Singleton(){}

    /**
     * getInstance method instantiate instance field if it hasn't been instantiated before and returns it.
     * @return Singleton Object
     */
    public Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("I am a singleton");
    }
}
