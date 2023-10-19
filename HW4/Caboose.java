public class Caboose extends TrainCar{
	public Caboose(TrainCar nextCar){
		super(nextCar);
	}

	@Override
	public void advance(double howFar){
		super.itsDistanceFromHome = this.itsDistanceFromHome;
	}

	@Override
	public boolean isMemberOfValidTrain(){
		if(this.itsNextConnectedCar.equals(super.itsNextConnectedCar))
			return true;

		return false;
	}
}