	public static void main(String[] args) {
		int[] ranks = {2, 65, 78, 8, 95};
		for(int i = 0; i < ranks.length; i++)
		{
			System.out.println("Ranks " + ranks[i]);
		}
			for (int j : ranks) 
			{
				System.out.println("Ranks are " + j * 2);
			
				/*for (int d : ranks)
				{
					System.out.println("Ranks delited" + d /3 );
				}	*/
			}	
	}