/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rr;

import java.util.Scanner;

/**
 *
 * @author lily ahmed
 */
public class RR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,q,count=0,temp,At[],sq=0,bt[],wt[],tt[],rem_bt[],rem_At[];  
float awt=0,atat=0; 
At= new int[10];
bt = new int[10];  
wt = new int[10];  
tt = new int[10];  
rem_bt = new int[10];  
rem_At= new int [10];
Scanner s=new Scanner(System.in);  
System.out.print("Enter the number of process (maximum 10) = ");  
n = s.nextInt();  
System.out.print("Enter the burst time of the process\n");  
for (i=0;i<n;i++)  
{  
System.out.print("P"+i+" = ");   
bt[i] = s.nextInt();  
rem_bt[i] = bt[i];  
}  
System.out.print("Enter the Arrival time of the process\n");
for (i=0;i<n;i++)  
{  
System.out.print("P"+i+" = ");   
At[i] = s.nextInt();  
rem_At[i] = At[i];  
}  
System.out.print("Enter the quantum time: ");  
q = s.nextInt();  
while(true)  
{  
for (i=0,count=0;i<n;i++)  
{  
temp = q;  
if(rem_bt[i] == 0)  
{  
count++;  
continue;  
}  
if(rem_bt[i]>q)  
rem_bt[i]= rem_bt[i] - q;  
else  
if(rem_bt[i]>=0)  
{  
temp = rem_bt[i];  
rem_bt[i] = 0;  
}  
sq = sq + temp;  
tt[i] = sq;  
}  
if(n == count)  
break;  
}  
System.out.print("--------------------------------------------------------------------------------");  
System.out.print("\nProcess\t    Arrival Time\t     Burst Time\t       Turnaround Time\t          Waiting Time\n");  
System.out.print("--------------------------------------------------------------------------------");  
for(i=0;i<n;i++)  
{ 

wt[i]=tt[i]-bt[i];  
awt=awt+wt[i];  
atat=atat+tt[i];  
System.out.print("\n "+(i+1)+"\t" + At[i]+"\t\t " +"\t "+bt[i]+"\t\t "+tt[i]+"\t\t "+wt[i]+"\n");  
}  
awt=awt/n;  
atat=atat/n;  
System.out.println("\nAverage waiting Time = "+awt+"\n");  
System.out.println("Average turnaround time = "+atat);  
}   
    }
    

