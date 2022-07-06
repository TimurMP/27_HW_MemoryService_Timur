package telran.array.tools;

public class MemoryService {
    public static int getMaxArrayMemory(){
        int [] arr;


        int l = 0;
        int r = Integer.MAX_VALUE;
        int mid = 0;

        for (int i = 0; i < 32; i++) {
            if (l+r > 0){
                mid = (-(l+r)-2)/2;

            }
            if (l+r<0){
                mid = l+r/2;
            }
            System.out.println("mid" + mid);
            try {
                arr = new int[mid];
                l = mid+1;
                System.out.println(mid);


            } catch (OutOfMemoryError e) {
                r = mid-1;
                l = mid + mid/2;


            }

        }




//        for (int i = 0; i < 32; i++) {
//            int temp = 0;
//            temp = temp+(arrSize/2);
//
//            System.out.println(i);
//            try {
//
//                arr = new int[temp];
//                arrSize = arrSize/2;
//
//
//                System.out.println(temp);
//
//
//            }catch (OutOfMemoryError e){
//
//                arrSize = arrSize/2;
//                System.out.println("VM limit");
//            }
//
//        }
        return mid-1;
    }
}
