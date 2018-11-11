package aopTemplate.logging;


public class Logger {
    public void printValue(Object object){
        System.out.println(object);
    }
    public void init(){
        System.out.println("init");
    }
    public void close(){
        System.out.println("close");
    }


}
