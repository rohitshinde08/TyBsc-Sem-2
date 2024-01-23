#include<stdio.h>
int main(){
    int k=0,a=0,b=0,inst[10],av[5],al[10][5],n[10][5],m[10][5],pro,p[10],re,cnt=0,i,j,op[10];
    printf("\n Enter total no. of resources:");
    scanf("%d",&re);
    printf("\n Enter total no. of process :");
    scanf("%d",&pro);
    printf("\n Enter the allocation matrix :");
    for ( i = 0; i < re; i++)
    {
        printf("\t%c",(i+97));
    }
    printf("\n");
    for(i=0;i<pro;i++)
    {
        p[i]=i;
        printf("p[%d]:",p[i]);
        for(j=0;j<re;j++)
        {
            scanf("%d",&al[i][j]);
            av[j]+=al[i][j];
        }
    }
    printf("\nEnter Max Matrix :");
     for(i=0;i<re;i++){
        printf("\t%c",(i+97));
        av[i]=inst[i]-av[i];
     }  
     printf("\n");
    for ( i = 0; i < pro; i++)
    {
        printf("\np[%d]:",i);
        for ( j = 0; j < re; j++)
        {
            scanf("%d",&m[i][j]);
        }
    }
    printf("\n Available :");
    for ( i = 0; i < re; i++)
    {
        scanf("%d",&av[i]);
    }
    printf("\n");
    printf("\n Allocation");
    for(i=0;i<pro;i++)
    {
        printf("\n p%d\t",i);
        for(j=0;j<re;j++)
            printf("%d\t",al[i][j]);
    }
    printf("\n Max Matrix");
    for ( i = 0; i < pro; i++)
    {
        printf("\n p%d\t",i);
        for(j=0;j<re;j++)
            printf("%d\t",m[i][j]);
    }
    A:a=-1;
    for(i=0;i<pro;i++)
    {
        cnt=0;
        b=p[i];
        for(j=0;j<re;j++)
        {
            n[b][j]=m[b][j]-al[b][j];
            if(n[b][j]<=av[j])
                cnt++;
        }
        if(cnt==re)
        {
            op[k++]=p[i];
            for(j=0;j<re;j++)
                av[j]+=al[b][j];
        }
        else
            p[++a]=p[i];
    }
    if(a!=-1)
    {
        pro=a+1;
        goto A;
    }
    printf("\n\n\n safe sequance is ");
    for ( i = 0; i < k; i++)
    {
        printf("p%d ",op[i]);
    }
    printf(">");
    return 0;
    
}
