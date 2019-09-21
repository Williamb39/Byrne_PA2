import java.util.Scanner;

public class topics {

public static void main(String args[]) 
{
 Scanner Scanner = new Scanner(System.in);
 String[] topics = new String[] { "Family", "Friends", "Faith", "Work", "School" };
                                    
    
 int[][] points = new int[5][10];
 float[] sum = new float[5];
 float[] average = new float[5];
 int n;
 float highest=Float.MIN_VALUE,lowest=Float.MAX_VALUE;
 int min_index=-1,max_index=-1;


System.out.println("Enter the number of participants:");
n = Scanner.nextInt();
System.out.print("Enter your ratings for the topics from 1 to 10: ");

for (int i = 0; i < 5; ++i) 
   {
      System.out.print(topics[i] + " ");
      if (i == 4)
      System.out.println();
    }

 for (int i = 0; i < n; ++i) 
   {
     points[0][i] = Scanner.nextInt();
     points[1][i] = Scanner.nextInt();
     points[2][i] = Scanner.nextInt();
     points[3][i] = Scanner.nextInt();
     points[4][i] = Scanner.nextInt();
   }

 for (int i = 0; i < n; ++i) 
   {
     sum[0] += points[0][i];
     sum[1] += points[1][i];
     sum[2] += points[2][i];
     sum[3] += points[3][i];
     sum[4] += points[4][i];
   }

for(int i=0;i<5;++i)
  {
    average[i] = sum[i] / n;
  }

System.out.println();
System.out.print(String.format("%-15s", "Topics"));
 
 for (int i = 1; i <=n; ++i) 
  {
    String s = "User " + i;
    System.out.print(String.format("%-7s", s));
  }

 System.out.println("Average");

 for (int i = 0; i < 5; ++i) 
   {
     System.out.print(String.format("%-15s", topics[i]));
     
     for (int j = 0; j < n; ++j) 
       {
         System.out.print(String.format("%-7s", points[i][j]));
        }
     
     if(average[i]>highest)
       {
         max_index=i;
         highest=average[i];
        }
       
       if(average[i]<lowest)
         {
           min_index=i;
           lowest=average[i];
          }

       System.out.print(average[i]);
       System.out.println();
       
    }
   
   System.out.println();
   System.out.println(topics[max_index]+" is the topic with the highest rating of "+ highest);
   System.out.println("and...");
   System.out.println(topics[min_index] + " is the topic with the lowest rating of " + lowest);

 }
}