package MyCalendar;

public class Main {

    public static int additionOfNumberInString(String s){
        int sum=0;
        String[] arr= s.split("_");
        for(int i=0;i<arr.length;i++){
            try{
                int temp=Integer.parseInt(arr[i]);
                sum+=temp;
            }catch(NumberFormatException e){
                continue;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
       String str = "ABC_222_xyz_456_pli_111";
       int result = additionOfNumberInString(str);
       System.out.println(result);
    }
}
