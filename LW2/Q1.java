public class Q1 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=10; i<50; i++){
            if(count<10){
                System.out.print(i+" ");
                count++;
            }else{
                System.out.println();
                System.out.print(i+" ");
                count=1;
            }
        }
    }
}







//public class Q1 {
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 10; i <= 49; i++) {
//            System.out.print(i + " ");
//            count++;
//            if (count == 10) {
//                System.out.println();
//                count = 0;
//            }
//        }
//    }
//}







//public class Q1 {
//    public static void main(String[] args) {
//        for(int i=10; i<=49; i++){
//            System.out.print(i + " ");
//            if(i%10 == 9)
//                System.out.println();
//        }
//    }
//}
