#include<stdio.h>
int main()
{
	int n,m;
	int a[100][100];
	scanf("%d %d",&n,&m);
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			printf("%d \t",a[i][j]);
		}
		printf("\n");
	}
	int x,y;
	int flag=0;
	int b[100][100];
	int count=0;
	scanf("%d %d",&x,&y);
	for(int i=0;i<x;i++)
	{
		for(int j=0;j<y;j++)
		{
			scanf("%d",&b[i][j]);
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			if(b[0][0]==a[i][j])
			{
				count=0;
				for(int r=0;r<x;r++)
				{
					for(int s=0;s<y;s++)
					{
						if(b[r][s]==a[i+r][j+s])
						{
							count++;
							if(count==x*y)
							{
								printf("YES\n%d %d\n",i,j);
								flag=1;
							}
						}
					}
				}
			}

		if(flag==1)
			break;
		}
		if(flag==1)
			break;
	}
	if(flag==0)
		printf("NO\n");


	
}