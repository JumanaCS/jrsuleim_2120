public class BoxCar extends TrainCar{
	public BoxCar(TrainCar nextCar){
		super(nextCar);
	}

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
}