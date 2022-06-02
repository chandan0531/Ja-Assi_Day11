package com.Assi.Q2;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String company, String... model) {
		int count = 0;
		for (int i = 0; i < model.length; i++) {
			for(int j=0; j<outdatedModels.length; j++)
			{
				if(model[i]==outdatedModels[j])
				{
					System.out.println(outdatedModels[j] + "_OUTDATED");
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("new mobile");
		}
	}
}
