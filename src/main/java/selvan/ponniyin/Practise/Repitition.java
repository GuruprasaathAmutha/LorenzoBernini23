package selvan.ponniyin.Practise;

public class Repitition {

    public static void main(String[] args) {
//        System.out.println(binarySearch(new int[] {1,22,333,4444,5000,5001,5077,5088,5099} ,0,9,5077 ));
//        System.out.println(binarySearch(new int[] {22,56,88,101,203,333,453,543,678} ,0,8,83423));
//        System.out.println(binarySearch(new int[] {1,22,333,4444,5000,5001,5077,5088,5099} ,0,9,5077 ));
//        System.out.println(binarySearch(new int[] {1,22,333,4444,5000,5001,5077,5088,5099} ,0,9,5077 ));
        System.out.println(removeDigit("1231", '1'));
    }

    public static String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(char c : number.toCharArray()){
            if(c != digit || flag){
                sb.append(c);
            }else{
                flag = true;
            }
        }
        return sb.toString();
    }
    public static int binarySearch(int[] arr,int start,int end,int target){
        int mid = (end + start) /2;
        if(start> end ) return -1;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid] > target){
            return binarySearch(arr,start,mid,target);
        }else {
            return binarySearch(arr,mid+1,end,target);
        }
    }
}
