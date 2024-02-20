#include<stdio.h>
#include<stdlib.h>
void main()
{
     int i,n,init,total=0;
     printf("Enter no. of disk req. : ");
     scanf("%d",&n);
     int req[n];
     printf("Enter disk req queue : ");
     for (i=0;i<n;i++)
          scanf("%d",&req[i]);
     printf("enter initial head position : ");
     scanf("%d",&init);
     for (i=0;i<n;i++)
     {
          total+=abs(req[i]-init);
          init=req[i];
     }
     printf("total head movements : %d",total);          
}
