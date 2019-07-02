#include<stdio.h>
#include<conio.h>
void main()
{
    int i,n,j,count=0;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    printf("%d\t",a[i]);
                    count=count+1;
                }
            }
        }
        if(count==0)
            {
                 printf("unique");
            }
    getch();
}
