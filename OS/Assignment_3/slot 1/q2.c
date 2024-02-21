#include<stdio.h>
#include<stdlib.h>
void main()
{
     int i,n,init,total=0,minD,index,temp,dist,j;
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
          minD = abs(req[i]-init);
          index = i;
          for (j=i+1;j<n;j++)
          {
              dist = abs(req[j]-init);
              if (dist<=minD)
              {
                 minD = dist;
                 index = j;
              }
          }
          total+=minD;
          temp=req[i];
          req[i]=req[index];
          req[index]=temp;
          init=req[i];
     }
     printf("total head movements : %d",total);          
}
