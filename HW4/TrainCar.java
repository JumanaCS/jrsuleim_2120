public abstract class TrainCar{
	protected double itsDistanceFromHome;
	protected TrainCar itsNextConnectedCar;

	public TrainCar(TrainCar nextCar){
		this.itsNextConnectedCar = nextCar;
		this.itsDistanceFromHome = 0.0;
	}

	public abstract void advance(double howFar);
	public abstract Boolean isMemberOfValidTrain();
}