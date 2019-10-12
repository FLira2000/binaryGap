package general;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryGap {
    private int zeroCounter = 0;
    private int maxZeroCounter = 0;
    private int flag = 0;
    private int zeroFound = 0;

    private int getFlag() {
        return this.flag;
    }

    private void setFlag(int flag) {
        this.flag = flag;
    }
    
    private void setZeroCounter(int newCounter){
        this.zeroCounter = newCounter;
    }

    private int getZeroFound() {
        return this.zeroFound;
    }

    private void setZeroFound(int zeroFound) {
        this.zeroFound = zeroFound;
    }
    
    private int getZeroCounter(){
        return this.zeroCounter;
    }
    
    private void setMaxZeroCounter(int newCounter){
        this.maxZeroCounter = newCounter;
    }
    
    private int getMaxZeroCounter(){
        return this.maxZeroCounter;
    }
    
    public int execute(int N){
        if(N < 0 || N == 0) return 0;
        
        String binario = Integer.toBinaryString(N);
        List<Character> listChar = binario.chars()
            .mapToObj( e-> (char) e ).collect(Collectors.toList());
        
        listChar.forEach((bit) -> {
           if(bit == '1' && getFlag() == 0){
                setZeroCounter(0);
                setZeroFound(0);
                setFlag(1);
            }else if(bit == '0'){
                setZeroCounter(getZeroCounter() + 1);
            }else if(bit == '1' && getFlag() == 1){
                if(getZeroFound() == 0)
                    setFlag(0);
                if(getZeroCounter() > getMaxZeroCounter())
                    setMaxZeroCounter(getZeroCounter());
            }
        });
        
        return getMaxZeroCounter();
    }
}
