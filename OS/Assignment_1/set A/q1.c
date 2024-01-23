#include<stdio.h>
void main()
{
     int n,i,p[10],r,a[10][10],j,max[10][10],av[10],need[10][10];
     char res;
     printf("Enter the No. of Processes : ");
     scanf("%d",&n);
     printf("\nEnter the No. of Resources : ");
     scanf("%d",&r);
     printf("Enter the Allocation Matrix : ");
     for (i=0;i<n;i++)
         for (j=0;j<r;j++)
             scanf("%d",&a[i][j]);
     
     printf("\n Enter Max Allocation Matrix : ");
     for (i=0;i<n;i++)
         for (j=0;j<r;j++)
             scanf("%d",&max[i][j]);
     
     printf("\n Enter Available : ");
     for (i=0;i<r;i++)
         scanf("%d",&av[i]);
     printf("\nAllocation Matrix : ");
     for (i=0;i<n;i++)
     {
         printf("\n");
         for (j=0;j<r;j++)
             printf("%d\t",a[i][j]);
     }
     printf("\n Max Allocation Matrix");
    for ( i=0;i<n;i++)
    {
        printf("\np%d\t",i);
        for(j=0;j<r;j++)
            printf("%d\t",max[i][j]);
    }
     printf("\nNeed : ");
     for (i=0;i<n;i++)
     {
         printf("\n%d\t",i);
         for (j=0;j<r;j++)
         {
             need[i][j]=max[i][j]-a[i][j];
             printf("%d\t",need[i][j]);
         }
     }
     printf("\n Available : ");
     for (i=0;i<n;i++)
         if (i==0)
            for (j=0;j<r;j++)
                printf("%d\t",av[j]);
}
