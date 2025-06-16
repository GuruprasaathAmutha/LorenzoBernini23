package selvan.ponniyin.mac;

public class Practise {


    public static void main(String[] args) {


        System.out.println(flower(new int[] {1,0,0,0,1},1));
        System.out.println(flower(new int[] {1,0,0,0,1},2));
    }



    public static boolean flower(int[] bed,int n){

        int ptr=0;
        int count=0;

        while(ptr <= bed.length-1) {
            if (ptr == 0) {
                if (bed[ptr] == 0 && bed[ptr + 1] == 0) {
                    count++;
                    ptr = ptr + 2;
                } else {
                    ptr++;
                }
            } else if (ptr == bed.length - 1) {
                if (bed[ptr] == 0 && bed[ptr - 1] == 0) {
                    count++;
                }else{
                    ptr++;
                }
            } else {
                if (bed[ptr] == 0 && bed[ptr - 1] == 0 && bed[ptr + 1] == 0) {
                    count++;
                    ptr = ptr + 2;
                } else {
                    ptr++;
                }

            }
        }
        return count>=n;
    }


}
