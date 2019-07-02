#include<stdio.h>
#include<conio.h>
void main()
{
    int i,N,j,count=0;
    scanf("%d",&N);
    int a[N];
    for(i=0;i<N;i++)
    {
        scanf("%d",&a[i]);
    }
        for(i=0;i<N;i++)
        {
            for(j=i+1;j<N;j++)
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
