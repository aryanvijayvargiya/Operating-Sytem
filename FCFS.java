import java.util.Scanner;        //importing scanner file
class FCFS
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of process");
int n=sc.nextInt();    
int at[]=new int[5];            //declaring array at for arrival time
int et[]=new int[5];            //declaring array et for execution time 
int ct[]=new int[5];            //declaring array ct for completion time
int tat[]=new int[5];            //declaring array tat for turnaroundtime 
int wt[]=new int[5];            //declaring array wt for waiting time
for(int i=1;i<=n;i++)
{
	System.out.println("Enter the details of process"+i);   //details of the processes
	System.out.println("Enter the arrival time");
	at[i]=sc.nextInt();
	System.out.println("Enter the execution time");
	et[i]=sc.nextInt();
}
for(int h=1;h<=n;h++)
	System.out.println("Arrival time of process "+h+ " is "+at[h]);

for(int b=1;b<=n;b++)
	System.out.println("Execution time of process "+b+" is "+et[b]);

for(int j=1;j<=n;j++)
{
if(ct[j-1]>at[j])                                       //condition for completion time              
{
ct[j]=ct[j-1]+et[j];                                    //completion time = completion time of previous process + execution time of current process
System.out.println("Completion time of process "+j+" is "+ct[j]);
}
else
{
ct[j]=et[j]+at[j];
System.out.println("Completion time of process "+j+" is "+ct[j]);
}}
for(int k=1;k<=n;k++)
{
tat[k]=ct[k]-at[k];                                    //turn around time = completion time - arrival time
System.out.println("Turn around time of process "+k+" is "+tat[k]);
}
for(int v=1;v<=n;v++)
{
wt[v]=tat[v]-et[v];                                   //waiting time = turn around time - execution time
System.out.println("Waiting time of process " + v + " is "+ wt[v]);
}
}
}
