public class TrainRunner{
	public static void main(String[] args){
		TrainCar traincCar = null;
		Train train = new Train();
		TrainCar trainCar1 = new TrainCar(trainCar){
			@Override
			public void advance(double howFar){
				super.itsDistanceFromHome = this.itsDistanceFromHome;
			}

			@Override
			public Boolean isMemberOfValidTrain(){
				if(this.itsNextConnectedCar.equals(super.itsNextConnectedCar))
					return true;

				return false;
			}
		};

		train.setEngine(new Engine(trainCar1));
		boolean i = train.engine.isMemberOfValidTrain();
		System.out.println(i);
	}
}