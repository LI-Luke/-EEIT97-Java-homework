package tw.luke.myproject.homework;

public class Hw4 {
	int[]card=new int[52];
	int play=52;
	int[]play1=new int[26];
	int[]play2=new int[26];
	int count=0;
	public void deal(){
		int i=0;
		int j=0;		
		while(true)
		{
			int cardNumber=(int)(Math.random()*52)+1;
			if(card[cardNumber-1]==1)
			{
				continue;
			}else
			{
				//System.out.println("cardNumber:"+cardNumber);
				card[cardNumber-1]=1;
				count++;
				if(count%2!=0)
				{
					play1[i]=cardNumber;
					System.out.println("player1:"+play1[i]);
					i++;
				}else{
					play2[j]=cardNumber;
					System.out.println("player2:"+play2[j]);
					j++;
				}
				
			}
			if(count==play)
			{
				break;
			}
		}
	}
	public void print()
	{
		for(int i=0;i<card.length;i++)
		{
			
		}
	}

	public static void main(String[] args) 
	{
		Hw4 test=new Hw4();
		test.deal();
	}

}
