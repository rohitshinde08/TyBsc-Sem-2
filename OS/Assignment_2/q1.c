#include<stdio.h>
int main()
{
    int n,i,start,l,op;
    char fname[20];
    printf("Enter the number of block in disk :");
    scanf("%d",&n);
    int blocks[n];
    for (i=0;i<n;i++)
        blocks[i]=0;
    while (1)
    {
          printf("\n1.Create New File : \n2.Delete : \n3.Display Disk Status : \n2.Exit :");
          printf("\nEnter the choice : ");
          scanf("%d",&op);
          switch (op)
          {
                 case 1: printf("Enter File Name :");
                         scanf("%s",&fname);
                         printf("Enter the number of blocks in disk :");
                         scanf("%d",&start);
                         printf("Enter the length file :");
                         scanf("%d",&l);
                         if (start+l>n)
                            printf("\n\nError....");
                         else
                            for (i=start;i<start+l;i++)
                                if (blocks[i]!=0)
                                {
                                    printf("\nFile already created.");
                                    break;
                                }
                         if (i=start+l)
                             for (i=start;i<start+l;i++)
                                 blocks[i]=1;
                         printf("\nFile created successfully");
                         break;
                 case 2: printf("Enter File Name :");
                         scanf("%s",&fname);
                         printf("Enter the starting of blocks no. :");
                         scanf("%d",&start);
                         printf("Enter the length file :");
                         scanf("%d",&l);
                         for (i=start;i<start+l;i++)
                             if (blocks[i]==0)
                                {
                                    printf("\nFile not found.");
                                    break;
                                }
                         if (i=start+l)
                             for (i=start;i<start+l;i++)
                                 blocks[i]=0;
                         printf("\nFile deleted successfully");
                         break;
                 case 3: for (i=0;i<n;i++)
                             if (blocks[i]==0)
                                printf("Block %d free\n",i);
                             else
                                printf("Block %d Allocated\n",i);
                         break;
                 case 4: return 0;
                 default:printf("Invalid choice.....");
          }
    }
}
