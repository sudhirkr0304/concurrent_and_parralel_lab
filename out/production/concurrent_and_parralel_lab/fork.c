#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

#include<sys/types.h>

void countfun(FILE * filepointer , FILE *filepointer2)
{
	
	if(fork() == 0)
	{
		//child process 1
		printf("child process 1 : %d",getpid());
		
		if( fork()  == 0)
		{
			//child process 2
			printf("child process 2 : %d",getpid());
			if(fork() == 0)
			{
				//child process 3
				printf("child process 3 : %d",getpid());
			}
			else
			{
				//parent process
				printf("parent process : %d ",getpid());
				
			}
		}
		else
		{
			//parent process
			printf("parent process : %d ",getpid());
		}
	}
	else
	{
	   //parent process
	   printf("parent process : %d ",getpid());
	}
	
	    int i;
	    for(i=1;i<=100;i++)
	    {
	    	 //o reading
	    	 int num;
		     filepointer = fopen("count.txt","r");
		     fscanf(filepointer,"%d",&num);
	         printf("%d",num);
	         fclose(filepointer);
	         printf(" read operation %d : %d",i,num);
		
		     //writing
		     filepointer2 = fopen("count.txt","w");
	       	 fprintf(filepointer2 , "%d" , num+1);
		     fclose(filepointer2);
		     printf(" write operation %d : %d",i,num);
		}
	   
	
}
int main()
{
	//file pointer
	FILE* filepointer;
	FILE* filepointer2;
	countfun(filepointer,filepointer2);

}
