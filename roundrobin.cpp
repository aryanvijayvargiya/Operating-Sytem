#include<iostream>
using namespace std;
int found(int ,int[],int);
main()
{
	int n,quantum;
	cout<<"Enter the number of processes\n";
	cin>>n;
	int bt[n];
	cout<<"Enter burst time for each process\n";
	for(int i=0;i<n;i++)
	cin>>bt[i];
	cout<<"Enter quantum time\n";
	cin>>quantum;
	found(n,bt,quantum);
	
}
int found(int n,int bt[],int quantum)
{
	int wt[n],rembt[n];
for(int i=0;i<n;i++)
rembt[i]=bt[i];
int t=0;
while(true)
{
bool done=true;
for(int i=0;i<n;i++)
{

if(rembt[i]>0)
{
done=false;
{if(rembt[i]>quantum)
			{t=t+quantum;
			rembt[i]=rembt[i]-quantum;}
			else
			{
			t=t+rembt[i];
			rembt[i]=0;
			wt[i]=t-bt[i];}}

}
}
if(done==true)
break;
}
int tat[n];
for(int i=0;i<n;i++)
tat[i]=wt[i]+bt[i];

for(int j=0;j<n;j++)
cout<<"Waiting Time of process "<<j+1<<" is "<<wt[j]<<" and Turnaround Time is "<<tat[j]<<endl;

}
