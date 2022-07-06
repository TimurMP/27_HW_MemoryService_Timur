package telran.array.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryServiceTest {
    int [] arr;

    @Test
    void getMaxArrayMemory() {

        int maxSize = MemoryService.getMaxArrayMemory();
        boolean flag;
        try {
            arr = new int[maxSize];
            flag = true;
            arr = null;

        }catch (OutOfMemoryError e){
            flag = false;
        }
        assertTrue(flag);

        try {
            arr = new int[maxSize+1];
            flag = true;
            arr = null;

        }catch (OutOfMemoryError e){
            flag = false;
        }
        assertFalse(flag);
    }


    @Test
    void temp() {
        int arrSize = 100;
        int temp = 100;
        arrSize = arrSize / 2;
        temp = arrSize/2;
        System.out.println(temp);
        arrSize = arrSize + temp;

        System.out.println(arrSize);




    }

    }