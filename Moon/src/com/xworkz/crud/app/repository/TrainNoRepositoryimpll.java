package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.repository.TrainNoRepository;

public class TrainNoRepositoryimpll implements TrainNoRepository{
	

		private int[] trainNos=new int[TOTAL_TRAIN_NO_S];
		int position;
		
		@Override
		public void numbers(int trainNo) {
			System.out.println("invoking numbers data in "+this.getClass().getSimpleName());
			if(position<TOTAL_TRAIN_NO_S)
			{
				this.trainNos[position]=trainNo;
				System.out.println("Stored "+trainNo+" at position "+this.position);
				this.position++;
			}
			else
			{
				System.err.println("Stored train no is more than total train no's");
			}

		}
		
		@Override
		public boolean isExist(int trainNo) {
			for(int index=0; index<this.position; index++)
			{
				int temp=this.trainNos[index];
				if(temp!=0 && temp==trainNo)
				{
					System.err.println("Tarin no is exist..");
					return true;
				}
			}
			return false;
		}

}
