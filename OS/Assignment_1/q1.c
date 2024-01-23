#include<stdio.h>
int main(){
    int n,i,p[10],m,all[10][10],j,max[10][10],av[10],need[10][10];
    char res;
    printf("\n Enter total no. of process :");
    scanf("%d",&n);
    printf("\n Enter total no. of  resources :");
    scanf("%d",&m);
    printf("\n Enter allocation matrix :");
    for ( i = 0; i < n; i++)
    {
        printf("\nfor process p%d :",i);
        for ( j = 0; j < m; j++)
        {
            scanf("%d",&all[i][j]);
        }
    }
    printf("\nEnter Max Matrix :");
    for ( i = 0; i < n; i++)
    {
        printf("\nfor process p%d :",i);
        for ( j = 0; j < m; j++)
        {
            scanf("%d",&max[i][j]);
        }
    }
    printf("\n Available :");
    for ( i = 0; i < m; i++)
    {
        scanf("%d",&av[i]);
    }
    printf("Now, Displaying the Allocation mAtrix");
    
    printf("\n Allocation");
    for(i=0;i<n;i++)
    {
        printf("\n p%d\t",i);
        for(j=0;j<m;j++)
            printf("%d\t",all[i][j]);
    }
    printf("\n Max Matrix");
    for ( i = 0; i < n; i++)
    {
        printf("\n p%d\t",i);
        for(j=0;j<m;j++)
            printf("%d\t",max[i][j]);
    }
    printf("\nNeed :");
    for(i=0;i<n;i++)
    {
        printf("\n p%d \t",i);
        for(j=0;j<m;j++)
        {
            need[i][j]=max[i][j]-all[i][j];
            printf("%d\t ",need[i][j]);
        }
    }
    printf("\n Available :");
    for ( i = 0; i < n; i++)
    {
        if(i==0)
        {
            for(j=0;j<m;j++)
            {
                printf("%d\t",av[j]);
            }
        }
    }
    return 0;
    
}
