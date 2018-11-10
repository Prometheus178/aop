package logging;

import objects.Service;
import org.springframework.stereotype.Component;


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
