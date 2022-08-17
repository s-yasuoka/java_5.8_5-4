public class Main{
  public static void main(String[] args){
    String title = "定期連絡";
    String address = "aa@a";
    String text = "明日は雨です。";
    email(title, address, text);
  }
  public static void email(String title, String address, String text){
    System.out.println(address + "に以下のメールを送信しました。");
    System.out.println("件名:"+title);
    System.out.println("本文:"+text);
  }
}