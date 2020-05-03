public class Solution {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);

    	int len=sc.nextInt();


        int i=0,k=0,j=0,top=0,down=len-1,right=len-1,left=0,dir=0;
        int A[][]=new int[len][len];
        for(i=0;i<len;i++){
        	for(j=0;j<len;j++){
        		A[i][j]=sc.nextInt();
        	}
        }
        int len=A.length;
        int B[][]=new int[len][len];
        int C[]=new int[len*len];
        while(left<=right&&top<=down){
        	if(dir==0){
        		for(i=left;i<=right;i++){
        			C[k]=A[top][i];
        			k++;
        		}
        		top++;
        		dir=1;
        	}
        	else if(dir==1){
        		for(i=top;i<=down;i++){
        			C[k]=A[i][right];
        			k++;
        		}
        		right--;
        		dir=2;
        	}
        	if(dir==2){
        		for(i=right;i>=left;i--){
        			C[k]=A[down][i];
        			k++;
        		}
        		down--;
        		dir=3;
        	}
        	if(dir==3){
        		for(i=down;i>=top;i--){
        			C[k]=A[i][left];
        			k++;
        		}
        		left++;

        	}
        	else{
        		dir=dir%4;
        	}
        }

        k=0;
        for(i=0;i<len;i++){
            for(int j=0;j<len;j++){
            	B[i][j]=C[k];
            	k++;
                
            }
        }
    }
}
