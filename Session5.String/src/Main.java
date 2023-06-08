public class Main {
    public static void main(String[] args) {
       String string ="Rikkei Academy";
       //Khoi tao doi tuong

        String str = new String("Hello JV03");
        System.out.println(string);
        System.out.println(str);
        // goi phuong thuc changeString
//        String newString = changeString(string);
        System.out.println("Chuoi cu: "+ string);
//        System.out.println("chuoi moi: "+ newString);
        System.out.println("ky tu tai vi tri index=5 cua chuoi la:"+ string.charAt(5));

        String newString = string.concat("Pham Hung");
        System.out.println();
        String checkStr = string.concat(newString);
    }
    public static String changeString(String oldStr){
        oldStr ="new"+oldStr;
        return oldStr;
    }
}