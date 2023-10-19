public class Engine extends TrainCar{
	public Engine(TrainCar nextCar){
		super(nextCar);
	}

	@Override
	public void advance(double howFar){
		super.itsDistanceFromHome = this.itsDistanceFromHome;
	}

	@Override
	public Boolean isMemberOfValidTrain(){
		if(this.isNextConnectedCar.equals(super.isNextConnectedCar))
			return true;

		return false;
	}
}