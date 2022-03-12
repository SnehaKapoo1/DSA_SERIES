package questions;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class HelpMLA2{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int m1 = sc.nextInt();
  int m2 = sc.nextInt();
  int n = sc.nextInt();
  int[] village = new int[n];
  for(int i=0; i<n; i++){
   village[i] = sc.nextInt();
  }

  Arrays.sort(village);
  ArrayList<Integer> l1 = new ArrayList<>();
  ArrayList<Integer> l2 = new ArrayList<>();

  int i=0;
  int j = n-1;
  while(i <= j){
   if(i==j){
    l1.add(village[i]);
    break;
   }
   l1.add(village[i]);
   l1.add(village[j]);
   i++;
   j--;

   l2.add(village[i]);
   l2.add(village[j]);
   i++;
   j--;
  }

  for(int f=0; f<l1.size(); f++){
   System.out.print(l1.get(f) + " ");
  }

  System.out.println();

  for(int s=0; s<l2.size(); s++){
   System.out.print(l2.get(s) + " ");
  }
 }
}