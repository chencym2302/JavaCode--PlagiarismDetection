

public class wangdongyue{

   public static void main(String[] args){
     //��3�����е����ֵ
     int a = 19 ;
     int b = 18 ;
     int c = 20;
     //1 �ҳ������������е����ֵ
      int max = a>b?a:b;
     //2 ��1�е����ֵ�͵�3�����Ƚϣ���ȡ���ֵ
      max = max > c ? max : c ;
      System.out.println(max);

      if (a>b ){
         max = a ;
     } else {
         max = b ;
     }
      if (max < c) {
         max = c ;
      }
      System.out.println(max);

      //�жϳɼ��ȼ�������ɼ���90������ A  70-90 B  60-70 C  <60  D
     int score =55 ;
     if (score>=90){
         System.out.println('A');
     } else if (score>=70 ){
          System.out.println('B');
     }  else if(score >= 60){
           System.out.println('C');                                       
     }  else {
           System.out.println('D');      

      }
 
      // �����ַ� A B C D�����������Χ?
      char  degree = 'B';
      if (degree=='A'){
         System.out.println("score>=90");
     } else if (degree=='B'){
          System.out.println("score>=70");
     }  else if(degree=='C'){
           System.out.println("score >= 60");                                       
     }  else{
           System.out.println("score<60"); 
     }
   }  //main


}  //class